package salarioMensal;

public class Empregado {

	private String nome;
	private String sobrenome;
	private float salMensal;

	public Empregado(String nome, String sobrenome, float salMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salMensal = salMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalMensal() {
		if(this.salMensal < 0) {
			return 0;
		}else {
			return salMensal;
		}
	}

	public void setSalMensal(int salMensal) {
		this.salMensal = salMensal;
	}
	
	public double calcSalAnual(double salMensal) {
		return (this.salMensal * 0.01 + salMensal) * 12;
	}
	
	public double calcularAumentoSal(double salMensal) {
		return this.salMensal * 0.01 + salMensal;
	}
}