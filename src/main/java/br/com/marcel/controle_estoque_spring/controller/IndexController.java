package br.com.marcel.controle_estoque_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String home(Model model){
		
		///Iterable<Convidado> convidados = service.obterTodos();
		
		//model.addAttribute("convidados", convidados);
		
		return "index";
	}
//	@GetMapping("/selecoes")
//	public String mandaDetalhe(Model model){
//		
//		///Iterable<Convidado> convidados = service.obterTodos();
//		
//		//model.addAttribute("convidados", convidados);
//		
//		return "/clientes";
//	}
//	
	
	
}
