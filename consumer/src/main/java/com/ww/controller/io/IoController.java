package com.ww.controller.io;


import java.io.*;

/**
 * Created by 安利丹 on 2020/3/5.
 */
public class IoController {

    public static void main(String[] args) {

        // 将字节流转换为字符流
        File file = new File("C:\\Users\\安利丹\\Desktop\\test.txt");
        try {
            InputStream outputStream = new FileInputStream(file);
            Reader w = new InputStreamReader(outputStream);
            String a ="";
            w.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
