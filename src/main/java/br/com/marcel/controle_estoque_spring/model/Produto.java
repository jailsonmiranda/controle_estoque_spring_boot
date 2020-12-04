//package br.com.marcel.controle_estoque_spring.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Produto {
//	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int cod_produto;
//	private String nome_produto;
//	private double valor_produto;
//	private int quantidade_produto;
//	private String descricao_produto;
//	@ManyToOne
//	Categoria categoria;
//	
//	public Produto(String nome, double valor, int quantidade, String descricao, Categoria cat) {
//		this.nome_produto = nome;
//		this.valor_produto = valor;
//		this.quantidade_produto = quantidade;
//		this.descricao_produto = descricao;
//		this.categoria = cat;
//	}
//	
//	public Produto() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//	public String getNome_produto() {
//		return nome_produto;
//	}
//	public double getValor_produto() {
//		return valor_produto;
//	}
//	public int getCod_produto() {
//		return cod_produto;
//	}
//	public String getDescricao_produto() {
//		return descricao_produto;
//	}
//	
//	 public int getQuantidade_produto() {
//		return quantidade_produto;
//	}
//
//	public void setNome_produto(String nome_produto) {
//		this.nome_produto = nome_produto;
//	}
//
//	public void setValor_produto(double valor_produto) {
//		this.valor_produto = valor_produto;
//	}
//
//	public void setCod_produto(int cod_produto) {
//		this.cod_produto = cod_produto;
//	}
//
//	public void setQuantidade_produto(int quantidade_produto) {
//		this.quantidade_produto = quantidade_produto;
//	}
//
//	public void setDescricao_produto(String descricao_produto) {
//		this.descricao_produto = descricao_produto;
//	}
//
//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}
//
//	public void removerProduto(int codigo) {
//		if (codigo == getCod_produto()) {
//			setCategoria(null);
//			setCod_produto(0);
//			setDescricao_produto("");
//			setNome_produto("");
//			setQuantidade_produto(0);
//			setValor_produto(0);
//		}
//		
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "\n Produto: "+getNome_produto()+"\n Codigo: "+getCod_produto()+"\n Descrição: "+getDescricao_produto()+"\n Valor: "+
//				getValor_produto()+"\n Quantidade em Estoque: "+getQuantidade_produto()+"\n";
//	}
//	
//	public String toStringPedido() {
//		return "\n Produto: "+getNome_produto()+"\n Codigo: "+getCod_produto()+"\nValor: "+
//				getValor_produto()+"\n";
//	}
//}
