package br.com.treinar.aula01;

import java.util.Scanner;

public class Moradia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Apartamento apart = new Apartamento();
		
		System.out.print("Bairro: ");
		apart.bairro = leitor.nextLine();
		System.out.print("Proprietário: ");
		apart.prop = leitor.nextLine();
		System.out.print("Quantidade de moradores: ");
		apart.moradores = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Quantidade de quartos: ");
		apart.c.quarto = leitor.nextByte();
		leitor.nextLine();
		System.out.print("Quantidade de banheiros: ");
		apart.c.banheiro = leitor.nextByte();
		leitor.nextLine();
		System.out.print("Quantidade de cozinhas: ");
		apart.c.cozinha = leitor.nextByte();
		leitor.nextLine();
		System.out.print("Quantidade de salas: ");
		apart.c.sala = leitor.nextByte();
		leitor.nextLine();
		System.out.print("Quantidade de escritórios: ");
		apart.c.escritorio = leitor.nextByte();
		leitor.nextLine();
		leitor.close();
		
		System.out.print("\n" + apart.prop + " é proprietário(a) de um apartamento no bairro " + apart.bairro);
		System.out.println(" com outras " + --apart.moradores + " pessoas.");
		System.out.println(apart.c.quarto + " quarto(s)" );
		System.out.println(apart.c.banheiro + " banheiro(s)" );
		System.out.println(apart.c.cozinha + " cozinha(s)" );
		System.out.println(apart.c.sala + " sala(s)" );
		System.out.println(apart.c.escritorio + " escritório(s).");
		
	}
}
