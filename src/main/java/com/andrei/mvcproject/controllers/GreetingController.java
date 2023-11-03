package com.andrei.mvcproject.controllers;

import com.andrei.mvcproject.models.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Slf4j
@Controller
public class GreetingController {
    @GetMapping("/greetings")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        log.info("Get greeting form was called {}", LocalDateTime.now());

        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
//        log.info("Post greeting form was closed {}", LocalDateTime.now());

        return "result";
    }
}
