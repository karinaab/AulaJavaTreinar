package br.com.treinar.aula02.operadores;

public class operacoes {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 8;
		float l = 1.56f;
		
		//ADIÇÃO
		System.out.println(i + j);
		String nome = "Karina";
		String sobrenome = " Azevedo";
		String fullName = nome + sobrenome;
		System.out.println(fullName);
		
		//SUBTRAÇÃO
		System.out.println(i - j);
		
		//DIVISÃO
		float result = j / k;
		System.out.println(j / i);
		System.out.println(i / k); //divisao entre numeros inteiros é sempre inteiro
		System.out.println(result);
		
		result = i / l;
		System.out.println(result);
		result = j / l;
		System.out.println(result);
		result = (float) i / k; //assim a divisao de inteiros resulta em fracionário
		System.out.println(result);
		
		System.out.println("Resto da divisao 10/8 = " + i % k); //resto da divisao

	}
}
