package br.com.atividade;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		double primeiroNumero = entrada.nextDouble();
		System.out.print("Informe o segundo número: ");
		double segundoNumero = entrada.nextDouble();

		double soma = primeiroNumero + segundoNumero;
		System.out.println("A soma de [" + primeiroNumero + " + " + segundoNumero + "] é: " + soma);

		double subtracao = primeiroNumero - segundoNumero;
		System.out.println("A subtração de [" + primeiroNumero + " - " + segundoNumero + "] é: " + subtracao);

		double multiplicacao = primeiroNumero * segundoNumero;
		System.out.println("A multiplicação de [" + primeiroNumero + " * " + segundoNumero + "] é: " + multiplicacao);

	}
}
