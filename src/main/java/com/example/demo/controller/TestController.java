package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test", description = "Test API")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return ("Cau lidicky");
    }

    @GetMapping("/sum")
    @Operation(summary = "Sum", description = "Sum of two numbers")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/multiply")
    @Operation(summary = "Multiply", description = "Multiplying two numbers")
    public int multiply(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        return a * b * c;
    }

}
