package br.com.marcel.controle_estoque_spring.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.marcel.controle_estoque_spring.controller.dto.ClienteDTO;
import br.com.marcel.controle_estoque_spring.controller.dto.LojaDTO;
import br.com.marcel.controle_estoque_spring.form.ClienteForm;
import br.com.marcel.controle_estoque_spring.form.LojaForm;
import br.com.marcel.controle_estoque_spring.model.Cliente;
import br.com.marcel.controle_estoque_spring.model.Loja;
import br.com.marcel.controle_estoque_spring.repository.ClienteRepository;
import br.com.marcel.controle_estoque_spring.repository.LojaRepository;
import br.com.marcel.controle_estoque_spring.service.ClienteService;
import br.com.marcel.controle_estoque_spring.service.LojaService;


@RestController
@RequestMapping("/lojas")
public class LojaController {

	@Autowired
	private LojaService service;
	@Autowired
	private LojaRepository repo;
	
	
	@GetMapping
	public List<LojaDTO> lista(String nomeloja) {
		if (nomeloja == null) {
			List<Loja> lojas = repo.findAll();
			return LojaDTO.converter(lojas);
		} else {
			List<Loja> lojas = repo.findBynomeloja(nomeloja);
			return LojaDTO.converter(lojas);
		}
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<LojaDTO> cadastrar(@RequestBody @Valid LojaForm form, UriComponentsBuilder uriBuilder) {
		Loja loja = form.converter();
		repo.save(loja);
		
		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(loja.getCod_loja()).toUri();
		return ResponseEntity.created(uri).body(new LojaDTO(loja));
	}
}
