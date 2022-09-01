package com.pault.advjava.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        executorInvoke();
        executorServiceInvoke();

    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor Sample.");
        });
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("Executor Service Sample.");
        });
    }
}
