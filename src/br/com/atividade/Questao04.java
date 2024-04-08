package br.com.atividade;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nome;
		String sobrenome;
		String endereco;
		int idade;

		System.out.print("Informe seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = entrada.nextLine();
		System.out.print("Informe seu endereco: ");
		endereco = entrada.nextLine();
		System.out.print("Informe sua idade: ");
		idade = entrada.nextInt();

		System.out.println("########## Dados Infromados ##########");
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nEndereço: " + endereco + "\nIdade: " + idade);

	}
}
