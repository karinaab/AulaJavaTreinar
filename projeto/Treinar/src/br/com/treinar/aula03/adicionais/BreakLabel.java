package br.com.treinar.aula03.adicionais;

public class BreakLabel {
	public static void main(String[] args) {
		int x = 10;
		
		ponto:
		while (true){
			while (x < 17) {
			System.out.println("Numero igual a " + x);
			if (++x == 14) {
				break ponto;
			}
		}
		}
		System.out.println("Break Label funcionou.");
		
	}
}
