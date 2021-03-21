package br.edu.insper.desagil.vaimalte;



public class Testador {
	public boolean testeA() {
		Carrinho carrinhoA = new Carrinho();
		Caixa caixaA = new Caixa();
		
		double valorA =  caixaA.totalCarrinho(carrinhoA);
		
		if (valorA == 0){
			return true;
		}						
	    return false;
	}

	public boolean testeB() {
		Carrinho carrinhoB = new Carrinho();
		Produto produtoB = new Produto(1, "Regata branca", 20.00);
		
		carrinhoB.adiciona(produtoB);
		
		Caixa caixaB = new Caixa();
		
		double valorB = caixaB.totalCarrinho(carrinhoB);
		
		
		if (valorB == 20.0) {
			return true;
		}
		
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinhoC = new Carrinho();
		Produto produtoC = new Produto(4,"Calça jeans",120.00);
		
		carrinhoC.adiciona(produtoC);
		
		Caixa caixaC = new Caixa();
		caixaC.inserir(produtoC, 10);
		
		double valorC = caixaC.totalCarrinho(carrinhoC);
		
		
		if (valorC == 108.00){
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinhoD = new Carrinho();
		Produto produtoD = new Produto(25, "Jaqueta Preta",500.00);
		Produto produtoD2 = new Produto(40, "Air jordan 1",1000.00);
		
		carrinhoD.adiciona(produtoD);
		carrinhoD.adiciona(produtoD2);
		carrinhoD.adiciona(produtoD2);
		
		Caixa caixaD = new Caixa();
		caixaD.inserir(produtoD, 10);
		
		double valorD = caixaD.totalCarrinho(carrinhoD);
		
		if (valorD == 2450.00){
			return true;
		}
		
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinhoE = new Carrinho();
		Produto produtoE = new Produto(15, "Gravata",90.00);
		Produto produtoE2 = new Produto(65, "Anel",350.00);		
		
		carrinhoE.adiciona(produtoE);
		carrinhoE.adiciona(produtoE2);
		carrinhoE.adiciona(produtoE2);
		
		Caixa caixaE = new Caixa();
		caixaE.inserir(produtoE2, 50);
		
		double valorE = caixaE.totalCarrinho(carrinhoE);
		
		if (valorE == 440.00){
			return true;
		}
		
	    return false;
	}
}
