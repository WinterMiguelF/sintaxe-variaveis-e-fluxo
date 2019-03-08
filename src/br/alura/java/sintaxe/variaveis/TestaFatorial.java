package br.alura.java.sintaxe.variaveis;

public class TestaFatorial {

	public static void main(String[] args) {
		
		int valorFatorial = 1;
		
		for(int i = 1; i <= 10; i++) {
			valorFatorial *= i;
			System.out.println("Fatorial de " + i + " = " +valorFatorial);
		}
	}
}
