package com.project.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Service
@RestController
public class PracticeService {

    @GetMapping("/greet")
    public String greet(){
        return "Hello There!!";
    }
}
