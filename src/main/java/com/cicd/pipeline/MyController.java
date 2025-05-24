package com.cicd.pipeline;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/")
public class MyController {

    @RequestMapping("test")
    public String helloWorld() {
        return "Application is working!";
    }


}
