package br.com.keeggo.desafio;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DesafioKeeggo {

	@Test
	public void hello () {
		System.out.println("Rodou o hello");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("https://www.demoblaze.com/index.html");
		browser.quit();
	}
}
