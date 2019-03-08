package br.alura.java.sintaxe.variaveis;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Teste condicionais parte 2:");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}

}
