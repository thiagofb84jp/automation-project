package br.com.desafiofuncionario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.desafiofuncionario.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	@Query("select f from Funcionario f where f.matricula = :matricula")
	public List<Funcionario> getFuncionariosByMatricula(@Param("matricula") String matricula);

}
