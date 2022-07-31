
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.agendatelefonicatwo.projetoonefeign2;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author silas
 */
@Data
@Builder
public class Contato {

    private Long id;
    private String nome;
    private String telefone;
}
