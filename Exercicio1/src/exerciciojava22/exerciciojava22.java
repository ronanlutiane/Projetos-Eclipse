package exerciciojava22;

import java.util.Scanner;

public class exerciciojava22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO JAVA 22.
		
		String nome, cat, classe;
		int idade;
		double renda;
		Scanner scan = new Scanner (System.in);
		System.out.print("Informe no nome do Atleta: ");
		nome = scan.next();
		System.out.print("Infome a idade do Atleta: ");
		idade = scan.nextInt();
		System.out.print("Informe a renda do atleta: ");
		renda = scan.nextDouble();
		if ( idade <= 15 ) {
			cat = "Infantil"; }
		else {
			if ( idade <= 18 ) {
				cat = "Juvenil"; }
			else {
				cat = "Adulto";
			}
		}
		if ( renda <= 1000 ) {
			classe = "Média Baixa"; }
		else {
			if (renda <= 3500 ) {
				classe = "Média"; }
			else {
				classe = "Média Alta";
			}
		}
		System.out.println(nome + " é um atleta da categoria " + cat + " de classe " + classe);
	}

}
