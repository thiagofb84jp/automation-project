package br.com.desafiofuncionario.service.funcionario;

import br.com.desafiofuncionario.exception.BusinessException;
import br.com.desafiofuncionario.model.Funcionario;

public interface FuncionarioService {

	public Funcionario criar(Funcionario Funcionario) throws BusinessException;
	
	public void alterar(Funcionario Funcionario) throws BusinessException;
	
	public Funcionario buscar(Long id);
	
	public void remover(Long id);
}
