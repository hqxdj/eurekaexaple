package com.cqfae.iotest.cglibtest;

import net.sf.cglib.proxy.Enhancer;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-10 11:03
 */

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Book.class);
        enhancer.setCallback(new ProxyMethodInterceptor());
        Book book = (Book) enhancer.create();
        book.buyBook();
    }
}
