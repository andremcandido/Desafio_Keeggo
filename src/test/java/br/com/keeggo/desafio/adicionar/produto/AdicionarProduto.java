package br.com.keeggo.desafio.adicionar.produto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.keeggo.desafio.login.LoginPage;

public class AdicionarProduto {
	
	private LoginPage paginaDeLogin;
	private AdicionarProdutoPage adicionarProduto;
	
	@BeforeEach
	public void beforeEach() {
		this.paginaDeLogin = new LoginPage();
		this.adicionarProduto = new AdicionarProdutoPage();
	}
	
	@AfterEach
	public void afterEach() {
		this.paginaDeLogin.fechar();
	}
	
	@Test
	public void deveriaAdicionarProduto () throws InterruptedException {
		Thread.sleep(2000);
		paginaDeLogin.preencheFormularioDeLogin("teste54625","teste");
		paginaDeLogin.efetuaLogin();
		
		Assertions.assertTrue(paginaDeLogin.isPaginaDeLogin());
		Thread.sleep(5000);
		adicionarProduto.adicionoProduto();
						
		}
}