package salarioMensal;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Luzia", " Amanda Luana Arag�o", 1250);

		System.out.println("***************** Dados do Empregado ***************** ");
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Sobrenome: " + e1.getSobrenome());
		System.out.println("Sal�rio Mensal: " + e1.getSalMensal());
		System.out.println("10% (aumento sal�rio): " + e1.calcularAumentoSal(e1.getSalMensal()));
		System.out.println("Sal�rio Anual: " + e1.calcSalAnual(e1.getSalMensal()));
		System.out.println("***************** Fim do Programa ******************* ");
		
		Empregado e2 = new Empregado("Raul", "Yuri Rocha", 1000);

		System.out.println("***************** Dados do Empregado ***************** ");
		System.out.println("Nome: " + e2.getNome());
		System.out.println("Sobrenome: " + e2.getSobrenome());
		System.out.println("Sal�rio Mensal: " + e2.getSalMensal());
		System.out.println("10% (aumento sal�rio): " + e2.calcularAumentoSal(e2.getSalMensal()));
		System.out.println("Sal�rio Anual: " + e2.calcSalAnual(e2.getSalMensal()));
		System.out.println("***************** Fim do Programa ******************* ");
	}
}