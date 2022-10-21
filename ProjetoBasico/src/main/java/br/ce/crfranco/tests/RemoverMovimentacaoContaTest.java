package br.ce.crfranco.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.crfranco.core.BaseTest;
import br.ce.crfranco.pages.ContasPage;
import br.ce.crfranco.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta("Conta com movimentacao");
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}




