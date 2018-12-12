package br.com.desafiofuncionario.control.cliente;

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
import br.com.desafiofuncionario.model.Usuario;
import br.com.desafiofuncionario.service.usuario.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value="/api/usuario")
@Api(tags = "API de Gestão de usuários")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody UsuarioRespDTO cadastrar(@RequestBody UsuarioReqDTO requestUsuario) throws BusinessException {
		
		Usuario usuario = usuarioService.criar(requestUsuario.transformar(new Usuario()));
		return new UsuarioRespDTO(usuario);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public @ResponseBody UsuarioRespDTO buscar(
			@ApiParam(value = "Identificador do usuário") @PathVariable("id") @RequestBody Long id) {
		
		return new UsuarioRespDTO(usuarioService.buscar(id));
	}
	
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@RequestMapping(method = RequestMethod.PUT, path = "/{id}")
	public UsuarioRespDTO alterar(
			@ApiParam(value = "Identificador do usuário", required = true) @PathVariable("id") Long id,
			@ApiParam(value = "Informações do usuário", required = true) @RequestBody UsuarioReqDTO requestUsuario) throws BusinessException {
		
		Usuario usuario = usuarioService.buscar(id);
		usuarioService.alterar(usuario);
		
		return new UsuarioRespDTO(usuario);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
	public void remover(
			@ApiParam(value = "Identificador do usuário", required = true) @PathVariable("id") Long id) {
		
		usuarioService.remover(id);
	}
}
