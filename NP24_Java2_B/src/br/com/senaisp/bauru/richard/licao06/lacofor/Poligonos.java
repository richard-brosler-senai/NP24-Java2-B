package br.com.senaisp.bauru.richard.licao06.lacofor;

public class Poligonos {
	public void montarQuadrado() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				System.out.print(""+lin+col+" ");
			}
			System.out.println();
		}
	}	
	public void montarTrianguloInferior() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col<=lin) {//teste
					System.out.print(""+lin+col+" ");
				} else {
					System.out.print("   ");//3 espaços
				}
			}
			System.out.println();
		}		
	}
	public void montarTrianguloSuperior() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col>=lin) {
					System.out.print(""+lin+col+" ");
				} else {
					System.out.print("   ");//3 espaços
				}
			}//fim for col
			System.out.println();
		}//fim for lin		
	}
	public void montarDiagonalPrincipal() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col==lin) {
					System.out.print(""+lin+col+" ");
				} else {
					System.out.print("   ");//3 espaços
				}
			}//fim for col
			System.out.println();
		}//fim for lin		
	}
	public void montarDiagonalInvertida() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col+lin==9) {
					System.out.print(""+lin+col+" ");
				} else {
					System.out.print("   ");//3 espaços
				}
			}//fim for col
			System.out.println();
		}//fim for lin		
	}
	public void montarX() {
		for(int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col+lin==9 || lin == col) {
					System.out.print(""+lin+col+" ");
				} else {
					System.out.print("   ");//3 espaços
				}
			}//fim for col
			System.out.println();
		}//fim for lin		
	}
}
