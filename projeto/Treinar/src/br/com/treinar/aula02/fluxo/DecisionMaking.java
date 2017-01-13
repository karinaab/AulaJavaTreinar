package br.com.treinar.aula02.fluxo;

public class DecisionMaking {
	public static void main(String[] args) {
		boolean ehNoite = true;
		boolean estahChovendo = true;
		
		//IF...ELSE
		if (ehNoite && !estahChovendo) {
			System.out.println("\tBom para ver serie");
		} else {
			System.out.println("\tBom para dormir zZzZ");
		}
		
		//IF..ELSE IF..
		int opcao = 2;
		if (opcao == 1) {
			System.out.println("um");
		} else if (opcao == 2) {
			System.out.println("dois");
		} else if (opcao == 3) {
			System.out.println("tres");
		} else if (opcao == 4) {
			System.out.println("quatro");
		} else if (opcao == 5) {
			System.out.println("cinco");
		} else {
			System.out.println("Número não encontrado.");
		}
		
		//SWITCH
		switch (opcao) {
		case 1:
			System.out.println("- Um");
			break;
		case 2:
			System.out.println("- Dois");
			break;
		case 3:
			System.out.println("- Tres");
			break;
		case 4:
			System.out.println("- Quatro");
			break;
		case 5:
			System.out.println("- Cinco");
			break;

		default:
			System.out.println("- Número não encontrado.");
			break;
		}
	}

}
