package com.pault.advjava.threading;

public class MathThread2 implements Runnable {

    MathUtils mu;

    public MathThread2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            mu.getMultiples(3);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

