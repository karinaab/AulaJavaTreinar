package br.com.treinar.aula03;

import javax.swing.JOptionPane;

public class Janela {
	public static void main(String[] args) {
		int x = 10;
		String result = "";
		do {
			result += "Value of x: " + x + "\n";
			x++;
		}while (x < 20);
		JOptionPane.showMessageDialog(null, result, "Título Alert", 1);
	}
}
