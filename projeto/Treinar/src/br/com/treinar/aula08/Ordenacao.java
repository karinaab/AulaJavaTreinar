package br.com.treinar.aula08;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ordenacao {
	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		lista.add("Jorge");
		lista.add("Henrique");
		lista.add("Jadine");
		lista.add("Gleidson");
		lista.add("Hugo");
		lista.add("Cristiano");
		lista.add("Cristiano");
		lista.add("Arturo");
		lista.add("Artur");
		lista.add("Karina");
		lista.add("Bruno");
		lista.add("Gabriel");

		System.out.print("Antes de ordenar: ");
		System.out.println(lista);
		// ordenado
		Collections.sort(lista);
		System.out.print("Depois de ordenar: ");
		System.out.println(lista);

	}
}
