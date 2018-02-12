package colecoes;

public class EnderecoTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");

		System.out.println(endereco1 == endereco2); // Será 'false' porque há a comparação de endereço de memória, sendo este dois objetos diferentes
		System.out.println(endereco1.equals(endereco2));
	}
}