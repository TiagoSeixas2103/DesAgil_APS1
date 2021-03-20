package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public void incremento() {
		this.quantidade++;
	}
	
	public double totalPedido() {
		double total_pedido = this.quantidade * this.produto.getPreco();
		return total_pedido;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	
	
}