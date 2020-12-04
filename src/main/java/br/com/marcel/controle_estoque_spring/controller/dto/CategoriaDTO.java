package br.com.marcel.controle_estoque_spring.controller.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaDTO {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_categoria;
	private String nome_categoria;
	private String descricao_categoria;

	
	public CategoriaDTO(String nome, String descricao) {
		this.nome_categoria = nome;
		this.descricao_categoria = descricao;
	}
	
	public CategoriaDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public String getDescricao_categoria() {
		return descricao_categoria;
	}

	public int getCod_categoria() {
		return cod_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao_categoria = descricao_categoria;
	}

	public void setCod_categoria(int cod_categoria) {
		this.cod_categoria = cod_categoria;
	}

	public void removerCategoria(int codigo) {
		if (codigo == getCod_categoria()) {
			setCod_categoria(0);
			setDescricao_categoria("");
			setNome_categoria("");
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "***\n Categoria: "+getNome_categoria()+"\n Descrição: "+getDescricao_categoria()+"\n Codigo: "+getCod_categoria()+"\n ***";
	}
}
