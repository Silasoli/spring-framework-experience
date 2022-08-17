/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.gof.strategy;

/**
 *
 * @author silas
 */
public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.err.println("Movendo-se Agressivamente...");
    }
    
}
