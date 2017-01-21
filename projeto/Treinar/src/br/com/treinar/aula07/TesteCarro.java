package br.com.treinar.aula07;


public class TesteCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		boolean teste;
		
		carro1.setMarca("Fiat");
		carro1.setModelo("Uno");
		carro1.setCor("Prata");
		
		carro2.setMarca("Fiat");
		carro2.setModelo("Siena");
		carro2.setCor("Prata");
		
		teste = carro1.equals(carro2);
		String msg = teste ? "Igual" : "Diferente";
		System.out.println(msg);
		
		/*
		 * igual o de cima!
		 * 
		 * if (teste) {
			System.out.println("Os dois carros são iguais!");
		}else {
			System.out.println("Os dois carros NÃO são iguais!");
		}*/
		
	}
	
	
	

}
