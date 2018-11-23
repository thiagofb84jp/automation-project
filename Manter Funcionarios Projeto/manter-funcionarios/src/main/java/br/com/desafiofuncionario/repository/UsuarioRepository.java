package br.com.desafiofuncionario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.desafiofuncionario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("select u from Usuario u where u.login = :loginCliente")
	public List<Usuario> getUsuariosByLogin(@Param("loginCliente") String login);
}
