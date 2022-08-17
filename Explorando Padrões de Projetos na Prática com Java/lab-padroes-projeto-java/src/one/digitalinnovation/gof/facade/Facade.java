/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.cep.CepApi;
import one.digitalinnovation.gof.facade.crm.CrmService;

/**
 *
 * @author silas
 */
public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliete(nome, cep, cidade, estado);
    }

}
