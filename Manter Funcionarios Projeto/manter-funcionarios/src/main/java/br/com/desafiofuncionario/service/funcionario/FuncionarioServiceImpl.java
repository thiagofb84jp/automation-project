package br.com.desafiofuncionario.service.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.desafiofuncionario.exception.BusinessException;
import br.com.desafiofuncionario.model.Funcionario;
import br.com.desafiofuncionario.repository.FuncionarioRepository;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepositorio;
	
	@Override
	public Funcionario criar(Funcionario funcionario) throws BusinessException {
		
		return funcionarioRepositorio.saveAndFlush(funcionario);
	}

	@Override
	public void alterar(Funcionario funcionario) throws BusinessException {
		
		funcionarioRepositorio.saveAndFlush(funcionario);
	}

	@Override
	public Funcionario buscar(Long id) {
		return funcionarioRepositorio.findById(id).get();
	}

	@Override
	public void remover(Long id) {
		
		Funcionario funcionario = buscar(id);
		funcionario.setAtivo(false);
		
		funcionarioRepositorio.saveAndFlush(funcionario);
	}

}
