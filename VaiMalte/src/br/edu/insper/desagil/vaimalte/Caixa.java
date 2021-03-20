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
	}
	
	public double totalCarrinho(Carrinho carrinho) {
		
		double tot = 0.0;
		
		for (Pedido pedido : carrinho.getPedidos()) {
			
			if (this.dicionario.containsKey(pedido.getProduto().getCodigo())) {
				
				double desconto_total;
				
				desconto_total = dicionario.get(pedido.getProduto().getCodigo());
				 
				tot += pedido.totalPedido() * (1-(desconto_total*0.01));
			}
			
			else {
				tot += pedido.totalPedido();
			}
			
		}
		return  tot;
		
				
		
	}
	
	
	
}
