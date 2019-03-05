package entidades;

/**
 * Entidade reponsável por representar o item de um pedido.
 * @author Aline Carvalho - alinefernanda1221@gmail.com
 * 
 */

public class PedidoItem {

	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	//Construtores
	public PedidoItem() {
		
	}
	
	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	//Getters e Setters
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	//Métodos da classe - Regras de Negócio
	public Double subTotal() {
		return quantidade * preco;
	}
	
	public String toString() {
		return "\n" + produto.getNome() + " $" + preco + ", Quantidade: " + quantidade + ", Subtotal: " + subTotal(); 
	}
}

