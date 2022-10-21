package br.ce.crfranco.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.crfranco.core.BaseTest;
import br.ce.crfranco.pages.HomePage;
import br.ce.crfranco.pages.MenuPage;


public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
	}
}





