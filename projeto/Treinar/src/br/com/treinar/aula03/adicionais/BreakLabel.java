package br.com.treinar.aula03.adicionais;

public class BreakLabel {
	public static void main(String[] args) {
		int x = 10;
		
		ponto:
		while (true){
			while (x < 17) {
			System.out.println("Numero igual a " + x);
			if (++x == 14) {
				break ponto; //se fosse apenas break iria sair apenas desse 2° while e 
								//continuaria as linhas de código do 1° while.
			}
			
		}
		}
		System.out.println("Break Label funcionou.");
		
	}
}
