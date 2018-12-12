package br.com.desafiofuncionario.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {

	@RequestMapping(value = {"/", "/swagger", "/sandbox"})
	public String index(Model model) {
		return "redirect:/swagger-ui.html";
	}
}
