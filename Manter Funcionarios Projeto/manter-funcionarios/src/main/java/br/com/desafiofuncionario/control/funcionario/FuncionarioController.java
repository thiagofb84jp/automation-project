package br.com.desafiofuncionario.control.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiofuncionario.exception.BusinessException;
import br.com.desafiofuncionario.model.Funcionario;
import br.com.desafiofuncionario.service.funcionario.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value="/api/funcionario")
@Api(tags = "Api de gestão de funcionários")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody FuncionarioRespDTO cadastrar(@RequestBody FuncionarioReqDTO requestFuncionario) throws BusinessException {
		
		Funcionario funcionario = funcionarioService.criar(requestFuncionario.transformar(new Funcionario()));
		return new FuncionarioRespDTO(funcionario);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public @ResponseBody FuncionarioRespDTO buscar(
			@ApiParam(value = "Identificador do usuário") @PathVariable("id") @RequestBody Long id) {
		
		return new FuncionarioRespDTO(funcionarioService.buscar(id));
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@RequestMapping(method = RequestMethod.PUT, path = "/{id}")
	public FuncionarioRespDTO alterar(
			@ApiParam(value = "Identificador do usuário", required = true) @PathVariable("id") Long id,
			@ApiParam(value = "Informações do usuário", required = true) @RequestBody FuncionarioReqDTO requestFuncionario) throws BusinessException {
		
		Funcionario funcionario = funcionarioService.buscar(id);
		funcionarioService.alterar(funcionario);
		
		return new FuncionarioRespDTO(funcionario);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
	public void remover(
			@ApiParam(value = "Identificador do usuário", required = true) @PathVariable("id") Long id) {
		
		funcionarioService.remover(id);
	}
}
