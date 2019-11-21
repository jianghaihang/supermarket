package com.xiaoduo.sms.config;

import java.util.LinkedHashMap;
import java.util.Map;

import com.xiaoduo.sms.realm.MyRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * Shiro配置类
 */
//@Component
@Lazy
@Configuration
@Component
public class ShiroConfig {

    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * <p>
     *      注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在
     *           初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     * <p>
     * Filter Chain定义说明
     * 1、一个URL可以配置多个Filter，使用逗号分隔
     * 2、当设置多个过滤器时，全部验证通过，才视为通过
     * 3、部分过滤器可指定参数，如perms，roles
     */
//    @Lazy
    @Bean
    public ShiroFilterFactoryBean shirFilter(@Qualifier("securityManager") SecurityManager securityManager) {

        // shiro过滤器工厂
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/login.html");
//        shiroFilterFactoryBean.setLoginUrl("/loginTwo.html");


        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/user/login", "anon");
        filterChainDefinitionMap.put("/drawImage", "anon");

        // 配置退出过滤器,其中的具体的退出代码Shiro已经替我们实现了
        filterChainDefinitionMap.put("/logout", "logout");


        // <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterChainDefinitionMap.put("/**", "authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        System.err.println("Shiro's getShiroFilterFactoryBean");

        return shiroFilterFactoryBean;
    }

//    @Lazy
    @Bean(name = "securityManager")
    public SecurityManager securityManager(@Qualifier("myRealm") MyRealm myRealm) {

        // 使用默认的web安全管理员
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        // 设置realm.
        securityManager.setRealm(myRealm);

        System.err.println("Shiro's securityManager");

        return securityManager;
    }

    /**
     * 身份认证realm; (这个需要自己写，账号密码校验；权限等)
     * @return
     */
//    @Lazy
    @Bean(name = "myRealm")
    public MyRealm myRealm() {

        MyRealm myRealm = new MyRealm();

        System.err.println("Shiro's myRealm");

        return myRealm;
    }

    /**
     * Shiro生命周期处理器
     *  LifecycleBeanPostProcessor中将Initializable和Destroyable的实现类统一在其内部调用了Initializable.init()和Destroyable.destroy()方法，从而达到管理
     *  shiro bean的生命周期的目的
     *
     *  注：
     *      配置shiro，不需要配置生命周期处理器，shiro框架整合spring时，这个事情不会交给使用者去做，自己会注入处理器。
     *      查看shiro-spring jar下面的config包里的ShiroBeanConfiguration，已经注入了。在此注入纯属多此一举
     * @return
     */
//    @Lazy
//    @Bean(name = "lifecycleBeanPostProcessor")
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//
//        System.err.println("Shiro's lifecycleBeanPostProcessor");
//
//        return new LifecycleBeanPostProcessor();
//    }

    /**
     * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
     * @return
     */
//    @DependsOn({"lifecycleBeanPostProcessor"})
//    @Lazy
//    @Bean
//    @Qualifier("lifecycleBeanPostProcessor")
//    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
//
//        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//
//        advisorAutoProxyCreator.setProxyTargetClass(true);
//
//        System.err.println("Shiro's advisorAutoProxyCreator");
//
//        return advisorAutoProxyCreator;
//    }

//    @Lazy
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
//            @Qualifier("myRealm") MyRealm myRealm) {
//
//        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
//
//        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager(myRealm));
//
//        System.err.println("Shiro's authorizationAttributeSourceAdvisor");
//
//        return authorizationAttributeSourceAdvisor;
//    }

}
