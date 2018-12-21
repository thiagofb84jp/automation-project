package integracao.bancodedados.contatos;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * ANOTAÇÕES IMPORTANTES:
 * 1. @RunWith => Esta anotação vai dizer para o JUnit usar a classe passada como parâmetro para executar os testes.
 * 2. A classe SpringRunner.class vai iniciar o contexto de testes do Spring e executar os testes.
 * 3. @DataJpaTest => Contém configurações que permitem o uso do Spring Data JPA repositories sem precisar subir todo
 * 						o contexto do Spring e ainda configura um banco embutido para ser usado em memória durante
 * 						os testes.
 * 4. Expected Exception => A classe ExpectedException.class é um componente do JUnit que permite que façamos
 * 								validações em cima de uma exception.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationTest {

	@Autowired
	private ContatoRepository contatoRepository;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private Contato contato;

	@Before
	public void start() {
		contato = new Contato("Chefe", "0y", "9xxxxxxx9");
	}

	@Test
	public void saveComDddNuloDeveLancarException() throws Exception {
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O DDD deve ser preenchido");

		contato.setDdd(null);
		contatoRepository.save(contato);
	}

	@Test
	public void saveComTelefoneNuloDeveLancarException() throws Exception {
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O Telefone deve ser preenchido");

		contato.setTelefone(null);
		contatoRepository.save(contato);
	}

	@Test
	public void saveComNomeNuloDeveLancarException() throws Exception {
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O Nome deve ser preenchido");

		contato.setNome(null);
		contatoRepository.save(contato);
	}

	@Test
	public void saveDeveSalvarContato() {
		contatoRepository.save(contato);
		List<Contato> contatos = contatoRepository.findAll();
		Assert.assertEquals(1, contatos.size());
		contatoRepository.deleteAll();
	}

	@Test
	public void deleteByIdDeveRemoverContato() {
		contatoRepository.save(contato);
		List<Contato> contatos = contatoRepository.findAll();
		Assert.assertEquals(1, contatos.size());

		contatoRepository.deleteById(contato.getId());
		List<Contato> resultado = contatoRepository.findAll();
		Assert.assertEquals(0, resultado.size());
	}
}