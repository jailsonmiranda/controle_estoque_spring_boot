package br.com.marcel.controle_estoque_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcel.controle_estoque_spring.model.Cliente;
import br.com.marcel.controle_estoque_spring.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long> {

	List<Loja> findBynomeloja(String nome_loja);

}
