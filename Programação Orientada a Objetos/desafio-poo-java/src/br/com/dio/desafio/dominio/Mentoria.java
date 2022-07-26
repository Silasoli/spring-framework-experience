/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author silas
 */
public class Mentoria extends Conteudo {

    private Set<Tutor> tutoresDaMentoria = new HashSet<>();
    private LocalDate data;

    public Mentoria() {
    }

    public Set<Tutor> getTutoresDaMentoria() {
        return tutoresDaMentoria;
    }

    public void setTutoresDaMentoria(Set<Tutor> tutoresDaMentoria) {
        this.tutoresDaMentoria = tutoresDaMentoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", description=" + getDescription() + ", data=" + data + '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
