/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springbeans.utilizandoBeans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author silas
 */
public class Livro {

    private String nome;
    private String codigo;

    @Autowired
    AutorLivro autorLivro;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir() {
        System.out.println(this.nome + " - " + this.codigo);
        autorLivro.exibirAutor();
    }

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

}
