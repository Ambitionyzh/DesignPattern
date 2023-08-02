package com.java.factory.config;

import com.java.factory.factory.PaymentFactory;
import com.java.factory.pay.impl.AliPayment;
import com.java.factory.pay.impl.WechatPayment;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/8/2 20:35
 */
@Configuration
public class PaymentConfig {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean(){
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        //设置要代理的接口
        factoryBean.setServiceLocatorInterface(PaymentFactory.class);
        return factoryBean;
    }
    @Bean(name = "wechat")
    @Scope("prototype")
    public WechatPayment wechatPayment(){
        return new WechatPayment();
    }
    @Bean(name = "ali")
    @Scope("prototype")
    public AliPayment aliPayment(){
        return new AliPayment();
    }
}
