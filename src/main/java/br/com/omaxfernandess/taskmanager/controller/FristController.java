package br.com.omaxfernandess.taskmanager.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fristRoute")
public class FristController {

    @GetMapping("/")
    public String fristMethod() {
        return "Frist method";
    }
}
