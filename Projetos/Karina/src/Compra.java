
public class Compra {
	
	public static void main(String[] args) {
		Roupa r1 = new Roupa();
		r1.tam = 'M';
		r1.cor = "amarelo";
		r1.modelo = "camisa";
		r1.social = false;
		System.out.println("Primeira compra realizada: " + r1.modelo);
		System.out.println("\t Tamanho e cor: " + r1.tam + "\t" + r1.cor);
		System.out.println("\t Social: " + r1.social);
		
		System.out.println("\n");
		
		Roupa r2 = new Roupa();
		r2.size = 38;
		r2.cor = "jeans";
		r2.modelo = "calca";
		r2.social = false;
		System.out.println("Segunda compra realizada: " + r2.modelo);
		System.out.println("\t Tamanho e cor: " + r2.size + "\t" + r2.cor);
		System.out.println("\t Social: " + r2.social);
		
	}

}
