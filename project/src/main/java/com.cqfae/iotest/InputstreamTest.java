package com.cqfae.iotest;

import java.io.*;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-03-20 11:25
 */

public class InputstreamTest {

    public void outputstream() {
        File file = new File("D:/train/train.txt");
        try {
            FileOutputStream out = new FileOutputStream(file, true);
            String str = " hello world !";
            byte[] bytes = str.getBytes();
            out.write(bytes);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputStreamTest() {
        File file = new File("D:/train/train.txt");
        try {
//            FileInputStream intput = new FileInputStream(file);
//            while (intput.read() != -1){
//                System.out.print(String.valueOf(intput.read()));
//            }
//            intput.close();
            FileInputStream f = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(f));
            System.out.println(reader);
            System.out.println(reader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        for (int i = 0; i < 2; i++) {
//            new InputstreamTest().outputstream();
//        }
        new InputstreamTest().inputStreamTest();
    }



}
