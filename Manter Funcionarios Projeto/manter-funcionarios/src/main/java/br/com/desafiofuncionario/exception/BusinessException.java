package br.com.desafiofuncionario.exception;

public class BusinessException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String mensagem) {
		super(mensagem);
	}
	
	public BusinessException(String mensagem, Throwable throwable) {
		super(mensagem, throwable);
	}

}
