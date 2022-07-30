/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springframework.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author silas
 */
public class Condutor {

    public static void main(String[] args) {
        Condutor contudor = new Condutor(new Carro());
        
        contudor.automovel();
    }

    @Autowired
    private Veiculo veiculo;
    
    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }

    public void automovel() {
        veiculo.acao();
    }
}
