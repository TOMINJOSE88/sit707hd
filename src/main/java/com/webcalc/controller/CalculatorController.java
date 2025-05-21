package com.webcalc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
