package com.webcalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("result", null);
        model.addAttribute("error", null);
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int a, @RequestParam int b,
                            @RequestParam String operation, Model model) {
        Integer result = null;
        String error = null;

        try {
            switch (operation) {
                case "add":
                    result = a + b;
                    break;
                case "subtract":
                    result = a - b;
                    break;
                case "multiply":
                    result = a * b;
                    break;
                case "divide":
                    if (b == 0) {
                        error = "Cannot divide by zero!";
                    } else {
                        result = a / b;
                    }
                    break;
                default:
                    error = "Unknown operation selected!";
            }
        } catch (Exception e) {
            error = "Error: " + e.getMessage();
        }

        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("operation", operation);
        model.addAttribute("result", result);
        model.addAttribute("error", error);

        return "index";
    }
}
