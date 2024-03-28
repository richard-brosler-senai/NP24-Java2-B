package br.com.senaisp.bauru.richard.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//Instanciando terminal
		Terminal tm = new Terminal();
		
		
		//Criando um máquina
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		m1.lerCartao(ct01);
		
	}

}
