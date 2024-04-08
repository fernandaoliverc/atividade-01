package br.com.atividade;

public class Questao01 {
	public static void main(String[] args) {

		double primeiraMedia;
		double segundaMedia;
		double mediaDasMedias;

		primeiraMedia = (8.0 + 9.0 + 7.0) / 3;
		System.out.println("Primeira Media Aritimetica: " + primeiraMedia);

		segundaMedia = (4.0 + 5.0 + 6.0) / 3;
		System.out.println("Segunda Media Aritimetica: " + segundaMedia);

		mediaDasMedias = (primeiraMedia + segundaMedia) / 2.0;
		System.out.println("Media das medias: " + mediaDasMedias);

	}
}