package projetoEscola;

import java.util.Scanner;

public class Matricula {
	public Aluno aluno;
	
	public Matricula(){
		aluno = new Aluno();
	}
	
	public void inserirDados() {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Nome: ");
		aluno.setNome(leitor.nextLine());
		System.out.print("Idade: ");
		aluno.setIdade(leitor.nextInt());
		leitor.nextLine();

		System.out.print("Série: ");
		aluno.setSerie(leitor.nextInt());
		leitor.nextLine();
		System.out.print("Em qual turma gostaria de participar (A, B, C ou D)? ");
		aluno.setTurma(leitor.nextLine());
		leitor.close();
		System.out.println("\n");
	}
	
	public void mostrarDados(Aluno aluno){
		System.out.println("Nome:\t" + aluno.getNome());
		System.out.println("Idade:\t" + aluno.getIdade());
		System.out.println("Série:\t" + aluno.getSerie());
		System.out.println("Turma:\t" + aluno.getTurma());
		System.out.println("\n");
	}
	
	
}
