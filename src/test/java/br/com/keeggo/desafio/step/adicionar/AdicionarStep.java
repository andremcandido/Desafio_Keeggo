 package br.com.keeggo.desafio.step.adicionar;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import br.com.keeggo.desafio.adicionar.produto.AdicionarProdutoPage;
import br.com.keeggo.desafio.login.LoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AdicionarStep {
	
	private AdicionarProdutoPage AdicionarProdutoPage;
	private LoginPage LoginPage;
	private Object driver;
	
	
	@Dado("Inicia login")
	public void iniciarCadastro() {
		this.LoginPage = new LoginPage();
		this.AdicionarProdutoPage = new AdicionarProdutoPage();
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
	
	@Quando("seleciono produto")
	public void seleciono_produto() throws InterruptedException {
		this.AdicionarProdutoPage.selecionoProduto();
	}
	
	@Entao("Adiciono produto ao carrinho")
	public void adiciono_produto() throws InterruptedException {
		this.AdicionarProdutoPage.adicionoProduto();
	}
}