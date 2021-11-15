package br.com.keeggo.desafio.step.login;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;

import br.com.keeggo.desafio.login.LoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {
	
	private LoginPage loginPage;

	@Dado("Inicia login")
	public void iniciarLogin() {
		this.loginPage = new LoginPage();
	}
	
	
	@Entao("preencho dados de login")
	public void preencho_campos() throws InterruptedException {
		this.loginPage.preencheFormularioDeLogin("teste54625","teste");
	}
	
	@Quando("realizo login")
	public void realizo_login() {
		this.loginPage.efetuaLogin();
	}

	@Entao("valido login")
	public void valido_login() {
		Assertions.assertTrue(loginPage.isPaginaDeLogin());
	}
}
