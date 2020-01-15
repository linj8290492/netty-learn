package com.netty.pp;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author deke
 * @description Bio读取File
 * @date 2020/1/15
 */
public class BioReaderFile {

    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("D:\\myself\\BIO.txt");
        FileInputStream fileIn = new FileInputStream(file);
        BufferedReader re = new BufferedReader(new InputStreamReader(fileIn));

        String name = re.readLine();
        String age = re.readLine();
        String email = re.readLine();
        String phone = re.readLine();

        System.out.println(name+"------"+age+"-----"+email+"------"+phone);

    }

}
