package com.cqfae.iotest.cglibtest;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-09 16:48
 */

public class ProxyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代理开始前");
        Object invoke = proxy.invokeSuper(obj, args);
        System.out.println("代理开始后");
        return invoke;
    }
}
