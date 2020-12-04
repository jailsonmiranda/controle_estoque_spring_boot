package br.com.marcel.controle_estoque_spring.controller.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FornecedorDTO {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_fornecedor;
	private String nome_fornecedor;
	private String endereco_fornecedor;
	
	
	public FornecedorDTO(String nome, String endereco) {
		this.nome_fornecedor = nome;
		this.endereco_fornecedor = endereco;
	}

	public FornecedorDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public void setEndereco_fornecedor(String endereco_fornecedor) {
		this.endereco_fornecedor = endereco_fornecedor;
	}

	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}

	public String getEndereco_fornecedor() {
		return endereco_fornecedor;
	}

	public int getCod_fornecedor() {
		return cod_fornecedor;
	}

	public void removerFornecedor(int codigo) {
		if (codigo == getCod_fornecedor()) {
			setCod_fornecedor(0);
			setEndereco_fornecedor(null);
			setNome_fornecedor(null);
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "***\n Fornecedor: "+getNome_fornecedor()+"\n Endereço: "+getEndereco_fornecedor()+"\n Codigo: "+getCod_fornecedor()+"\n ***";
	}
	
}
