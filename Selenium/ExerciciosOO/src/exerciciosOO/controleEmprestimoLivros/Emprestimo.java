package exerciciosOO.controleEmprestimoLivros;

public class Emprestimo extends Livro {

	private int qtdLivros;
	private int qtdDiasEntrega;

	public int getQtdDiasEntrega() {
		return qtdDiasEntrega;
	}

	public void setQtdDiasEntrega(int qtdDiasEntrega) {
		this.qtdDiasEntrega = qtdDiasEntrega;
	}

	public int getQtdLivros() {
		return qtdLivros;
	}

	public void setQtdLivros(int qtdLivros) {
		this.qtdLivros = qtdLivros;
	}
}