package br.com.marcel.controle_estoque_spring.form;

import br.com.marcel.controle_estoque_spring.model.Cliente;
import br.com.marcel.controle_estoque_spring.repository.ClienteRepository;

//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import org.hibernate.validator.constraints.Length;


public class ClienteForm {
	
	//@NotNull @NotEmpty @Length(min = 5)
	private String nome_cliente;
	
	//@NotNull @NotEmpty @Length(min = 10)
	private String cpf_cliente;
	
	//@NotNull @NotEmpty
	private String endereco_cliente;
	
	//@NotNull @NotEmpty
	private String cidade_cliente;

	
	
	
	public String getNomecliente() {
		return nome_cliente;
	}




	public void setNomecliente(String nomecliente) {
		this.nome_cliente = nomecliente;
	}




	public String getCpf_cliente() {
		return cpf_cliente;
	}




	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}




	public String getEndereco_cliente() {
		return endereco_cliente;
	}




	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}




	public String getCidade_cliente() {
		return cidade_cliente;
	}




	public void setCidade_cliente(String cidade_cliente) {
		this.cidade_cliente = cidade_cliente;
	}




	public Cliente converter() {
		return new Cliente(nome_cliente, cpf_cliente, endereco_cliente, cidade_cliente);
	}
}
