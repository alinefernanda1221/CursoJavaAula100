package entidades;

/**
 * Entidade reponsável por armazenar as informações de
 * um cliente ligado a um pedido.
 * @author Aline Carvalho - alinefernanda1221@gmail.com
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private SimpleDateFormat formatarData = new SimpleDateFormat("(dd/MM/yyyy)");
	private String nome;
	private String email;
	private Date dataAniversario;
	
	//Construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome, String email, Date dataAniversario) {
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataAniversario() {
		return dataAniversario;
	}
	
	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public String toString() {
		return nome + " " + formatarData.format(dataAniversario) + " - " + email + "\n";
	}
}
