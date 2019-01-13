package br.com.cucumber.steps;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/aprender_cucumber.feature",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE, //O método é criado no padrão Java (CamelCase)
		dryRun = false,
		strict = false
		)
public class Runner {

}