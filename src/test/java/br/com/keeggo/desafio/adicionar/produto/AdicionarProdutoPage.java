package br.com.keeggo.desafio.adicionar.produto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.keeggo.desafio.login.LoginPage;

public class AdicionarProdutoPage {

	public AdicionarProdutoPage(Object driver) {
	}

	public AdicionarProdutoPage() {
	}

	public void selecionoProduto() throws InterruptedException {
		Thread.sleep(5000);
		LoginPage.browser.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		
	}

	public void adicionoProduto() throws InterruptedException  {
		Thread.sleep(5000);
		LoginPage.browser.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
	}
}
