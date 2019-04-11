package com.cqfae.iotest;

import java.lang.reflect.Proxy;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-04 15:39
 */

public class ProxyTest {
    public static void main(String[] args) {
        Person student = new Student("张三");
        StuInvocation studentStuInvocation = new StuInvocation(student);
        Person proxyInstance =
                (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),student.getClass().getInterfaces(),studentStuInvocation);
        proxyInstance.givePen();
    }
}
