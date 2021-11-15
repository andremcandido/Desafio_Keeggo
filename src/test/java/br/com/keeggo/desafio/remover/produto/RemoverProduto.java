package br.com.keeggo.desafio.remover.produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.keeggo.desafio.adicionar.produto.AdicionarProdutoPage;
import br.com.keeggo.desafio.login.LoginPage;

public class RemoverProduto {
	
	private LoginPage paginaDeLogin;
	private RemoverProdutoPage removerProduto;
	private RemoverProdutoPage RemoverProduto;

	@BeforeEach
	public void beforeEach() {
		this.paginaDeLogin = new LoginPage();
		this.RemoverProduto = new RemoverProdutoPage();
	}
	
//	@AfterEach
//	public void afterEach() {
//		this.paginaDeLogin.fechar();
//	}
	
	@Test
	public void deveriaRemoverProduto () throws InterruptedException {
		Thread.sleep(2000);
		paginaDeLogin.preencheFormularioDeLogin("teste54625","teste");
		paginaDeLogin.efetuaLogin();
		
		Assertions.assertTrue(paginaDeLogin.isPaginaDeLogin());
		Thread.sleep(5000);
		removerProduto.removerProduto();
			
		}

	public void abreCarrinho() {
		By browser = null;
		browser.findElement((SearchContext) By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();		
	}

	public void removerProduto() {
		// TODO Auto-generated method stub
		
	}
}
	
//	@Test
//	public void deveriaEfetuarLoginComDadosValidos () throws InterruptedException {
//		System.out.println("Rodou o hello");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
//		WebDriver browser = new ChromeDriver();
//		browser.navigate().to("https://www.demoblaze.com/index.html");
//		browser.findElement(By.xpath("//*[@id=\"login2\"]")).click();
//		Thread.sleep(5000);
//		browser.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("teste54625");
//		browser.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("teste");
//		browser.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
//		Thread.sleep(5000);
//		browser.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
//		Thread.sleep(5000);
//		browser.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")).click();
//	}
//}
