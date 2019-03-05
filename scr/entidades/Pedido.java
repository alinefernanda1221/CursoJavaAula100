package entidades;

/**
 * Armazena as informações de um pedido: Data, Cliente, 
 * Itens e Status, e, posteriormente retorna um texto com 
 * todas as informações do pedido criado
 * -> INFORMAÇÕES DO PEDIDO <-.
 * @author Aline Carvalho - alinefernanda1221@gmail.com
 * 
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.StatusPedidoEnum;

public class Pedido {
	
	private static SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date dataDoPedido;
	private StatusPedidoEnum statusPedidoEnum;
	private List<PedidoItem> listaDeItens = new ArrayList<>();
	private Cliente cliente;

	// Construtores
	public Pedido() {

	}

	public Pedido(Date dataDoPedido, StatusPedidoEnum statusPedidoEnum, List<PedidoItem> listaDeItens, Cliente cliente) {
		this.dataDoPedido = dataDoPedido;
		this.statusPedidoEnum = statusPedidoEnum;
		this.listaDeItens = listaDeItens;
		this.setCliente(cliente);
	}

	// Getters e Setters
	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public StatusPedidoEnum getStatusPedidoEnum() {
		return statusPedidoEnum;
	}

	public void setStatusPedidoEnum(StatusPedidoEnum statusPedidoEnum) {
		this.statusPedidoEnum = statusPedidoEnum;
	}
	
//	public List<PedidoItem> getPedidoItem(){
//		return pedidoItem;
//	}
//	
//
//	public void setPedidoItem(List<PedidoItem> pedidoItem) {
//		this.pedidoItem = pedidoItem;
//	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	// Métodos da classe
	public void adicionaItem(PedidoItem pedidoItem) {
		listaDeItens.add(pedidoItem);
	}

	public void removeItem(PedidoItem pedidoItem) {
		listaDeItens.remove(pedidoItem);
	}
	
	public Double total() {
		Double total = 0.0;
		for(PedidoItem pedidoItem : listaDeItens) {
			total += pedidoItem.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("INFORMAÇÕES DO PEDIDO \n");
		sb.append("Data do pedido: " + formatarData.format(getDataDoPedido()) + "\n");
		sb.append("Status do Pedido: " + getStatusPedidoEnum() + "\n");
		sb.append(cliente.toString());
		sb.append("Itens do Pedido: ");
		
		for(PedidoItem pedidoItem: listaDeItens) {
			sb.append(pedidoItem.toString());
		}
		sb.append("\nValor Total: $" + total());

		return sb.toString();
	}
}
