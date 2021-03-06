 package br.com.keeggo.desafio.step.remover;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;

import br.com.keeggo.desafio.login.LoginPage;
import br.com.keeggo.desafio.remover.produto.RemoverProduto;
import br.com.keeggo.desafio.remover.produto.RemoverProdutoPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class RemoverStep {
	
	private LoginPage LoginPage;
	private RemoverProdutoPage RemoverProdutoPage;

	@Dado("Inicia login")
	public void iniciarCadastro() {
		this.LoginPage = new LoginPage();
		this.RemoverProdutoPage = new RemoverProdutoPage();
	}
	
	@Entao("preencho dados de login")
	public void preencho_campos() throws InterruptedException {
		this.LoginPage.preencheFormularioDeLogin("teste54625","teste");
	}
	
	@Quando("realizo login")
	public void realizo_login() {
		this.LoginPage.efetuaLogin();
	}

	@Entao("valido login")
	public void valido_login() {
		Assertions.assertTrue(LoginPage.isPaginaDeLogin());
	}
	
	@Quando("abro o carrinho")
	public void abro_carrinho() throws InterruptedException {
		this.RemoverProdutoPage.abreCarrinho();
		Thread.sleep(5000);
	}
	
		@Entao("removo produto ao carrinho")
	public void removo_produto() throws InterruptedException {
		this.RemoverProdutoPage.RemoverProduto();
	}
}