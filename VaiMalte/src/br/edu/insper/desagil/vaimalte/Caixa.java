package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> dicionario;

	public Caixa() {
		this.dicionario = new HashMap<>();
	}
	
	public void inserir(Produto produto, int inteiro) {
		
		if (inteiro <= 99 && inteiro >= 1){
			this.dicionario.put(produto.getCodigo(),inteiro);
		}
		
		else {
			int desconto = 0;
			this.dicionario.put(produto.getCodigo(),desconto);
		}
	}
	
	public double totalCarrinho(Carrinho carrinho) {
		
		double tot = 0.0;
		
		for (Pedido pedido : carrinho.getPedidos()) {
			
			if (this.dicionario.containsKey(pedido.getProduto().getCodigo())) {
				
				double descontoTotal;
				
				descontoTotal = this.dicionario.get(pedido.getProduto().getCodigo());
				 
				tot += pedido.totalPedido() * (1-(descontoTotal*0.01));
			}
			
			else {
				tot += pedido.totalPedido();
			}
			
		}
		
		return  tot;
		
				
		
	}
	
	
	
}
