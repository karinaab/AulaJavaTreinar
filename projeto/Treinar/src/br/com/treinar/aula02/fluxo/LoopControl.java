package br.com.treinar.aula02.fluxo;

public class LoopControl {
	public static void main(String[] args) {
		int x = 10;
		
		//WHILE
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
			System.out.println("Dentro do DO WHILE - " + x);
			x++;
		}while (x < 13);
		
		//FOR
		for(int a = 1; a <= 5; a++){
			System.out.println(a + "\tKarina");
		}
		
	}
}
