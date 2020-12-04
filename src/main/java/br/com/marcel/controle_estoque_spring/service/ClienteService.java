package br.com.marcel.controle_estoque_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import br.com.marcel.controle_estoque_spring.repository.ClienteRepository;
import br.com.marcel.controle_estoque_spring.model.Cliente;


@Service
public class ClienteService {
		
	@Autowired
	private ClienteRepository repository;
	
	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}
}
