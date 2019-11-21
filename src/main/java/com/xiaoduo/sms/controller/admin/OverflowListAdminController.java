package com.xiaoduo.sms.controller.admin;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Log;
import com.xiaoduo.sms.entity.OverflowList;
import com.xiaoduo.sms.entity.OverflowListGoods;
import com.xiaoduo.sms.service.LogService;
import com.xiaoduo.sms.service.OverflowListGoodsService;
import com.xiaoduo.sms.service.OverflowListService;
import com.xiaoduo.sms.service.UserService;
import com.xiaoduo.sms.util.DateUtil;
import com.xiaoduo.sms.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 报溢单Controller类
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/admin/overflowList")
public class OverflowListAdminController {

    @Autowired
    private OverflowListService overflowListService;

    @Autowired
    private OverflowListGoodsService overflowListGoodsService;

    @Autowired
    private LogService logService;

    @Autowired
    private UserService userService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
    }

    /**
     * 根据条件分页查询报溢单信息
     *
     * @param overflowList //	 * @param page
     *                     //	 * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @RequiresPermissions(value = {"报损报溢查询"})
    public Map<String, Object> list(OverflowList overflowList) throws Exception {
        Map<String, Object> resultMap = new HashMap<>();
//        List<OverflowList> overflowListList = overflowListService.list(overflowList, Direction.DESC, "overflowDate");
//        resultMap.put("rows", overflowListList);
        return resultMap;
    }

    /**
     * 根据报溢单id查询所有报溢单商品
     *
     * @param overflowListId
     * @return
     * @throws Exception
     */
    @RequestMapping("/listGoods")
    @RequiresPermissions(value = {"报损报溢查询"})
    public Map<String, Object> listGoods(Integer overflowListId) throws Exception {
        if (overflowListId == null) {
            return null;
        }
        Map<String, Object> resultMap = new HashMap<>();
        List<OverflowListGoods> overflowListGoodsList = overflowListGoodsService.listByOverflowListId(overflowListId);
        resultMap.put("rows", overflowListGoodsList);
        return resultMap;
    }


    /**
     * 获取报溢单号
     *
     * @param type
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/getOverflowNumber")
    @RequiresPermissions(value = {"商品报溢"})
    public String genBillCode(String type) throws Exception {
        StringBuffer biilCodeStr = new StringBuffer();
        biilCodeStr.append("BY");
        biilCodeStr.append(DateUtil.getCurrentDateStr()); // 拼接当前日期
        String overflowNumber = overflowListService.getTodayMaxOverflowNumber(); // 获取当天最大的报溢单号
        if (overflowNumber != null) {
            biilCodeStr.append(StringUtil.formatCode(overflowNumber));
        } else {
            biilCodeStr.append("0001");
        }
        return biilCodeStr.toString();
    }

    /**
     * 添加报溢单 以及所有报溢单商品 以及 修改商品的成本均价
     *
     * @param overflowList
     * @param goodsJson
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/save")
    @RequiresPermissions(value = {"商品报溢"})
    public Map<String, Object> save(OverflowList overflowList, String goodsJson) throws Exception {
        Map<String, Object> resultMap = new HashMap<>();
        overflowList.setUser(userService.findByUserName((String) SecurityUtils.getSubject().getPrincipal())); // 设置操作用户
        Gson gson = new Gson();
        List<OverflowListGoods> plgList = gson.fromJson(goodsJson, new TypeToken<List<OverflowListGoods>>() {
        }.getType());
        overflowListService.save(overflowList, plgList);
        logService.save(new Log(Log.ADD_ACTION, "添加报溢单"));
        resultMap.put("success", true);
        return resultMap;
    }


}
