package entidades;

/**
 * Entidade reponsável por armazenar as informações de
 * um produto ligado a entidade PedidoItem.
 * @author Aline Carvalho - alinefernanda1221@gmail.com
 */

public class Produto {
	
	private String nome;
	private Double preco;
	
	//Construtores
	public Produto() {
		
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
