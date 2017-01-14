package br.com.treinar.aula04;

public class Escola {
	public static void main(String[] args) {
		String nivel;
		Matricula matricula = new Matricula();
		
		System.out.println("Vamos comecar a matricula!");
		matricula.inserirDados();
		nivel = matricula.alocarAluno(matricula.idade);
		
		
		
		if (!nivel.equals("N")){
			System.out.println(matricula.nome + " foi matriculado na disciplina " + matricula.disciplina + " " + nivel);
		}else{
			System.out.println(matricula.nome + " não foi matriculado na disciplina " + matricula.disciplina);
			System.out.println("Aluno está na faixa etária.");
		}
		
		
	}
}
