package org.example.service;

import org.example.domain.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class UserBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof UserService) {
            System.out.println("UserBeanPostProcessor BEFORE");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof UserService) {
            System.out.println("UserBeanPostProcessor AFTER");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
