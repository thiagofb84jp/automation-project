import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, // Valida se o cenário está correto. Por padrão, o valor é 'false'
		strict = false // 'Força' um erro quando inserido um step sem mapeá-lo 
		)
public class Runner {
	
}