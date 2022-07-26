/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author silas
 */
public class Tutor extends Pessoa {

    private String formacao;
    private String empresa;
    private Set<String> bootcampsMinistrados = new LinkedHashSet<>();

    public Tutor() {
    }

    public void ministrarBootcamp(Bootcamp bootcamp) {
        this.bootcampsMinistrados.add(bootcamp.getNome());
        bootcamp.getTutoresDoBootcamp().add(this);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Set<String> getBootcampsMinistrados() {
        return bootcampsMinistrados;
    }

    public void setBootcampsMinistrados(Set<String> bootcampsMinistrados) {
        this.bootcampsMinistrados = bootcampsMinistrados;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Tutor: " + getNome() + "," + getIdade() + " anos");
        System.out.println("Email: " + getEmail());
        System.out.println("Formação: " + getFormacao());
        System.out.println("Atualmente trabalha na empresa: " + getEmpresa());
        System.out.println("Bootcamps Ministrados: " + getBootcampsMinistrados());
    }
}
