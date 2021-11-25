package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/adicionarProduto.feature",
				 glue = "br.com.keeggo.desafio.step.adicionar", 
				 tags = "@adicionarProduto")
public class Runner {

}
