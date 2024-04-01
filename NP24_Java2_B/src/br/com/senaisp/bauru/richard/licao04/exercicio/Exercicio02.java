package br.com.senaisp.bauru.richard.licao04.exercicio;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		String nome = JOptionPane.
				showInputDialog("Digite seu nome completo:");
		ProcessadorNome pn = new ProcessadorNome();
		System.out.println(pn.processarNome(nome));
	}

}
