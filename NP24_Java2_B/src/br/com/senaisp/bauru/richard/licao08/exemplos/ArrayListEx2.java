package br.com.senaisp.bauru.richard.licao08.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListEx2 {
    public static void main(String args[]) {
    	ArrayList<Integer> lstInt = new ArrayList<Integer>();
    	Random rnd = new Random();
    	//Adicionando valores aleatórios de 1 a 200 na lista
    	for (int i=0;i<100;i++) {
    		lstInt.add(rnd.nextInt(200)+1);
    	}
    	//listar os valores gerados
    	for(int it : lstInt) {
    		System.out.println(it);
    	}
    	//Utilizando o iterator
    	System.out.println("Listando usando iterator");
    	Iterator<Integer> iter = lstInt.iterator();
    	while(iter.hasNext()) {
    		System.out.println(iter.next());
    	}
    	//removendo os pares => Isso pode dar problemas
    	//porque eu perco a referencia de indices
    	/*
    	for(int it : lstInt) {
    		if ( it%2==0 ) {
    			//removendo o item par
    			lstInt.remove(it);
    		}
    	}
    	*/
    	//Para resolver o problema, removendo a partir do
    	//indice do maior para o menor
    	for (int i=lstInt.size()-1;i>=0;i--) {
    		if (lstInt.get(i)%2==0) {
    			lstInt.remove(i);
    		}
    	}
        //Listando o resultante depois de retirado os valores
    	//Utilizando o listIterator
    	System.out.println("Listando o final");
    	ListIterator<Integer> lsIt = lstInt.listIterator();
    	while (lsIt.hasNext()) {
    		System.out.println(lsIt.next());
    	}
    	System.out.println("Mostrando o último novamente");
    	System.out.println(lsIt.previous());//volta um indice
    }
}
