package br.com.treinar.aula05;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Gleidson");
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println(cliente);
	}

}
