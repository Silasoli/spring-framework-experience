/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springbeans.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author silas
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setCodigo("001");
        livro.setNome("Morro dos ventos uivantes");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Emily Bronte");

        livro.exibir();
        
        ((AbstractApplicationContext) factory).close();
        
    }

}
