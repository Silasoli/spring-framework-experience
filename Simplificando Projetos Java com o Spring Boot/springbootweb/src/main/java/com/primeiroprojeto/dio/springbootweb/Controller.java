
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primeiroprojeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author silas
 */

@RestController
public class Controller {
    
    @GetMapping("/")
    public String mensagem(){
        return "Primeiro projeto Spring Boot Web";
    }
    
}
