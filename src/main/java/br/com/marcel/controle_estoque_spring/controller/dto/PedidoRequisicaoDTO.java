package br.com.marcel.controle_estoque_spring.controller.dto;
//package br.com.marcel.controle_estoque_spring.model;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//
//@Entity
//public class PedidoRequisicao {
//	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int cod_pedido_requisicao;
//	private double valor_total_pedido_requisicao;
//	@ManyToOne
//	private List<Produto> produtos = new ArrayList<Produto>();
//	@OneToMany
//	private Loja idLoja;
//	@OneToMany
//	private Fornecedor IdForn;
//	private LocalDateTime datapedido =LocalDateTime.now();
//	
//	public PedidoRequisicao(double valor, List<Produto> produto, Loja id, Fornecedor idf) {
//		this.valor_total_pedido_requisicao = valor;
//		this.produtos = produto;
//		this.idLoja = id;
//		this.IdForn = idf;
//	}
//	public PedidoRequisicao() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public int getCod_pedido() {
//		return cod_pedido_requisicao;
//	}
//
//	public double getValor_total_pedido() {
//		return valor_total_pedido_requisicao;
//	}
//
//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//	public void setCod_pedido_requisicao(int cod_pedido_requisicao) {
//		this.cod_pedido_requisicao = cod_pedido_requisicao;
//	}
//	public void setValor_total_pedido_requisicao(double valor_total_pedido_requisicao) {
//		this.valor_total_pedido_requisicao = valor_total_pedido_requisicao;
//	}
//	public void setIdLoja(Loja idLoja) {
//		this.idLoja = idLoja;
//	}
//	
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}
//	
//	public Loja getIdLoja() {
//		return idLoja;
//	}
//	
//	public LocalDateTime getDatapedido() {
//		return datapedido;
//	}
//	
//	public Fornecedor getIdForn() {
//		return IdForn;
//	}
//	public void removerPedido(int codigo) {
//		setCod_pedido_requisicao(0);
//		setIdLoja(null);
//		setProdutos(null);
//		setValor_total_pedido_requisicao(0);	
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Pedido: "+getCod_pedido()+"\n Fornecedor: "+IdForn.getNome_fornecedor()+"\n Loja: "+idLoja.getNome_loja()+" Produtos: "+produtos.toString()+"\n Valor Total: "+getValor_total_pedido();
//	}
//}
