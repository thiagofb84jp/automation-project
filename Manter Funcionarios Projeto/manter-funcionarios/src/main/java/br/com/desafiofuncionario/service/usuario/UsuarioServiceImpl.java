package br.com.desafiofuncionario.service.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.desafiofuncionario.exception.BusinessException;
import br.com.desafiofuncionario.model.Usuario;
import br.com.desafiofuncionario.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	@Override
	public Usuario criar(Usuario usuario) throws BusinessException {
		
		if(validarUsuarioJaCadastrado(usuario)) {
			throw new BusinessException("Login já cadastrado");
		}
		
		return usuarioRepositorio.saveAndFlush(usuario);
	}

	@Override
	public void alterar(Usuario usuario) throws BusinessException {
		
		if(validarUsuarioJaCadastrado(usuario)) {
			throw new BusinessException("Login já cadastrado");
		}
		
		usuarioRepositorio.saveAndFlush(usuario);
	}

	@Override
	public Usuario buscar(Long id) {
		return usuarioRepositorio.findById(id).get();
	}

	@Override
	public void remover(Long id) {
		
		Usuario usuario = buscar(id);
		usuario.setAtivo(false);
		
		usuarioRepositorio.saveAndFlush(usuario);
	}
	
	public boolean validarUsuarioJaCadastrado(Usuario usuario) {
		
		List<Usuario> usuarioExistentes = usuarioRepositorio.getUsuariosByLogin(usuario.getLogin());
		if(usuarioExistentes != null && usuarioExistentes.size() > 0) {
			return true;
		}
		
		return false;
	}
}
