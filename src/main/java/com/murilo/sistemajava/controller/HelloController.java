package com.murilo.sistemajava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/ola/{nome}")

    public String hello(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }
}