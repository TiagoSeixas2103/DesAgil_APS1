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
	

	public void adiciona(Produto produto_novo) {
		Pedido pedido_adicional = new Pedido(produto_novo);
		
		if (!this.pedidos.contains(pedido_adicional)){
			this.pedidos.add(pedido_adicional);
		}
		else {
			for (Pedido pedido_velho : this.pedidos) {
				pedido_velho.incremento();
			}
		}
		
		
		
				
	}			
	
	
}
