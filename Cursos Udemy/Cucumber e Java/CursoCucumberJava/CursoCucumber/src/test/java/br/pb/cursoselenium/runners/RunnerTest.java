package br.pb.cursoselenium.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature", //Localiza as features
		glue = "br.pb.cursoselenium.steps", //Localiza os arquivos de steps
		tags = {"~@ignore"},
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, // Valida se o cenário está correto. Por padrão, o valor é 'false'
		strict = false // 'Força' um erro quando inserido um step sem mapeá-lo 
		)
public class RunnerTest {
	
}