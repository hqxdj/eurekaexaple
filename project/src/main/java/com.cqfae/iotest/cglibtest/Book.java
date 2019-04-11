package com.cqfae.iotest.cglibtest;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-09 16:45
 */

public class Book {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public void buyBook(){
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i buy a book!");
    }
}
