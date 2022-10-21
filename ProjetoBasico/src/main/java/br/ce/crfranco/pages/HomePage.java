package br.ce.crfranco.pages;

import br.ce.crfranco.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldoConta(String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();		
	}	
}
