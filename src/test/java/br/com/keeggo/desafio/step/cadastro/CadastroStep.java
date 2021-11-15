 package br.com.keeggo.desafio.step.cadastro;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;

import br.com.keeggo.desafio.login.LoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import br.com.keeggo.desafio.cadastrar.usuario.CadastroPage;

public class CadastroStep {
	
	
	private CadastroPage CadastroPage;

	@Dado("inicio novo cadastro")
	public void iniciarCadastro() {
		this.CadastroPage = new CadastroPage();
	}
	
	
	@Entao("preencho dados usuario")
	public void preencho_campos() throws InterruptedException {
		this.CadastroPage.preencheFormularioDeCadastro("teste54625","teste");
	}
	
	@Quando("realizo um novo cadastro")
	public void realizo_login() {
		this.CadastroPage.efetuaCadastro();
	}

	@Entao("valido cadastro")
	public void valido_login() {
		Assertions.assertTrue(CadastroPage.isPaginaDeCadastro());
	}
}
