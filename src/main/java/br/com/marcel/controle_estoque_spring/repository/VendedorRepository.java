package br.com.marcel.controle_estoque_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcel.controle_estoque_spring.model.Cliente;

public interface VendedorRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findBynomecliente(String nome_cliente);

}
