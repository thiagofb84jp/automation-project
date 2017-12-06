package classe;

public class Funcionario {

	String nome;
	double salario;
	String funcao;

	Funcionario() {

	}

	Funcionario(String n, double sal, String func) {
		nome = n;
		salario = sal;
		funcao = func;

	}

	//Função usada quando o construtor usado estiver sem parâmetros
	void dadosFuncionario() {
		System.out.println("***** Dados do Funcionário *****");
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Função: " + funcao);
	}

}
