package com.cqfae.iotest;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-04-04 16:08
 */

public class Monitor {
   private static ThreadLocal local = new ThreadLocal<>();

   public static void start(){
       local.set(System.currentTimeMillis());
   }

   public static void finish(String methodName){
       long finishTime = System.currentTimeMillis();
       System.out.println(methodName + "耗时"+ (finishTime - Long.valueOf(methodName))+"ms");
   }
}
