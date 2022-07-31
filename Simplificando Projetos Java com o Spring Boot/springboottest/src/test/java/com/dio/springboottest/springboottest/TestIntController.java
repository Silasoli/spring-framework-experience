/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.springboottest.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

/**
 *
 * @author silas
 */
@WebMvcTest
@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = "com.dio")
public class TestIntController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder requisicao = get("/test/int");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem-vindo, DIO", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception {
        mvc.perform(get("/test/int?nome=Silas"))
                .andExpect(content().string("Bem-vindo, Silas"));
    }

}
