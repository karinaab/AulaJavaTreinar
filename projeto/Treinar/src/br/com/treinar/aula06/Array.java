package br.com.treinar.aula06;

public class Array {
	public static void main(String[] args) {
		int[] vetor = new int[3];
		
		vetor[0] = 100;
		vetor[1] = 200;
		vetor[2] = 300;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor[" + i + "]: " + vetor[i]);
		} 
		
		for (int valor : vetor) {
			System.out.println("Vetor: " + valor);
		}
		
	}

}
