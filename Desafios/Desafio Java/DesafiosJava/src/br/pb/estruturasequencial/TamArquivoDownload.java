package br.pb.estruturasequencial;

public class TamArquivoDownload {

	public static void main(String[] args) {
		int tamArquivo = 500, velLink = 8, tempDownload, tempMinutos;

		tempDownload = tamArquivo * velLink;
		tempMinutos = tempDownload / 60;

		System.out.println("O tempo aproximado para download é de " + tempMinutos + " minutos");
	}
}