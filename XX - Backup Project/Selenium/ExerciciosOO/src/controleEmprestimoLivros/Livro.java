package controleEmprestimoLivros;

public class Livro {

	private String titulo;
	private String descricaoGenerica;
	private String editora;
	private String genero;
	private int qtdPaginas;
	private int anoLancamento;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoGenerica() {
		return descricaoGenerica;
	}

	public void setDescricaoGenerica(String descricaoGenerica) {
		this.descricaoGenerica = descricaoGenerica;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
}