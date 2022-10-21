package br.ce.crfranco.suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.crfranco.core.DriverFactory;
import br.ce.crfranco.pages.LoginPage;
import br.ce.crfranco.tests.ContaTest;
import br.ce.crfranco.tests.MovimentacaoTest;
import br.ce.crfranco.tests.RemoverMovimentacaoContaTest;
import br.ce.crfranco.tests.ResumoTest;
import br.ce.crfranco.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void reset(){
		page.acessarTelaInicial();
		
		page.setEmail("roncarcla18@gmail.com");
		page.setSenha("310506");
        page.entrar();
		
		page.resetar();
		
		DriverFactory.killDriver();
	}
}







