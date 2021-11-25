package br.com.keeggo.desafio.remover.produto;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.keeggo.desafio.login.LoginPage;


public class RemoverProdutoPage {

	

private By browser;

	public void abreCarrinho() throws InterruptedException {
		LoginPage.browser.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
	}
		
		public void RemoverProduto() throws InterruptedException {
		LoginPage.browser.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		LoginPage.browser.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
	}
}
