package br.com.senaisp.bauru.richard.licao08.exercicio;

import java.util.Scanner;

public class JogoBlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baralho br = new Baralho();
		String jogador1, jogador2;
		int score1=0, score2=0;
		//Pedindo os nomes
		System.out.println("Digite o nome do jogador 1:");
		jogador1 = sc.nextLine();

		System.out.println("Digite o nome do jogador 2:");
		jogador2 = sc.nextLine();
		//Gerando as cartas para o Jogador 1
		System.out.println("Mostrando as cartas do player 1...");
		Carta ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score1 += ct.getValor();
		System.out.println(ct);
		
		System.out.println("Mostrando as cartas do player 2...");
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
		
		ct = br.getCartaAleatoria();
		score2 += ct.getValor();
		System.out.println(ct);
	}

}
