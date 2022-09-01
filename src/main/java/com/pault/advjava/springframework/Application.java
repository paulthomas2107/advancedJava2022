package com.pault.advjava.springframework;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@Log
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        log.info("Starting Application.....");
        ApplicationContext ctx = SpringApplication.run(Application.class);

        System.out.println("Inspect beans provided by Spring Boot...");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
