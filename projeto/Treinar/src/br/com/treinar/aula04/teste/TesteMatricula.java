package br.com.treinar.aula04.teste;

import br.com.treinar.aula04.Matricula;

public class TesteMatricula {
	public static void main(String[] args) {
		Matricula matricula = new Matricula();
		
		matricula.inserirDados();
		System.out.println("Aluno matriculado com sucesso!\n");
		matricula.mostrarDados(matricula.aluno);
	}

}
