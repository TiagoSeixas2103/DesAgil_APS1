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
			dicionario.put(produto.getCodigo(),inteiro);
		}
	}
	
}
