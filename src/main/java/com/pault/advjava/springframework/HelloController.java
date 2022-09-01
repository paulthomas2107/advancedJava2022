package com.pault.advjava.springframework;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello from Spring Boot !.....";
    }
}
