package br.com.marcel.controle_estoque_spring.controller.dto;
//package br.com.marcel.controle_estoque_spring.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Vendedor {
//	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int cod_vendedor;
//	private String nome_vendedor;
//	private double salario_vendedor;
//	@ManyToOne
//	Loja id_loja;
//	
//	public Vendedor(String nome,double salario, Loja id) {
//		this.nome_vendedor = nome;
//		this.salario_vendedor = salario;
//		this.id_loja = id;
//	}
//	public Vendedor() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void setNome_vendedor(String nome_vendedor) {
//		this.nome_vendedor = nome_vendedor;
//	}
//
//
//	public void setCod_vendedor(int cod_vendedor) {
//		this.cod_vendedor = cod_vendedor;
//	}
//
//
//	public void setSalario_vendedor(double salario_vendedor) {
//		this.salario_vendedor = salario_vendedor;
//	}
//
//
//	public void setId_loja(Loja id_loja) {
//		this.id_loja = id_loja;
//	}
//
//
//	public String getNome_vendedor() {
//		return nome_vendedor;
//	}
//
//	public int getCod_vendedor() {
//		return cod_vendedor;
//	}
//
//	public double getSalario_vendedor() {
//		return salario_vendedor;
//	}
//
//	public Loja getId_loja() {
//		return id_loja;
//	}
//	public void removerVendedor(int codigo) {
//		if (codigo == getCod_vendedor()) {
//			setCod_vendedor(0);
//			setId_loja(null);
//			setNome_vendedor("");
//			setSalario_vendedor(0);
//		}
//		
//	}
//	
//	public void adicionarComissao() {
//		
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "***\n Vendedor: "+getNome_vendedor()+"\n Codigo: "+getCod_vendedor()+"\n Loja: "+getId_loja().getNome_loja()+"\n ***";
//	}
//	public void geraComissao(double valorfinal) {
//		this.salario_vendedor = this.salario_vendedor + (valorfinal*0.5);
//		
//	}
//}
