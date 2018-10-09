package exerciciosOO.controleEmprestimoLivros;

public class ProgramaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Maria Eduarda da Silva Lima");
		p.setCPF("059.568.984-10");
		p.setCodUsuario(102030);

		Livro l = new Livro();
		l.setTitulo("O Morro dos Ventos Uivantes");
		l.setQtdPaginas(890);
		l.setAnoLancamento(2018);

		Emprestimo e = new Emprestimo();
		e.setTitulo("O Morro dos Ventos Uivantes");
		e.setQtdLivros(1);
		e.setQtdDiasEntrega(4);
		
		System.out.println("*************** Empr�stimo ***************");
		System.out.println("Nome do usu�rio: " + p.getNome());
		System.out.println("C�digo: " + p.getCodUsuario());
		System.out.println("T�tulo do Livro: " + l.getTitulo());
		System.out.println("Quantidade de Livros: " + e.getQtdLivros());
		System.out.println("Quantidade de Dias para Entrega: " + e.getQtdDiasEntrega());
		System.out.println("******************************************");
	}
}