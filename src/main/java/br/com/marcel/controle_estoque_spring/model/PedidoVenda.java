//package br.com.marcel.controle_estoque_spring.model;
//
//import java.time.LocalDate;
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
//@Entity
//public class PedidoVenda {
//	
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int cod_pedido_venda;
//	private double valor_total_pedido_venda;
//	@ManyToOne
//	List<Produto> prod = new ArrayList<Produto>();
//	@OneToMany
//	Cliente idCliente;
//	@OneToMany
//	Vendedor idVendedor;
//	private LocalDateTime datapedido =LocalDateTime.now();
//	
//	public PedidoVenda(double valor, List<Produto> produto, Cliente id, Vendedor idv) {
//		this.prod = produto;
//		this.idCliente = id;
//		this.valor_total_pedido_venda = valor;
//		this.idVendedor = idv;
//	}
//	public PedidoVenda() {
//	
//	}
//	public LocalDateTime getDatapedido() {
//		return datapedido;
//	}
//	public void setIdVendedor(Vendedor idVendedor) {
//		this.idVendedor = idVendedor;
//	}
//	
//	public Vendedor getIdVendedor() {
//		return idVendedor;
//	}
//	
//	@Override
//	public String toString() {
//		return "\n Pedido: "+getCod_pedido()+"\n Cliente: "+idCliente.getNome_cliente()+"\n Vendedor: "+idVendedor.getNome_vendedor()+"\n Produtos: "+prod.toString()+
//				"\n Valor total: "+getValor_total_pedido();
//	}
//
//	public int getCod_pedido() {
//		return cod_pedido_venda;
//	}
//
//	public double getValor_total_pedido() {
//		return valor_total_pedido_venda;
//	}
//
//	public List<Produto> getProdutos() {
//		return prod;
//	}
//	public void setValor_total_pedido_venda(double valor_total_pedido_venda) {
//		this.valor_total_pedido_venda = valor_total_pedido_venda;
//	}
//	public void setProd(List<Produto> prod) {
//		this.prod = prod;
//	}
//	public void setIdCliente(Cliente idCliente) {
//		this.idCliente = idCliente;
//	}
//	public void setDatapedido(LocalDateTime datapedido) {
//		this.datapedido = datapedido;
//	}
//	public void removerPedido(int codigo) {
//		if (codigo == getCod_pedido()) {
//			setValor_total_pedido_venda(0);
//			setDatapedido(null);
//			setProd(null);
//			setIdCliente(null);
//		}
//		
//	}
//}
