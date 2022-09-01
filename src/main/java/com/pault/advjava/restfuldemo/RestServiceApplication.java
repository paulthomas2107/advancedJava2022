package com.pault.advjava.restfuldemo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {

        log.info("Starting up app.....");
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
