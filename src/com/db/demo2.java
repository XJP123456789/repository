package com.db;

/**
 * 只有经过长时间完成其发展的艰苦工作，
 * 并长期埋头沉浸于其中的任务，方可望有所成就。
 *
 * @author Ms.xiao
 * @data 2019/3/13 -- 20:32
 */
public class demo2 extends demo1{

    public demo2() {
        System.out.println("B");
    }
//    {
//        System.out.println("B1");
//    }

    static {
        System.out.println("B2");
    }

    public static void main(String[] args) {
        new demo2();

    }
}
