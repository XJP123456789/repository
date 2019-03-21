package com.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * 只有经过长时间完成其发展的艰苦工作，
 * 并长期埋头沉浸于其中的任务，方可望有所成就。
 *
 * @author Ms.xiao
 * @data 2019/2/28 -- 21:20
 */
public class demo {


    public static void str1() {
        int[] str = {1, 2, 23, 21, 21, 121, 32, 1, 22, 21, 21, 21212, 21, 22};
        Set integers = new HashSet();
        for (int i = 0; i < str.length; i++) {
            integers.add(str[i]);
        }
        Object[] array = integers.toArray();
        System.out.println(integers);
        for (Object o : array) {
            System.out.println(o);
        }
    }

    public static void str() {
        String str = "abc#####def###ghij#########kl";
        String s = "";
        String[] split = str.split("#");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!(split[i].equals(""))) {
                list.add(split[i]);
            }
        }
        for (String s1 : list) {
            s += s1 + "#";
        }
        System.out.println(s);
        int length = s.length();
        String substring = s.substring(0, length - 1);
        System.out.println(substring);
    }


    public static void list1() {
        ArrayList<String> ss = new ArrayList<>();
        ArrayList<String> ss1 = new ArrayList<>();
        ss.add("Q1");
        ss.add("Q2");
        ss.add("Q3");
        for (String s : ss) {
            if (s.equals("Q3")) {
                ss1.add(s);
            }
        }
        for (String s1 : ss1) {
            System.out.println(s1);
        }
    }


    public static void getFile(String fileName, String fileName2) {
        File file = new File(fileName);
        File file0 = new File(fileName2);
        if (!file0.exists()) {
            file0.mkdir();
        } else if (file0.isDirectory()) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    for (File file1 : files) {
                        if (file1.isDirectory()) {
                            getFile(file1.getAbsolutePath(), null);
                        } else if (file1.getName().endsWith("java")) {
                            System.out.println("文件 " + file1.getAbsolutePath());

                        }
                    }
                } else if (file.getName().endsWith("java")) {
                    System.out.println("文件 " + file.getAbsolutePath());
                }

            } else {
                file.mkdir();
                getFile(fileName,fileName2);
            }
        }
    }
        public static void copyDir (String oldPath, String newPath) throws IOException {
            File file = new File(oldPath);
            //文件名称列表
            String[] filePath = file.list();

            if (!(new File(newPath)).exists()) {
                (new File(newPath)).mkdir();
            }

            for (int i = 0; i < filePath.length; i++) {
                if ((new File(oldPath + file.separator + filePath[i])).isDirectory()) {
                    copyDir(oldPath + file.separator + filePath[i], newPath + file.separator + filePath[i]);
                }

                if (new File(oldPath + file.separator + filePath[i]).isFile()) {
                    copyFile(oldPath + file.separator + filePath[i], newPath + file.separator + filePath[i]);
                }

            }
        }

        public static void copyFile (String oldPath, String newPath) throws IOException {
            File oldFile = new File(oldPath);
            File file = new File(newPath);
            FileInputStream fs = new FileInputStream(oldFile);
            FileOutputStream fo = new FileOutputStream(file);
            ;

            byte[] buffer = new byte[2097152];

            while ((fs.read(buffer)) != -1) {
                fo.write(buffer);
            }
        }

        public static void main (String[]args){
            getFile("D:\\git\\xjp\\www.java", "D:\\dd");
        }
    }
