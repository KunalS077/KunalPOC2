package com.springdocker.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NumController {
    
    @PostMapping("/numbers")
    public int countDigits(@RequestBody Map<String, Integer> requestBody) {
        int number = requestBody.get("number");
        int count = 0;
        
        while (number > 0) {
            count++;
            number /= 10;
        }
        
        return count;
    }
    @GetMapping("/message")
    public String msg() {
    	return "Welcome message";
    }
}
