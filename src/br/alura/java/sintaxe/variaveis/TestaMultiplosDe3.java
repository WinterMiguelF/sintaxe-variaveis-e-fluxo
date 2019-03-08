package br.alura.java.sintaxe.variaveis;

public class TestaMultiplosDe3 {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
