package com.xiaoduo.sms.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.GoodsUnit;
import com.xiaoduo.sms.entity.Log;
import com.xiaoduo.sms.service.GoodsUnitService;
import com.xiaoduo.sms.service.LogService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台管理商品单位Controller
 */
@RestController
@RequestMapping("/admin/goodsUnit")
public class GoodsUnitAdminController {

	@Autowired
	private GoodsUnitService goodsUnitService;
	
	@Autowired
	private LogService logService;
	
	@RequestMapping("/comboList")
	@RequiresPermissions(value = { "商品管理" })
	public List<GoodsUnit> comboList()throws Exception{
		return goodsUnitService.listAll();
	}
	
	/**
	 * 查询所有商品单位
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/listAll")
	@RequiresPermissions(value = { "商品管理","进货入库"},logical=Logical.OR)
	public Map<String,Object> listAll()throws Exception{
		List<GoodsUnit> goodsUnitList=goodsUnitService.listAll();
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("rows", goodsUnitList);
		logService.save(new Log(Log.SEARCH_ACTION,"查询商品单位信息")); // 写入日志
		return resultMap;
	}
	
	/**
	 * 添加商品单位
	 * @param goodsUnit
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	@RequiresPermissions(value = { "商品管理","进货入库"},logical=Logical.OR)
	public Map<String,Object> save(GoodsUnit goodsUnit)throws Exception{
		Map<String, Object> resultMap = new HashMap<>();
		logService.save(new Log(Log.ADD_ACTION,"添加商品单位信息"+goodsUnit)); 
		goodsUnitService.save(goodsUnit);
		resultMap.put("success", true);
		return resultMap;
	}
	
	/**
	 * 删除商品单位信息
	 * @param id
//	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	@RequiresPermissions(value = { "商品管理","进货入库"},logical=Logical.OR)
	public Map<String,Object> delete(Integer id)throws Exception{
		Map<String, Object> resultMap = new HashMap<>();
		logService.save(new Log(Log.DELETE_ACTION,"删除商品单位信息"+goodsUnitService.findById(id)));  // 写入日志
		goodsUnitService.delete(id);				
		resultMap.put("success", true);
		return resultMap;
	}
	
}
