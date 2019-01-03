package integracao.componentes.contatos;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoServiceImpl implements ContatoService{

	@Autowired
	private ContatoRepository contatoRepository;

	@Override
	public void inserir(Contato contato) throws ContatoException {
		try {
			contatoRepository.save(contato);
		} catch (ConstraintViolationException e) {
			throw new ContatoException(e);
		}
	}

	@Override
	public void remover(Long id) {
		contatoRepository.deleteById(id);
	}

}
