package com.atguigu.java;


/**
 * @Author Xugp
 * #Description ThreadTest
 * #Date: 2021-02-05-17-45
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();

        t1.start();
        t2.start();

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                System.out.println("###" + i);
            }
        }

//            new Thread() {
//                public void run() {
//                    for (int i = 0;i <= 10000;i++) {
//                        if (! (i % 2 == 0)){
//                            System.out.println("***" + i);
//                        }
//                    }
//                }
//            }.start();
    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (!(i % 2 == 0)) {
                System.out.println("***" + i);
            }
        }
    }
}