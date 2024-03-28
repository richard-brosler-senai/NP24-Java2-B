package br.com.senaisp.bauru.richard.licao07.exercicio;

import java.util.Random;

public class MaquinaFliperama {
	private Random rnd;
	private int custoCredito;
	private String nomeJogo;
	//Constructor
	public MaquinaFliperama(String nome) {
		nomeJogo = nome;
		rnd = new Random();
		custoCredito = rnd.nextInt(5)+1;
	}
	//Métodos
	public int getCustoCredito() {
		return custoCredito;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void lerCartao(Cartao ct) {
		if (custoCredito<=ct.getCreditos()) {
			int cr = ct.getCreditos()-custoCredito;
			ct.setCreditos(cr);
			//ganhando os tickets
			cr = ct.getTickets() + rnd.nextInt(10) + 1;
			ct.setTickets(cr);
		} else {
			System.out.println("Que pena! Acabou-se seus créditos! :(");
		}
		//Mostrando os creditos
		System.out.println(ct);
	}
}
