package classe;

public class Produto {

	/*
	 * A variável estática pertence a classe e não a instância!
	 */

	String nome;
	double preco;
	static double desconto;

	Produto() {

	}

	/*
	 * Com isso, não faz mais sentido inserir a variável estática 'desconto' no
	 * construtor
	 */
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	double precoComDesconto() {
		return preco - preco * desconto;
	}

}
