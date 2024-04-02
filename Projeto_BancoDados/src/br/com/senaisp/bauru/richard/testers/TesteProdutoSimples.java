package br.com.senaisp.bauru.richard.testers;

import br.com.senaisp.bauru.richard.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
		ProdutoSimples prd = new ProdutoSimples();
		try {
			prd.setId(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(prd.getId());
	}

}
