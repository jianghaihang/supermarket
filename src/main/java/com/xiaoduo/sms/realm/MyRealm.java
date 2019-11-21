package com.xiaoduo.sms.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.xiaoduo.sms.entity.Menu;
import com.xiaoduo.sms.entity.Role;
import com.xiaoduo.sms.entity.User;
import com.xiaoduo.sms.mapper.MenuMapper;
import com.xiaoduo.sms.mapper.RoleMapper;
import com.xiaoduo.sms.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * 自定义Realm : 领域、范围
 */
public class MyRealm extends AuthorizingRealm {

    // 用户仓库
//    @Resource
//    @Qualifier("userMapper")
    @Autowired
    private UserMapper userMapper;

    // 权限仓库
    @Autowired
    private RoleMapper roleMapper;

    // 菜单仓库
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        // 通过SecuriryUtils获取subject, 在通过subject 获取到principal(当事人)
        String userName = (String) SecurityUtils.getSubject().getPrincipal();

        User user = userMapper.findByUserName(userName);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        List<Role> roleList = roleMapper.findByUserId(user.getId());

        Set<String> roles = new HashSet<String>();

        for (Role role : roleList) {

            roles.add(role.getName());

            List<Menu> menuList = menuMapper.findByRoleId(role.getId());

            for (Menu menu : menuList) {

                info.addStringPermission(menu.getName()); // 添加权限
            }
        }
        info.setRoles(roles);

        return info;
    }

    /**
     * 权限认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String userName = (String) token.getPrincipal();

        User user = userMapper.findByUserName(userName);

        if (user != null) {

            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), "xxx");

            return authcInfo;

        } else {

            return null;
        }
    }

}
