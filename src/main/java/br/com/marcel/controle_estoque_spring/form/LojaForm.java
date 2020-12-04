package br.com.marcel.controle_estoque_spring.form;

import br.com.marcel.controle_estoque_spring.model.Cliente;
import br.com.marcel.controle_estoque_spring.model.Loja;
import br.com.marcel.controle_estoque_spring.repository.ClienteRepository;

//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import org.hibernate.validator.constraints.Length;


public class LojaForm {
	
	//@NotNull @NotEmpty @Length(min = 5)
	private String nome_loja;
	
	//@NotNull @NotEmpty @Length(min = 10)
	private String cnpj_loja;
	
	//@NotNull @NotEmpty
	private String endereco_loja;
	
	//@NotNull @NotEmpty
	private String cidade_loja;


	public String getNome_loja() {
		return nome_loja;
	}

	public void setNome_loja(String nome_loja) {
		this.nome_loja = nome_loja;
	}

	public String getCnpj_loja() {
		return cnpj_loja;
	}

	public void setCnpj_loja(String cnpj_loja) {
		this.cnpj_loja = cnpj_loja;
	}

	public String getEndereco_loja() {
		return endereco_loja;
	}

	public void setEndereco_loja(String endereco_loja) {
		this.endereco_loja = endereco_loja;
	}
	public String getCidade_loja() {
		return cidade_loja;
	}

	public void setCidade_loja(String cidade_loja) {
		this.cidade_loja = cidade_loja;
	}

	public Loja converter() {
		return new Loja(nome_loja, cnpj_loja, endereco_loja, cidade_loja);
	}
}
