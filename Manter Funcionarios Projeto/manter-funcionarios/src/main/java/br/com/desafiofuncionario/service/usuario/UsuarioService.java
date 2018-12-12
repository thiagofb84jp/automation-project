package br.com.desafiofuncionario.service.usuario;

import br.com.desafiofuncionario.exception.BusinessException;
import br.com.desafiofuncionario.model.Usuario;

public interface UsuarioService {

	public Usuario criar(Usuario usuario) throws BusinessException;
	
	public void alterar(Usuario usuario) throws BusinessException;
	
	public Usuario buscar(Long id);
	
	public void remover(Long id);
}
