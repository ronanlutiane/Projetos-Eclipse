package exerciciojava35;

import java.util.Scanner;

public class exerciciojava35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO JAVA 35
		// Turno = 1 - Manha, 2 - Tarde, 3 - Noite;
		// Serie = 1 = Primeiro ano, 2 - Segundo ano, 3 - Terceiro ano;
		
		String nome;
		int idade, alunonoite, aluno3a, mulheres2a, total;
		char turno, serie, sexo, resp ;
		Scanner dado = new Scanner (System.in);
		alunonoite = 0;
		aluno3a = 0;
		mulheres2a = 0; 
		total = 0;
		do { 
			System.out.println("Informe o nome do aluno(a): ");
			nome = dado.next();
			System.out.println("Informe o sexo de " + nome + ": ");
			sexo = dado.next().charAt(0);
			System.out.println("Informe a idade de " + nome + ": ");
			idade = dado.nextInt();
			System.out.println("Informe a série de: " + nome);
			serie = dado.next().charAt(0);
			System.out.println("Informe o turno de: " + nome);
			turno = dado.next().charAt(0);
			System.out.println("Deseja informar outro aluno: [s/n]");
			resp = dado.next().charAt(0);
			if (serie == 3) {
				aluno3a ++;
				}
			else if (turno == 3) { 
					alunonoite ++; } 
			else if (sexo == 'f' || sexo == 'F' && serie == 2) {
					mulheres2a ++;
			}
			total++;
		}
		while (resp == 's' || resp == 'S');	
		System.out.println("O total de alunos foi de: " + total);
		System.out.println("O numero de mulheres na segunda série foi de: " + mulheres2a);
		System.out.println("O total de alunos da terceira série é: " + aluno3a);
		System.out.println("O total de alunos no turno da noite foi de: " + alunonoite);
	}

}
