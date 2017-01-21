package br.com.treinar.aula07.colletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {
	public static void main(String[] args) {
		Map<Character, List<String>> nomes = new HashMap<Character, List<String>>();
		List<String> lista = new ArrayList<String>();
		Character primeiraLetra = null;
		
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
			
			for (String nome : lista) {
				primeiraLetra = nome.charAt(0);
				if (!nomes.containsKey(primeiraLetra)) {
					nomes.put(primeiraLetra, new ArrayList<>());
				}
				nomes.get(primeiraLetra).add(nome);
			}
			Set<Entry<Character, List<String>>> entrySet = nomes.entrySet();
			for (Entry<Character, List<String>> entry : entrySet) {
				System.out.println(entry);
			}
			System.out.println("\n" + nomes);
	}

}
