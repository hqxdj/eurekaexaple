package com.cqfae.iotest;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-04 15:40
 */

public class Student implements Person{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交50元费用！");
    }

    @Override
    public void givePen() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "借了我一直笔！");
    }

}
