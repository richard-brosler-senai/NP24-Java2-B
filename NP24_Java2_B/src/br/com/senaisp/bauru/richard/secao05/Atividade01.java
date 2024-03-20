package br.com.senaisp.bauru.richard.secao05;

import javax.swing.JOptionPane;

public class Atividade01 {

	public static void main(String[] args) {
		//Pergunta 0
		boolean resp = JOptionPane 
				.showConfirmDialog(null, 
						"Você quer mesmo participar do Show do Milhão?", 
						"Participação",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE) 
					== JOptionPane.YES_OPTION;
		if (resp) {
			//Pergunta 1
			String nome = (String)JOptionPane.showInputDialog(null,
					"Qual o seu nome?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					null,
					"Digite seu nome aqui.");
			//Pergunta 2
			String xIdade = (String)JOptionPane.showInputDialog(null,
					"Qual a sua idade?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					null,
					"Digite sua idade aqui.");
			
			int idade = Integer.parseInt(xIdade);
			int anoNascimento = 2024 - idade;
			//Pergunta 3
			String xSalario= (String)JOptionPane.showInputDialog(null,
					"Qual a sua renda mensal em salários mínimos?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					null,
					"Digite sua renda mensal aqui.");
			double salario = Double.parseDouble(xSalario);
			//Pergunta 4
			String xDissidio = (String)JOptionPane.showInputDialog(null,
					"Qual foi o percentual do seu dissídio esse ano?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					null,
					"Digite o valor percentual aqui.");
			double dissidio = Double.parseDouble(xDissidio);
			double novoSalario = salario * (1 + dissidio / 100);
			String[] opcoesSair = {"Casa da Sogra","Barzinho do Zé", 
							   "Campos do Jordão", "Bora Bora"};
			//Pergunta 5
			String jantar = (String)JOptionPane.showInputDialog(null,
					"Quais das opções abaixo você escolheria para um jantar romântico?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoesSair,
					opcoesSair[1]);
			//Pergunta 6
			String prato = (String)JOptionPane.showInputDialog(null,
					"Qual seu prato preferido?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					null,
					"Digite o tipo do seu prato aqui.");
			JOptionPane.showMessageDialog(null, "Vamos começar com a pergunta que vale R$ 5.000,00");
			String[] opcoesBrasil = {"Pedro Joarez","Niquinho da Viola", 
					   "Índios", "Pedro Álvares Cabral"};
			//Pergunta 7
			String descobrimento = (String)JOptionPane.showInputDialog(null,
					"Quem descobriu o Brasil?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoesBrasil,
					opcoesBrasil[0]);
			JOptionPane.showMessageDialog(null, "Vamos a pergunta que vale R$ 10.000,00");
			String[] opcoesProg = {
						"Rene Descartes",
						"Stan Lee", 
						"Ada Lovelace",
						"Joãozinho Dedos de Águia" 
						};
			//Pergunta 8
			String primeiroProg = (String)JOptionPane.showInputDialog(null,
					"Quem foi o primeiro(a) programador(a) da história?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoesProg,
					opcoesProg[0]);
			String[] opcoesApp = {
						"Bill Clinton",
						"Bill Gates", 
						"Steve Jobs",
						"Mario Esteves" 
						};
			JOptionPane.showMessageDialog(null, "Vamos a pergunta que vale R$ 15.000,00");
			//Pergunta 9
			String apple = (String)JOptionPane.showInputDialog(null,
					"Quem foi o dono da Apple?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoesApp,
					opcoesApp[0]);
			JOptionPane.showMessageDialog(null, "Vamos a pergunta que vale R$ 1.000.000,00");
			//Pergunta 10
			String[] opcoesSch = {
					"João Madureira",
					"Liceu Abreu", 
					"Academia de Loucos",
					"Senai" 
					};
			String ensino = (String)JOptionPane.showInputDialog(null,
					"Qual é a melhor instituição de Ensino Técnico do Brasil?",
					"Show do Milhão",
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoesSch,
					opcoesSch[0]);
			//Montando a mensagem final
			String mensagem = "Parabéns " + nome + ", desde " +
					anoNascimento + 
					" vem dando trabalho para seus pais, "+
					" e até hoje com seus " + idade + ".\n" + 
					"Que interessante isso, você até tentou ser "+
					apple + ", mas seus estudos no(a) "+ 
					ensino + " não permitiram isso.\n" +
					"Pensou que conseguiria levar aquela garota "+
					"para jantar em "+ jantar + ", mas seu salário "+
					"infelizmente é baixo, você precisaria ganhar pelo menos\n"+
					"o dobro de " + salario + ", mas infelizmente seu dissídio foi "+
					"somente " + dissidio + " que resultou em " + novoSalario;
			//Mostrando a mensagem
			JOptionPane.showMessageDialog(null, mensagem);
			
		} else {
			JOptionPane.showMessageDialog(null, "Tudo bem, até logo!");
		}
	}

}
