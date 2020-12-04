package br.com.marcel.controle_estoque_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcel.controle_estoque_spring.model.Loja;
import br.com.marcel.controle_estoque_spring.repository.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository repository;
	
	public void salvar(Loja loja) {
		repository.save(loja);
	}
}
