package br.com.treinar.aula02.operadores;

public class Equal {
	public static void main(String[] args) {
		Caneta bic = new Caneta();
		Caneta pena = new Caneta();
		
		bic.cor = "Azul";
		bic.preco = 3.20;
		pena.cor = "Azul";
		pena.preco = 3.20;
		
		System.out.println(bic == pena);
		System.out.println(bic.cor == pena.cor);
		System.out.println(bic.preco == pena.preco);
		
		pena = bic;
		
		System.out.println(bic == pena);
		System.out.println(bic.cor == pena.cor);
		
		pena = new Caneta(); //nova referencia
		
		System.out.println(bic == pena);
	
		System.out.println("/------------/");
		
		boolean ehMaiorDeIdade = true;
		boolean possuiIngresso = false;
		boolean podeEntrar = ehMaiorDeIdade || possuiIngresso;
		
		System.out.println(podeEntrar);
		System.out.println(!podeEntrar);
		
		
	}
}
