package br.com.senaisp.bauru.richard.licao05.secao01;

import java.util.Scanner;

public class VerificarData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bDtValida = false;
		int dia, mes, ano;
		do {
			System.out.println("Digite sua data de nascimento (dd/mm/aaaa):");
			String dNasc = sc.nextLine();
			Scanner sc2 = new Scanner(dNasc);
			try {
				sc2.useDelimiter("/");
				dia = sc2.nextInt();
				mes = sc2.nextInt();
				ano = sc2.nextInt();
				
				switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: bDtValida = dia>=1 && dia<=31; break;
				case 4:
				case 6:
				case 9:
				case 11: bDtValida = dia>=1 && dia<=30; break;
				case 2: bDtValida = dia>=1 && dia<=28 || 
									dia==29 && ano%4==0 && ano%100!=0 || 
									dia==29 && ano%100==0 && ano%400==0; break;
				}
				
			}catch(Exception e) {
				System.out.println("Data inválida!");
			}
			sc2.close();
		} while(!bDtValida);
	}

}
