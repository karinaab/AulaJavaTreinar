package projetoFloricultura;

import java.util.ArrayList;
import java.util.List;

public class Serviço {
	List<Cliente> clientes;
	List<Flor> flores;

	public Serviço() {
		clientes = new ArrayList<>();
		flores = new ArrayList<>();
	}

	public void inserirDados() {
		inserirDadosCliente();
		inserirDadosFlor();
	}

	public void comparacaoEquals() {
		System.out.println("\tComparação equals:");
		comparacaoEqualsCliente();
		System.out.println();
		comparacaoEqualsFlor();
		System.out.println();
		comparacaoEqualsVaso();
		System.out.println();
	}

	public void exibirDados() {
		exibirCliente();
		System.out.println();
		exibirFlores();
		System.out.println();
		exibirVasos();
	}

	public void inserirDadosCliente() {
		Cliente c1 = new Cliente();
		c1.setVasos(new ArrayList<>());
		c1.setNome("Joana");
		c1.setSobrenome("Silva");
		c1.setIdade(23);
		cadastrarVaso(c1,"pequeno", "branco", "residência");
		clientes.add(c1);

		Cliente c2 = new Cliente();
		c2.setNome("Joana");
		c2.setSobrenome("Martins");
		c2.setIdade(23);
		cadastrarVaso(c2);
		clientes.add(c2);

		Cliente c3 = new Cliente();
		c3.setNome("Lucas");
		c3.setSobrenome("Martins");
		c3.setIdade(23);
		cadastrarVaso(c3);
		clientes.add(c3);
	}
	
	public void comparacaoEqualsCliente() {

		if (clientes.get(0).equals(clientes.get(1))) {
			System.out.println("Cliente 1 é igual ao cliente 2.");
		}

		if (clientes.get(0).equals(clientes.get(2))) {
			System.out.println("Cliente 1 é igual ao cliente 3.");
		}

		if (clientes.get(1).equals(clientes.get(2))) {
			System.out.println("Cliente 2 é igual ao cliente 3.");
		}
	}

	public void exibirCliente() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.printf("Cliente %d: \n", i);
			System.out.print("\t" + clientes.get(i).getNome() + " " + clientes.get(i).getSobrenome());
			System.out.println(", " + clientes.get(i).getIdade() + " anos.");
		}

	}

	public void inserirDadosFlor() {
		Flor f1 = new Flor();
		f1.setTipo("Margarida");
		f1.setCor("Branca");
		f1.setLuzSolar("Direta");
		flores.add(f1);

		Flor f2 = new Flor();
		f2.setTipo("Orquídea");
		f2.setCor("Roxa");
		f2.setLuzSolar("Indireta");
		flores.add(f2);

		Flor f3 = new Flor();
		f3.setTipo("Orquídea");
		f3.setCor("Branca");
		f3.setLuzSolar("Indireta");
		flores.add(f3);

	}
	
	public void comparacaoEqualsFlor() {

		if (flores.get(0).equals(flores.get(1))) {
			System.out.println("Flor 1 é igual a flor 2.");
		}

		if (flores.get(0).equals(flores.get(2))) {
			System.out.println("Flor 1 é igual a flor 3.");
		}

		if (flores.get(1).equals(flores.get(2))) {
			System.out.println("Flor 2 é igual a flor 3.");
		}
	}

	public void exibirFlores() {
		for (int i = 0; i < flores.size(); i++) {
			System.out.printf("Flor %d: \n", i);
			System.out.print("\t" + flores.get(i).getTipo() + " " + flores.get(i).getCor());
			System.out.println(", luz solar " + flores.get(i).getLuzSolar() + " .");
		}

	}

	private void cadastrarVaso(Cliente cliente, String tamanho, String cor, String ambiente) {
		Vaso v3 = new Vaso();
		v3.setTamanho(tamanho);
		v3.setCor(cor);
		v3.setAmbiente(ambiente);
		cliente.getVasos().add(v3);
	}
	
	public void comparacaoEqualsVaso() {

		Cliente cliente1 = clientes.get(0);
		Cliente cliente2 = clientes.get(1);
		Cliente cliente3 = clientes.get(2);
		System.out.println(cliente1.getVasos().equals(cliente2.getVasos()) ? "Vaso do cliente 1 é igual ao vaso do cliente 2." : null);
		System.out.println(cliente1.getVasos().equals(cliente3.getVasos()) ? "Vaso do cliente 1 é igual ao vaso do cliente 3." : null);
		System.out.println(cliente2.getVasos().equals(cliente3.getVasos()) ? "Vaso do cliente 2 é igual ao vaso do cliente 3." : null);
	}

	public void exibirVasos() {

		for (int i = 0; i < vasos.size(); i++) {
			System.out.printf("Vaso %d: \n", i);
			System.out.print("\tTamanho " + vasos.get(i).getTamanho() + " , cor " + vasos.get(i).getCor());
			System.out.println(", ambiente de " + vasos.get(i).getAmbiente() + " .");
		}
	}

}
