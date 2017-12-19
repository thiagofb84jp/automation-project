package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto prod1 = new Produto();
		prod1.nome = "Notebook Acer 15' 8GB";
		prod1.preco = 2300;

		Produto prod2 = new Produto("Caneta BIC Preta", 2.83);
		
		Produto.desconto = 0.50;

		System.out.println(prod1.precoComDesconto());
		System.out.println(prod2.precoComDesconto());
	}
}
