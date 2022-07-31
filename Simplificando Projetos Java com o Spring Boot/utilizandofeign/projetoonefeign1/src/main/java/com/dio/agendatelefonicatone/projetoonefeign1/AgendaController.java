/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.agendatelefonicatone.projetoonefeign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author silas
 */
@RestController
@RequestMapping("contato")
public class AgendaController {
    
    @GetMapping
    public Contato retornaContato(){
        return Contato.builder()
                .id(1L)
                .nome("丂丨ㄥ卂丂ㄖㄥ丨")
                .telefone("75 9 9999-9999")
                .build();
    }
    
}
