package com.cqfae.iotest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-04 16:05
 */

public class StuInvocation<T> implements InvocationHandler {

    T target;

    public StuInvocation(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        Object result = method.invoke(target, args);
        System.out.println("动态代理结束");
        return result;
    }
}
