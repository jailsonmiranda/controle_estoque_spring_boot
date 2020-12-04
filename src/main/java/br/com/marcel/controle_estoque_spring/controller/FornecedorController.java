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
import br.com.marcel.controle_estoque_spring.form.ClienteForm;
import br.com.marcel.controle_estoque_spring.model.Cliente;
import br.com.marcel.controle_estoque_spring.repository.ClienteRepository;
import br.com.marcel.controle_estoque_spring.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class FornecedorController {

	@Autowired
	private ClienteService service;
	@Autowired
	private ClienteRepository repo;
	
	
	@GetMapping
	public List<ClienteDTO> lista(String nome_cliente) {
		if (nome_cliente == null) {
			List<Cliente> clientes = repo.findAll();
			return ClienteDTO.converter(clientes);
		} else {
			List<Cliente> clientes = repo.findBynomecliente(nome_cliente);
			return ClienteDTO.converter(clientes);
		}
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ClienteDTO> cadastrar(@RequestBody @Valid ClienteForm form, UriComponentsBuilder uriBuilder) {
		Cliente cliente = form.converter();
		repo.save(cliente);
		
		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getCodigo_cliente()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDTO(cliente));
	}
}
