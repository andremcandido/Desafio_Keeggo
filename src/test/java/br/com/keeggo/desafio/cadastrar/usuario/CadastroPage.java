package br.com.keeggo.desafio.cadastrar.usuario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroPage {

	private static final String URL_LOGIN = "https://www.demoblaze.com/index.html";
	public static WebDriver browser;
	
	public CadastroPage() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		this.browser = new ChromeDriver();
		this.browser.navigate().to(URL_LOGIN);
	}

	public void fechar() {
		this.browser.quit();
		
	}

	public void preencheFormularioDeCadastro(String username, String password) throws InterruptedException {
		browser.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("teste54625");
		browser.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("teste");
		browser.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		
		
	}
	public boolean isPaginaDeCadastro() {
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}

	public void efetuaCadastro() {
		// TODO Auto-generated method stub
		
	}

}
