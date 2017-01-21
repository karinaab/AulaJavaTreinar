package br.com.treinar.aula02.fluxo;

public class LoopControl {
	public static void main(String[] args) {
		int x = 10;
		
		//WHILE
		System.out.println("\nWHILE: ");
		while (x < 14) {
			System.out.println("Numero igual a " + x);
			//x++;
			if (++x == 12) {
				break;
			}
		}
		
		x = 10;
		
		//DO WHILE
		do {
			System.out.print("\nDentro do DO WHILE - " + x);
			x++;
		}while (x < 13);
		
		//FOR
		System.out.println("\n\nFOR: ");
		for(int a = 1; a <= 5; a++){
			System.out.println(a);
		}
		
		//FOREACH
		System.out.print("\nFOREACH: ");
		int[] array = new int[4];
		x = 10;
		
		for (int valor : array) {
			valor = x++;
			System.out.print("\nValor: " + valor);
		}
		
	}
}
