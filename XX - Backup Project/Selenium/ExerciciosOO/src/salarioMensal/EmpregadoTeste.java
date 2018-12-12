package salarioMensal;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Luzia", " Amanda Luana Aragão", 1250);

		System.out.println("***************** Dados do Empregado ***************** ");
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Sobrenome: " + e1.getSobrenome());
		System.out.println("Salário Mensal: " + e1.getSalMensal());
		System.out.println("10% (aumento salário): " + e1.calcularAumentoSal(e1.getSalMensal()));
		System.out.println("Salário Anual: " + e1.calcSalAnual(e1.getSalMensal()));
		System.out.println("***************** Fim do Programa ******************* ");
		
		Empregado e2 = new Empregado("Raul", "Yuri Rocha", 1000);

		System.out.println("***************** Dados do Empregado ***************** ");
		System.out.println("Nome: " + e2.getNome());
		System.out.println("Sobrenome: " + e2.getSobrenome());
		System.out.println("Salário Mensal: " + e2.getSalMensal());
		System.out.println("10% (aumento salário): " + e2.calcularAumentoSal(e2.getSalMensal()));
		System.out.println("Salário Anual: " + e2.calcSalAnual(e2.getSalMensal()));
		System.out.println("***************** Fim do Programa ******************* ");
	}
}