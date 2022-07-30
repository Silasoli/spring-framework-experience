/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.inversaoDeControle;

/**
 *
 * @author silas
 */
public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.gravar();
        // TODO code application logic here
    }
    
    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();
    
    public void gravar(){
        this.enviar.retornar("Pedido Criado!s");
    }
}
