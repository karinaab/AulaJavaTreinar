package br.com.treinar.aula01;

public class Moradia {

	public static void main(String[] args) {
		
		Apartamento apart = new Apartamento();
		apart.bairro = "Cidade Nova";
		apart.prop = "Karina";
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
		
		Apartamento vo = new Apartamento();
		vo.bairro = "Cidade Nova";
		vo.prop = "Terezinha";
		vo.moradores = 1;
		vo.c.quarto = 2;
		vo.c.banheiro = 2;
		vo.c.cozinha = 1;
		vo.c.sala = 1;
		vo.c.escritorio = true;
		System.out.println("Bairro: " + vo.bairro + "\n\tProprietario: " + vo.prop);
		System.out.println(vo.moradores + " morador(es)");
		System.out.println(vo.c.quarto + " quarto(s)" );
		System.out.println(vo.c.banheiro + " banheiro(s)" );
		System.out.println(vo.c.cozinha + " cozinha(s)" );
		System.out.println(vo.c.sala + " sala(s)" );
		System.out.println("Escritorio: " + vo.c.escritorio + "\n");
	}
}
