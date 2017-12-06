package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
		//Construtor com parâmetros
		Funcionario func1 = new Funcionario("José Marianno da Silva Lima", 2500.00, "Analista de Sistemas");
		func1.dadosFuncionario();
		
		//Construtor sem parâmetros
		Funcionario func2 = new Funcionario();

		func2.nome = "Elias Julio Souza";
		func2.salario = 4500.00;
		func2.funcao = "Analista de Testes";

		System.out.println("");
		
		System.out.println("***** Dados do Funcionário *****");
		System.out.println("Nome: " + func2.nome);
		System.out.println("Nome: " + func2.salario);
		System.out.println("Nome: " + func2.funcao);

	}

}
