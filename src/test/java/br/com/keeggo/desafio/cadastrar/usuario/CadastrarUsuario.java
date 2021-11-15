package br.com.keeggo.desafio.cadastrar.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.keeggo.desafio.login.LoginPage;

public class CadastrarUsuario {
	
	private CadastroPage paginaDeCadastro;

	@BeforeEach
	public void beforeEach() {
		this.paginaDeCadastro = new CadastroPage();
	}
	
	//@AfterEach
	//public void afterEach() {
		//this.paginaDeCadastro.fechar();
	//}
	
	@Test
	public void deveriaEfetuarCadastroComDadosValidos () throws InterruptedException {
		Thread.sleep(2000);
		paginaDeCadastro.preencheFormularioDeCadastro("teste54625","teste");
		
		Assertions.assertTrue(paginaDeCadastro.isPaginaDeCadastro());
	}
}