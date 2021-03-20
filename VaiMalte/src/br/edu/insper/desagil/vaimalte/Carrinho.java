package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		this.pedidos = new ArrayList<>();
	}
	
	public void adiciona(Produto produto_novo) {
		
		for (Pedido pedido: pedidos) {
			
			if (pedido.getProduto() == produto_novo) {
				pedido.incremento();}
			
		Pedido pedido_adicional = new Pedido(produto_novo);
		pedidos.add(pedido_adicional);
		
		}
			
			
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	
	
}
