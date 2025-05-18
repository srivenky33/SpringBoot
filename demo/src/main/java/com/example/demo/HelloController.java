package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    private HelloService helloservice;

    public HelloController(HelloService service)
    {
        this.helloservice=service;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name="user", defaultValue="world") String user)
    {
       return helloservice.greet(user);
    }

}
