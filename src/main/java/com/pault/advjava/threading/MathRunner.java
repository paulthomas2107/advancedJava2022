package com.pault.advjava.threading;

public class MathRunner {

    public static void main(String[] args) {
        MathUtils obj = new MathUtils();

        MathThread1 t1 = new MathThread1(obj);
        Thread t2 = new Thread(new MathThread2(obj));

        t1.start();
        t2.start();



    }
}
