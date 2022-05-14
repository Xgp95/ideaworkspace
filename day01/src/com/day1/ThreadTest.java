package com.day1;


/**
 * @Author Xugp
 * #Description ThreadTest
 * #Date: 2021-02-05-17-45
 */
public class ThreadTest {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start();
            
            new Thread() {
                public void run() {
                    for (int i = 0;i <= 100;i++) {
                        if (! (i % 2 == 0)){
                            System.out.println("****" + i);
                        }
                    }
                }
            }.start();
        }
    }

class MyThread extends Thread{

    public void run() {
        for (int i = 0;i <= 100;i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}
