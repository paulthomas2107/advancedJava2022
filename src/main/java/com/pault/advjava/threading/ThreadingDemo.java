package com.pault.advjava.threading;

public class ThreadingDemo {

    public static void main(String[] args) {

        System.out.println("Java version: "+System.getProperty("java.version"));
        int n = 10; // no of threads

        for (int i = 0;  i < n; i++)  {

            Thread t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
