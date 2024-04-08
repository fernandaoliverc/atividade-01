package br.com.atividade;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int numeroInteiro = entrada.nextInt();
		int backup = numeroInteiro;

		System.out.println("Seu antecessor é: " + (--numeroInteiro));
		System.out.println("Seu sucessor é: " + (++backup));

	}
}
