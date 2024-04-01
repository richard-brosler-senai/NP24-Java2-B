package br.com.senaisp.bauru.richard.licao08.exercicio;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {
	private Carta[] bar;
	private Random rnd;
	private ArrayList<Integer> lstSorteados;
	
	public Baralho() {
		bar = new Carta[52];
		rnd = new Random();
		lstSorteados = new ArrayList<Integer>();
		//Montagem do baralho
		for (int np=0;np<4;np++) {
			for (int nm=0;nm<13;nm++) {
				//Criando a carta
				bar[np*13+nm] = new Carta(np,nm);
			}
		}
	}
	
	public Carta getCartaAleatoria() {
		int num = 0;
		//Laço para garantir que será sorteado um número que não
		//tenha saido
		do {
			num = rnd.nextInt(52);
		}while (lstSorteados.indexOf(num)!=-1 && 
				lstSorteados.size()<52);
		//Adicionando o número a lista de sorteados
		lstSorteados.add(num);
		//Retornando a carta sorteada
		return bar[num];
	}
}
