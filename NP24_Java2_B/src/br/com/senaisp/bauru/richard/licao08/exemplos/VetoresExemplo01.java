package br.com.senaisp.bauru.richard.licao08.exemplos;

public class VetoresExemplo01 {

	public static void main(String[] args) {
		//Criando um vetor de 50 posições inteiras
		int[][] idades = new int[50][10];
		//Criando de forma estática vetores com o tamanho 4
		String[] cores = {"Azul", "Amarelo", "Vermelho", "Verde"};
		cores[2] = "Laranja";
		//Essa linha representa o mesmo que a anterior
		String[] cor_n = new String[4];
		cor_n[0] = new String("Azul");
		cor_n[1] = "Amarelo";
		cor_n[2] = "Vermelho";
		cor_n[3] = "Verde";
		//cor_n[4] = "Roxo"; //ArrayIndexOutOfBounds
		//Utilizando o for in
		for(String item : cores) {
			System.out.println(item);
		}
	}

}
