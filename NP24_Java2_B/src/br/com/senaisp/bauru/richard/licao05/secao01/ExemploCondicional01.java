package br.com.senaisp.bauru.richard.licao05.secao01;

public class ExemploCondicional01 {

	public static void main(String[] args) {
		int idade = 63;
		boolean bPodeDirigir = idade >= 18 && idade <= 65;
		System.out.println("A pessoa de " + idade + " anos " + (bPodeDirigir ? "Pode" : "Não Pode") + " Dirigir");
	}

}
