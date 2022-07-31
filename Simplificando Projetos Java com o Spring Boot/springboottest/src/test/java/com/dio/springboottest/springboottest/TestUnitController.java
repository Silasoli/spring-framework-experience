/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.springboottest.springboottest;

import com.dio.springboottest.controller.TestController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author silas
 */
public class TestUnitController {
    
    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("DIO");
        assertEquals("Bem vindo, DIO", resultado);
    }
    
}
