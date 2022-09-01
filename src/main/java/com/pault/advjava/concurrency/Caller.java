package com.pault.advjava.concurrency;

import java.util.concurrent.Executor;

public class Caller implements Executor {

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
