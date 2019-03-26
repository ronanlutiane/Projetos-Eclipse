package exerciciojava28;

import java.util.Scanner;

public class exerciciojava28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO 28
		
		String nome;
		int nhrs; 
		double salhr, sbruto, inss, sliq;
		Scanner ent = new Scanner (System.in);
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println("Informe o nome do funcinário: ");
			nome = ent.next();
			System.out.println("Informe o valor do salário-hora: ");
			salhr = ent.nextDouble();
			System.out.println("Informe o número de horas trabalhadas: ");
			nhrs = ent.nextInt();
			sbruto = salhr * nhrs;
			inss = sbruto * 11/100;
			sliq = sbruto - inss;
			System.out.println("O valor do salário bruto de " + nome + " é R$ " + sbruto);
			System.out.println("O valor do inss é de R$ " + inss);
			System.out.println("O valor do salário líquido de " + nome + " é R$ " + sliq);
		}
	}

}
