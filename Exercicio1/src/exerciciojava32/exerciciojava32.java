package exerciciojava32;

import java.util.Scanner;

public class exerciciojava32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXERCICIO JAVA 32

		String nome, maisalto;
		char sexo, resposta;
		double altura, maioraltura, alturamedia, alturahomens;
		int numhomens;
		Scanner ent = new Scanner (System.in);
		maioraltura = 0;
		maisalto = "";
		alturahomens = 0;
		numhomens = 0;
		alturamedia = 0;
		do {
			System.out.println("Informe o nome: ");
			nome = ent.next();
			System.out.println("Informe a altura de " + nome);
			altura = ent.nextDouble();
			System.out.println("Informe o sexo de " + nome);
			sexo = ent.next().charAt(0);
			System.out.println("Deseja informar novos dados?");
			resposta = ent.next().charAt(0);
			if (altura > maioraltura) {
				maioraltura = altura;
				maisalto = nome;
				}
			if (sexo == 'm' || sexo == 'M') {
				numhomens = numhomens + 1;
				alturahomens = alturahomens + altura;
				alturamedia = alturahomens / numhomens;
			}
			}
		while (resposta == 's'); {
		System.out.println("A maior altura foi de " + maisalto + " , que tem " + maioraltura + " metros.");
		System.out.println("A média de altura dos homens foi de: " + alturamedia);
		}
	}
}
