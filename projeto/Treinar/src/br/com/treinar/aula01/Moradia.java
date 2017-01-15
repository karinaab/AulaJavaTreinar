package br.com.treinar.aula01;

public class Moradia {

	public static void main(String[] args) {
		
		Apartamento apart = new Apartamento();
		apart.bairro = "";
		apart.prop = "";
		apart.moradores = 4;
		apart.c.quarto = 3;
		apart.c.banheiro = 2;
		apart.c.cozinha = 1;
		apart.c.sala = 1;
		apart.c.escritorio = true;
		System.out.println("Bairro: " + apart.bairro + "\n\tProprietario: " + apart.prop);
		System.out.println(apart.moradores + " morador(es)");
		System.out.println(apart.c.quarto + " quarto(s)" );
		System.out.println(apart.c.banheiro + " banheiro(s)" );
		System.out.println(apart.c.cozinha + " cozinha(s)" );
		System.out.println(apart.c.sala + " sala(s)" );
		System.out.println("Escritorio: " + apart.c.escritorio + "\n");
		
	}
}
