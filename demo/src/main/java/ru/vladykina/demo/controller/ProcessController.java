package ru.vladykina.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladykina.demo.service.ProcessService;

@RestController
public class ProcessController {
    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello!";
    }

    @GetMapping("test/process")
    public String process(){
        return processService.process();
    }
}
