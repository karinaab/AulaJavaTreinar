package projetoFloricultura;

public class Serviço {
	Cliente[] clientes;
	
	
	public Serviço() {
		clientes = new Cliente[3];
	}
	
	void inserirDadosCliente(){
		clientes[0].setNome("Joana");
		clientes[0].setIdade(23);
	}

	public void exibirCliente() {
		System.out.print("Clientes: ");
		System.out.println("\t" + clientes[0].getNome());
		
		
	}
	
	/*void inserirDados(Imóvel i1, Imóvel i2, Imóvel i3){
		i1.setBairro("Buritis");
		i1.setNumero(572);
		i1.setTipo("Casa");
		
		i2.setBairro("Buritis");
		i2.setNumero(1603);
		i2.setTipo("Apartamento");
		
		i3.setBairro("Buritis");
		i3.setNumero(572);
		i3.setTipo("Casa");
	}
	
	void inserirDados(Carro c1, Carro c2, Carro c3){
		c1.setMarca("Fiat");
		c1.setModelo("Palio");
		c1.setPlaca("HJK 0562");
		
		c2.setMarca("Fiat");
		c2.setModelo("Uno");
		c2.setPlaca("HNF 4332");
		
		c3.setMarca("Fiat");
		c3.setModelo("Siena");
		c3.setPlaca("HPQ 9381");
	}
	*/

}
