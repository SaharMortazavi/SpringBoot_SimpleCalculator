package com.sahar.CalculatorProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    @Autowired
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculator.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculator.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculator.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculator.divide(a, b);
    }
}

