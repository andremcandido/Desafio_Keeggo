package br.com.keeggo.desafio.adicionar.produto;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class AdicionarProdutoPage {

	private By browser;

	public AdicionarProdutoPage(Object driver) {
	}

	public AdicionarProdutoPage() {
	}

	public void selecionoProduto() throws InterruptedException {
		browser.findElement((SearchContext) By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(5000);
	}

	public void adicionoProduto(WebDriver browser)  {
		browser.findElement(By.xpath("//*[@id=\\\"tbodyid\\\"]/div[2]/div/a")).click();
	}
}
