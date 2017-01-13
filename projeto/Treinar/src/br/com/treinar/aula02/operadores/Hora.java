package br.com.treinar.aula02.operadores;

public class Hora {
	public static void main(String[] args) {
		int minEntrada = 130;
		int horaResult;
		int minResult;
		
		horaResult = minEntrada / 60;
		minResult = minEntrada % 60;
		
		System.out.println(minEntrada + " minutos representa: ");
		System.out.println(horaResult + " hora(s) e " + minResult + " minuto(s).");
		
		minResult = minEntrada - (60 * horaResult);
		System.out.println("\t" + horaResult + ":" + minResult);
		
	}

}
