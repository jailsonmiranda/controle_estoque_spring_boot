package br.com.marcel.controle_estoque_spring.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.marcel.controle_estoque_spring.model.Cliente;

public class ClienteDTO {
	
	private Long codigo_cliente;
	private String nome_cliente;
	private String endereco_cliente;
	private String cidade_cliente;

	
		
	public ClienteDTO(Cliente cliente) {
		this.nome_cliente = cliente.getNome_cliente();
		this.cidade_cliente = cliente.getCidade_cliente();
		this.endereco_cliente = cliente.getEndereco_cliente();
	}
	
	public ClienteDTO() {
	}
	
	

	
	public String getNome_cliente() {
		return this.nome_cliente;
	}

	public String getEndereco_cliente() {
		return this.endereco_cliente;
	}

	public String getCidade_cliente() {
		return cidade_cliente;
	}


	public static List<ClienteDTO> converter(List<Cliente> clientes) {
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
}









