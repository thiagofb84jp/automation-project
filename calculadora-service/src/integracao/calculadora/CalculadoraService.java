package integracao.calculadora;

import integracao.soma.Soma;
import integracao.soma.SomaService;
import integracao.subtracao.Subtracao;
import integracao.subtracao.SubtracaoService;

public class CalculadoraService {
	
	private SomaService somaService;
	private SubtracaoService subtracaoService;
	
	public Calculadora getSoma(int x, int y) {
		Soma soma = somaService.getSoma(x, y);
		return new Calculadora(soma);
	}
	
	public Calculadora somar() {
		Soma soma = somaService.somar();
		return new Calculadora(soma);
	}
	
	public Calculadora getSubtracao(int x, int y) {
		Subtracao subtracao = subtracaoService.getSubtracao(x, y);
		return new Calculadora(subtracao);
	}
}