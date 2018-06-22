package br.pb.cursoselenium.core;

public class Propriedades {

	public static boolean FECHAR_BROWSER = true;

	public static Browsers BROWSER = Browsers.CHROME;

	/  public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.GRID;

	ublic static TipoExecucao TIPO_EXECUCAO = TipoExecucao.NUVEM;

	public static String NOME_NOVA_CONTA = "Conta " + System.nanoTime();


	/  ublic static String NOME_CONTA_ALTERADA = "Conta Alterada " +

	// // System.nanoTime();

	public enum Browsers {
		CHRO FIREFOX, 
	}



	lic enum TipoExecucao {
 		LOCAL, G , NUV 	}

}