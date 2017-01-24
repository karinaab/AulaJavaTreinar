package br.com.treinar.aula08;

public class AtividadeEnum {
	public static void main(String[] args) {
		
		Integer i = 1;
		Sexo[] sexos = Sexo.values();
		Sexo s = sexos[i];
		
		System.out.println(s);
		
	}

}
