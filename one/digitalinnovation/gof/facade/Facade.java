package one.digitalinnovation.gof.facade;

import subsistema1.crm.crmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperCidade(cep);
        String estado = CepApi.getInstancia().recuperEstado(cep);

        crmService.gravarCliente(nome, cep, cidade, estado);
    }

}