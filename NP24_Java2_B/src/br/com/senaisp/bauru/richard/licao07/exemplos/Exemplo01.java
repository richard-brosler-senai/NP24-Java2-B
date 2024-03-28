package br.com.senaisp.bauru.richard.licao07.exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		System.out.println("Nr. Conta: "+ c1.getNumeroConta());
		ContaBancaria c4 = new ContaBancaria();
		System.out.println("Nr. Conta: "+ c4.getNumeroConta());
		
		//System.out.println(ContaBancaria.ultNumero);

		//c1.setAgencia(1900);
		//c1.setBanco(341);
		c1.setNumeroConta(12345);
		//c1.setSaldo(-10);
		ContaBancaria c2 = c1;
		System.out.println(c1.getSaldo());
		c2.setSaldo(50);
		System.out.println(c1.getSaldo());
		adicionarValor(c1,100.00);
		System.out.println(c1.getSaldo());
		//Conta passando valores no constructor
		ContaBancaria c3 = new ContaBancaria(123, 2, 1478, 65);
		System.out.println(c3.getSaldo());
	}

	private static void adicionarValor(ContaBancaria ca1, double d) {
		//ca1.saldo = ca1.saldo + d;
		ca1.setSaldo(ca1.getSaldo() + d);
	}

}




