package projetoEscola;

import java.util.Scanner;

public class Escola {
	Integer opcao;
	
	public Integer menuEscola() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("1 - Matricula"
						 + "2 - Rematricula aluno"
						 + "3 - Acessar dados do aluno"
						 + "4 - Acessar notas"
						 + "5 - Fim da pesquisa");
		
		opcao = leitor.nextInt();
		leitor.close();
		return opcao;
	}
}
