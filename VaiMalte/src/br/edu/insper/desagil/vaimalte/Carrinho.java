package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	
	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	

	public void adiciona(Produto produtoNovo) {
		Pedido pedidoAdicional = new Pedido(produtoNovo);
		
		if (!this.pedidos.contains(pedidoAdicional)){
			this.pedidos.add(pedidoAdicional);
		}
		else {
			for (Pedido pedidoVelho : this.pedidos) {
				pedidoVelho.incremento();
			}
		}
		
		
		
				
	}			
	
	
}
