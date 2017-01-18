package br.com.treinar.aula05;

import java.util.Date;

public class Cliente {

	public String nome;
	public String endereco;
	public Date dataNascimento;//Importado do pacote java util
	public Integer documento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Integer getDocumento() {
		return documento;
	}
	
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento
				+ ", documento=" + documento + "]";
	}
	
	
}
