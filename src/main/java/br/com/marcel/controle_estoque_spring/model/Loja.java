package br.com.marcel.controle_estoque_spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loja {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_loja;
	@Column(name="nome_loja")
	private String nomeloja;
	private String cnpj_loja;
	private String endereco_loja;
	private String cidade_loja;
	
	
	public Loja(String nome, String cnpj, String endereco, String cidade) {
		this.nomeloja = nome;
		this.cnpj_loja = cnpj;
		this.endereco_loja = endereco;
		this.cidade_loja = cidade;
	}

	 public Loja() {
		// TODO Auto-generated constructor stub
	}
	public String getNome_loja() {
		return nomeloja;
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
		this.nomeloja = nome_loja;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[***\n Loja: "+getNome_loja()+"\n Codigo: "+getCod_loja()+"\n Cidade: "+getCidade_loja()+"\n ***";
	}

	public void removerLoja(int codigo) {
		if (codigo == getCod_loja()) {
			setCidade_loja(null);
			setCnpj_loja(null);
			setEndereco_loja(null);
			setCod_loja(0);
			setNome_loja(null);
		}
		
	}
}
