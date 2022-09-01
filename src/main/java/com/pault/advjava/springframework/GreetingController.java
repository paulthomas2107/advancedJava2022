package com.pault.advjava.springframework;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue = "world") String name,
            Model model) {

        log.info("In greeting method.....");

        model.addAttribute("name", name);

        return "greeting";
    }

}
