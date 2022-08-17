/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.gof.facade.cep;

/**
 *
 * @author silas
 */
public class CepApi {
    
      private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Feira de Santana";
    }
    
      public String recuperarEstado(String cep){
        return "Bahia";
    }
    
}
