package br.com.atividade;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int anoAtual = 2024;
		System.out.print("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe a sua idade: ");
		int idade = entrada.nextInt();
		int anoNascimento = anoAtual - idade;
		System.out.println("Seu ano de nascimento é: " + anoNascimento);

	}

}
