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
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
//@AutoConfigureTestDatabase(connection=EmbeddedDatabaseConnection.HSQL)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ContatosRepositoryIntegrationTest {

	@Autowired
	private ContatoRepository contatoRepository;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private Contato contato;

	@Before
	public void start() {
		contato = new Contato("", "(083)", "999280988");
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