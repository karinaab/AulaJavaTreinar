package br.com.treinar.aula04;

import java.util.Scanner;

public class Matricula {
	String disciplina;
	int numDisciplina;
	String nome;
	int idade;

	public void inserirDados() {
		Scanner leitor = new Scanner(System.in);
		System.out.print("\tNome do aluno: ");
		nome = leitor.nextLine();
		System.out.print("Idade do aluno: ");
		idade = leitor.nextInt();
		leitor.nextLine();
		
		/*if (idade < 15) {
			
			System.exit(0);
		}*/

		System.out.print("Disciplina disponiveis: ");
		System.out.println("ingles (I) e espanhol (E).");

		System.out.print("\tDisciplina desejada (I ou E): ");
		disciplina = leitor.nextLine();
		leitor.close();
		System.out.println("\n");
	}

	public String alocarAluno(int idade){
		String nivel;
		if (idade >= 25) {
			nivel = "III";
			return nivel;
		} else if (idade >= 20) {
			nivel = "II";
			return nivel;
		}else if (idade >= 15){
			nivel = "I";
			return nivel;
		}else return "N";
	}
}
