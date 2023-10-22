package dev.thales.gof.facade;

import dev.thales.gof.subsistema1.crm.CrmService;
import dev.thales.gof.subsistema2.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}