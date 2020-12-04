package br.com.marcel.controle_estoque_spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_cliente;
	@Column(name="nome_cliente")
	private String nomecliente;
	private String cpf_cliente;
	private String endereco_cliente;
	private String cidade_cliente;

	
		
	public Cliente(String nome, String cpf, String endereco, String cidade) {
		this.nomecliente = nome;
		this.cpf_cliente = cpf;
		this.endereco_cliente = endereco;
		this.cidade_cliente = cidade;
	}
	
	public Cliente() {
	// TODO Auto-generated constructor stub
	}
	
	

	
	public String getNome_cliente() {
		return this.nomecliente;
	}

	public String getCpf_cliente() {
		return this.cpf_cliente;
	}

	public String getEndereco_cliente() {
		return this.endereco_cliente;
	}

	public Long getCodigo_cliente() {
		return this.codigo_cliente;
	}
	
	public String getCidade_cliente() {
		return cidade_cliente;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "***\n Cliente: "+getNome_cliente()+"\n Codigo: "+getCodigo_cliente()+"\n Cidade: "+getCidade_cliente()+"\n ***";
	}
	
	public String toStringPedido() {
		// TODO Auto-generated method stub
		return "***\n Cliente: "+getNome_cliente()+"\n Codigo: "+getCodigo_cliente();
	}

	public void setNome_cliente(String nome_cliente) {
		this.nomecliente = nome_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public void setCidade_cliente(String cidade_cliente) {
		this.cidade_cliente = cidade_cliente;
	}

	public Long setCodigo_cliente(Long codigo_cliente) {
		return this.codigo_cliente = codigo_cliente;
	}
}
