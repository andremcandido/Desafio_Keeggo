package br.com.keeggo.desafio.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Login {
	
	private LoginPage paginaDeLogin;
	
	@BeforeEach
	public void beforeEach() {
		this.paginaDeLogin = new LoginPage();
	}
	
	//@AfterEach
	//public void afterEach() {
		//this.paginaDeLogin.fechar();
	//}
	
	@Test
	public void deveriaEfetuarLoginComDadosValidos () throws InterruptedException {
		Thread.sleep(2000);
		paginaDeLogin.preencheFormularioDeLogin("teste54625","teste");
		paginaDeLogin.efetuaLogin();
		
		Assertions.assertTrue(paginaDeLogin.isPaginaDeLogin());
	}
}
