package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/AdicionarProduto.feature", glue = "br.com.keeggo.desafio.step.adicionar", tags = "@AdicionarProduto")
public class Runner {

}