package exercicio23_01;

public class Main {
	
	public static void main(String[] args) {
		//list ; arrayList
		Pessoa pes1 = new Pessoa();
		Pessoa pes2 = new Pessoa();
		Pessoa pes3 = new Pessoa();
		Imóvel imov1 = new Imóvel();
		Imóvel imov2 = new Imóvel();
		Imóvel imov3 = new Imóvel();
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Serviço servico = new Serviço();
		
		servico.inserirDados(pes1, pes2, pes3);
		
		servico.inserirDados(imov1, imov2, imov3);		
		imov1.setProprietario(pes3);
		imov2.setProprietario(pes2);
		imov3.setProprietario(pes1);
		
		servico.inserirDados(carro1, carro2, carro3);
		carro1.setProprietario(pes2);
		carro2.setProprietario(pes3);
		carro3.setProprietario(pes3);
		
	}
	
	

}
