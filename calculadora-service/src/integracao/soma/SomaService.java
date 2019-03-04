package integracao.soma;

public class SomaService {
	int x = 0;
	int y = 0;
	
	Soma soma = new Soma(x, y);

	public Soma getSoma(int x, int y) {
		return new Soma(x, y);
	}

	public Soma somar(int x, int y) {
		return soma.somar();
	}
}