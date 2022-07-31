/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author silas
 */
@RestController
public class TestController {

    @GetMapping("/test/unit")
    public String saudacao(String nome) {
        return String.format("Bem vindo, %s", nome);
    }

    @GetMapping("/test/int")
    public String saudacao2(@RequestParam(name = "nome", defaultValue = "DIO") String nome) {
        return String.format("Bem-vindo, %s", nome);
    }
}
