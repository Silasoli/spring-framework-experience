/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.inversaoDeControle;

/**
 *
 * @author silas
 */
public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha) {

    }

    public static EnviarEmails obterDadosEmail() {
        return new EnviarEmails("stmp", "contato@gmail.com", "password");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado!");
    }
}
