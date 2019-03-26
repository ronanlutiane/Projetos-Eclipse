package exerciciojava31;

import java.util.Scanner;

public class exerciciojava31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO JAVA 31
		
		int idade, cont, idadetotal;
		String nome, maiores21;
		Scanner entrada = new Scanner (System.in);
		cont = 0;
		idadetotal = 0;
		maiores21 = "";
		for (int i = 1; i <= 300; i++) {
			System.out.println("Informe o nome da pessoa " + cont++ + " : ");
			nome = entrada.next();
			System.out.println("Informe a idade de " + nome + " : ");
			idade = entrada.nextInt();
			idadetotal = idadetotal + idade;
			if (idade >= 21) {
				maiores21 = maiores21 + " " + nome + ";";
			}
		}
		System.out.println("Entre os nomes e idades digitados, "
				+ "os maiores de 21 anos são:" + maiores21);
		System.out.println("A soma de todas as idades digitadas é: " + idadetotal);
	}

}
