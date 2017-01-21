package projetoEscola;

public class Aluno {
	private String nome;
	private Integer idade;
	private Integer serie;
	private String turma;
	NotaMaterias notas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public Integer getSerie() {
		return serie;
	}
	
	public void setSerie(Integer serie) {
		this.serie = serie;
	}

}
