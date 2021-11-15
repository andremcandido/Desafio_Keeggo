package br.com.keeggo.desafio.remover.produto;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoverProdutoPage {

	

private By browser;

	public void abreCarrinho() throws InterruptedException {
		browser.findElement((SearchContext) By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
	}
		
		public void removerProduto() throws InterruptedException {
		browser.findElement((SearchContext) By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(5000);
		browser.findElement((SearchContext) By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")).click();
	}
}
