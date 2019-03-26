package exerciciojava33;

import java.util.Scanner;

public class exerciciojava33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO JAVA 33
		
		String nome, nomemaiorsal;
		char sexo, resposta;
		double salhora, horastrab, totalsalarios, maiorsalario, salario;
		int i = 1;
		totalsalarios = 0;
		maiorsalario = 0;
		nomemaiorsal = "";
		Scanner dado = new Scanner (System.in);
		do {
			System.out.println("Informe o nome do funcionario " + i++ + ":");
			nome = dado.next();
			System.out.println("Informe o sexo do funcionario: ");
			sexo = dado.next().charAt(0);
			System.out.println("Informe o valor do salario hora do funcionario: ");
			salhora = dado.nextDouble();
			System.out.println("Informe a quantidade de horas trabalhadas por " + nome + " : ");
			horastrab = dado.nextDouble();
			System.out.println("Deseja informar os dados do próximo funcionário?");
			resposta = dado.next().charAt(0);
			salario = salhora * horastrab;
			totalsalarios = totalsalarios + salario;
			if (salario > maiorsalario) {
				maiorsalario = salario;	
				nomemaiorsal = nome;
			}
				}
		while (resposta == 's');
		System.out.println("O maior salário foi de: " + nomemaiorsal + 
				" com o salário de: " + maiorsalario);
		System.out.println("O total de salarios foi de: " + totalsalarios);
	}

}
