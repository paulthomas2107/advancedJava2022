package com.pault.advjava.concurrency;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws RuntimeException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Task still in progress....waiting...");
                Thread.sleep(500);
            }

            System.out.println("Task now completed.");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println("Result: "+result);

            executorService.shutdown();

        }  catch (ExecutionException | InterruptedException | TimeoutException e) {
            future.cancel(true);
            future.isDone();
            throw new RuntimeException(e);
        }

    }
}
