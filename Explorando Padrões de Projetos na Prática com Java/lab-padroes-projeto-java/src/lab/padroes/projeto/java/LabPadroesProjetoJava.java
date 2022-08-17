/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.padroes.projeto.java;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

/**
 *
 * @author silas
 */
public class LabPadroesProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Singleton
//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
        //Strategy
//        ComportamentoNormal normal = new ComportamentoNormal();
//        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
//        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
//        
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();        
//        robo.mover();
//        robo.setComportamento(agressivo);
//        robo.mover();        
//        robo.mover();
//        robo.setComportamento(defensivo);
//        robo.mover();        
//        robo.mover();
        //FACADE
        
//        Facade facade =  new Facade();
//        facade.migrarCliente("Silas", "44033355");
    }

}
