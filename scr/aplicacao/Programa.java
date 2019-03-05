package aplicacao;

/**
 * Programa para criar pedidos e posteriormente informar ao
 * usuário, os dados do pedido criado.
 * @author Aline Carvalho - alinefernanda1221@gmail.com
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import enums.StatusPedidoEnum;

public class Programa {

	public static void main(String[] args) throws ParseException {
		//Auxiliares
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Instanciação dos objetos
		Cliente cliente = new Cliente();
		StatusPedidoEnum statusPedido = null;
		Pedido pedido = new Pedido();
		PedidoItem pedidoItem = new PedidoItem();
		
		//Entrada/Saída de dados
		System.out.println("\n*-----------------------  Informe os dados do cliente  -----------------------*\n");
		System.out.print("Nome: ");
		cliente.setNome(sc.next());
		
		System.out.print("E-mail: ");
		cliente.setEmail(sc.next());
		
		System.out.print("Data de aniversário (dd/MM/aaaa): ");
		cliente.setDataAniversario(sdf.parse(sc.next()));
		pedido.setCliente(cliente);

		System.out.println("\n*-----------------------------  Dados do pedido  -----------------------------*\n");
		System.out.print("Status: ");
		String status = sc.next().toUpperCase();
		pedido.setStatusPedidoEnum(statusPedido.valueOf(status));
		
		System.out.print("Quantidade de itens do pedido: ");
		int quantidadeItens = sc.nextInt();

		for(int i = 1; i <= quantidadeItens; i++) {
			Produto produto = new Produto();

			System.out.print("==> Entre com os dados do item #" + i + " <==");
			System.out.print("\nNome do produto: ");
			produto.setNome(sc.next());
			
			System.out.print("Preco do produto: ");
			produto.setPreco(sc.nextDouble());
			
			System.out.print("Quantidade: ");			
			int quantidade = sc.nextInt();
			
			pedidoItem = new PedidoItem(quantidade, produto.getPreco(), produto);
			pedido.adicionaItem(pedidoItem);
			
			System.out.println("\n");
		}
		
		pedido.setDataDoPedido(new Date());

		//Dados do pedido criado
		System.out.println("\n*------------------------------  Pedido gerado  ------------------------------*\n");
		System.out.print(pedido);
		
		sc.close();
	}

}
