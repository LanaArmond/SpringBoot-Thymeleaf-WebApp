package net.javaguides.sbtwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workers")
public class WorkerController {

    @GetMapping("/register")
    public String register(){
        return "/worker/register";
    }

    @GetMapping("/list")
    public String list(){
        return "/worker/list";
    }
}
