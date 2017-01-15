package br.com.treinar.aula03.adicionais;

import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //coletor de dados
		
		System.out.print("Nome que será repetido: ");
		String nome = leitor.nextLine(); //'leitor' coleta a palavra digitada e atribui a 'nome'.
		
		System.out.print("Quantidade: ");
		int quantidade = leitor.nextInt(); //'leitor' coleta o número digitado e atribui a 'quantidade'.
		
		leitor.close();
		
		for(int a = 1; a <= quantidade; a++){
			System.out.println(a + "\t" + nome);
		}
		
	}

}
