package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepApi;

public class Facade {

    private static Facade facade = new Facade();

    private Facade(){

    }
    
    public static Facade getInstancia(){
        return facade;
    }

    public void migrarCliente(String nome, String cep){ // O objetivo é ter uma interface de uso bem simples que abstraia a complexidade
        //de integração com essa api de Cep e depois grave o cliente num sistema de CRM.
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
