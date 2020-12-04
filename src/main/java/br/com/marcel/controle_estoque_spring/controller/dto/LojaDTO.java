package br.com.marcel.controle_estoque_spring.controller.dto;

import java.util.List;
import java.util.stream.Collectors;


import br.com.marcel.controle_estoque_spring.model.Loja;


public class LojaDTO {

	private int cod_loja;
	private String nome_loja;
	private String cnpj_loja;
	private String endereco_loja;
	private String cidade_loja;
	
	
	public LojaDTO(Loja loja) {
		this.nome_loja = loja.getNome_loja();
		this.cnpj_loja = loja.getCnpj_loja();
		this.endereco_loja = loja.getEndereco_loja();
		this.cidade_loja = loja.getCidade_loja();
	}

	 public LojaDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getNome_loja() {
		return nome_loja;
	}

	public String getCnpj_loja() {
		return cnpj_loja;
	}

	public String getEndereco_loja() {
		return endereco_loja;
	}

	public int getCod_loja() {
		return cod_loja;
	}
	
	
	
	
	public void setNome_loja(String nome_loja) {
		this.nome_loja = nome_loja;
	}

	public void setCnpj_loja(String cnpj_loja) {
		this.cnpj_loja = cnpj_loja;
	}

	public void setEndereco_loja(String endereco_loja) {
		this.endereco_loja = endereco_loja;
	}

	public void setCidade_loja(String cidade_loja) {
		this.cidade_loja = cidade_loja;
	}

	public void setCod_loja(int cod_loja) {
		this.cod_loja = cod_loja;
	}
	
	public String getCidade_loja() {
		return cidade_loja;
	}

	public static List<LojaDTO> converter(List<Loja> lojas) {
		return lojas.stream().map(LojaDTO::new).collect(Collectors.toList());
	}
	
		
}


