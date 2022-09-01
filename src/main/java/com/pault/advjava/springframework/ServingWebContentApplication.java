package com.pault.advjava.springframework;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
        log.info("Starting up....");
        SpringApplication.run(ServingWebContentApplication.class, args);
    }
}
