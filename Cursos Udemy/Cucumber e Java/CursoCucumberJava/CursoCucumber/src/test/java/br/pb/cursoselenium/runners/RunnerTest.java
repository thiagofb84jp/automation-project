package br.pb.cursoselenium.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", //Localiza as features
		glue = "br.pb.cursoselenium.steps", //Localiza os arquivos de steps
		tags = {"@unitários"},
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, // Valida se o cenário está correto. Por padrão, o valor é 'false'
		strict = false // 'Força' um erro quando inserido um step sem mapeá-lo 
		)
public class RunnerTest {
	
}