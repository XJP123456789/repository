package com.db;

import java.util.ArrayList;

/**
 * 只有经过长时间完成其发展的艰苦工作，
 * 并长期埋头沉浸于其中的任务，方可望有所成就。
 *
 * @author Ms.xiao
 * @data 2019/2/28 -- 21:20
 */
public class demo {

    public static void str(){
        String str = "abc#####def###ghij#########kl";
        String s = "";
        String[] split = str.split("#");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if(!(split[i].equals(""))){
                list.add(split[i]);
            }
        }
        for (String s1 : list) {
            s+=s1+"#";
        }
        System.out.println(s);
        int length = s.length();
        String substring = s.substring(0, length - 1);
        System.out.println(substring);
    }
    public static void main(String[] args) {
        System.out.println(4&7);
        int num =10;
       int date = num++;
       System.out.println("date:"+date+"   num:"+num);

        int date1 = ++num;
        System.out.println("date:"+date1+"   num:"+num);

        ArrayList<String> ss = new ArrayList<>();
        ss.add("Q1");
        ss.add("Q2");
        ss.add("Q3");
        for (String s : ss) {
            if (s.equals("Q3")){
                System.out.println(s);
            }
        }
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
