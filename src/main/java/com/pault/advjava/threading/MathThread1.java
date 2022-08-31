package com.pault.advjava.threading;

public class MathThread1 extends Thread {

    MathUtils mu;

    public MathThread1(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiples(2);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

