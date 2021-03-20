package br.edu.insper.desagil.vaimalte;



public class Testador {
	public boolean testeA() {
		Carrinho carrinho_a = new Carrinho();
		Caixa caixa_a = new Caixa();
		
		if (caixa_a.totalCarrinho(carrinho_a) == 0){
			return true;
		}						
	    return false;
	}

	public boolean testeB() {
		Carrinho carrinho_b = new Carrinho();
		Produto produto_b = new Produto(1, "Regata branca", 20.00);
		
		carrinho_b.adiciona(produto_b);
		
		Caixa caixa_b = new Caixa();
		
		if (caixa_b.totalCarrinho(carrinho_b) == 20) {
			return true;
		}
		
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinho_c = new Carrinho();
		Produto produto_c = new Produto(4,"Calça jeans",120.00);
		
		carrinho_c.adiciona(produto_c);
		
		Caixa caixa_c = new Caixa();
		caixa_c.inserir(produto_c, 10);
		
		
		if (caixa_c.totalCarrinho(carrinho_c) == 108){
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho_d = new Carrinho();
		Produto produto_d = new Produto(25, "Jaqueta Preta",500.00);
		Produto produto_d2 = new Produto(40, "Air jordan 1",1000.00);
		
		carrinho_d.adiciona(produto_d);
		carrinho_d.adiciona(produto_d2);
		carrinho_d.adiciona(produto_d2);
		
		Caixa caixa_d = new Caixa();
		caixa_d.inserir(produto_d, 10);
		
		
		if (caixa_d.totalCarrinho(carrinho_d) == 2450.0){
			return true;
		}
		
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinho_e = new Carrinho();
		Produto produto_e = new Produto(15, "Gravata",90.00);
		Produto produto_e2 = new Produto(65, "Anel",350.00);		
		
		carrinho_e.adiciona(produto_e);
		carrinho_e.adiciona(produto_e2);
		carrinho_e.adiciona(produto_e2);
		
		Caixa caixa_e = new Caixa();
		caixa_e.inserir(produto_e2, 50);
		
		if (caixa_e.totalCarrinho(carrinho_e) == 440.0){
			return true;
		}
		
	    return false;
	}
}
