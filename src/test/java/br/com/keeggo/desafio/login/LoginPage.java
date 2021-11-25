package br.com.keeggo.desafio.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	private static final String URL_LOGIN = "https://www.demoblaze.com/index.html";
	public static WebDriver browser;
	
	public LoginPage() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		this.browser = new ChromeDriver();
		this.browser.navigate().to(URL_LOGIN);
	}
 
	public void fechar() {
		this.browser.quit();
	}

	public void preencheFormularioDeLogin(String username, String password) throws InterruptedException {
		browser.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(username);
		browser.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(password);
		
	}

	public void efetuaLogin() {
		browser.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
	}
	public boolean isPaginaDeLogin() {
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}

}
