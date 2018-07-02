package fundamentos;
/**
 * Classe responsável por mostrar o uso dos 3 (três) tipos de comentários que o Java suporta.
 * @author Thiago Ferreira Barbosa [thiagofb84jp@gmail.com]
 * @version 1.0
 * @since 2.2
 */
public class Comentario {
	/**
	 * Esse método é a porta de entrada de um programa Java.
	 * @param args 
	 * 			parâmetros passados por linha de comando
	 */
	public static void main(String[] args) {
		/*
		 * 1. Cuidado com os comentários óbvios. Documente aquilo que é relevante;
		 * 2. Este programa imprime no console a palavra 'Primeiro', e em seguida, cria uma nova linha  
		 */
		System.out.print("Primeiro "); //Imprime na primeira linha e permanece na mesma;
		System.out.println("Programa!"); //Imprime na primeira linha e 'desce' a segunda linha;
	}	
}