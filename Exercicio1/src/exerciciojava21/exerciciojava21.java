package exerciciojava21;

import java.util.Scanner;

public class exerciciojava21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERC�CIO JAVA 21.
		
		String nome;
		double salliq, salb, inss;
		Scanner ent = new Scanner (System.in);
		System.out.print ("Informe o nome do funcion�rio: ");
		nome = ent.next ();
		System.out.println ("Informe o valor do sal�rio bruto: ");
		salb = ent.nextDouble();
		if (salb <= 800.0) {
			inss = (salb * 9)/100;
		}else {
			if (salb <=1500.0)	{
				inss = (salb * 10)/100;
			} else {
				inss = (salb * 11)/100;
				}
			}
		salliq = salb - inss;
		System.out.println("O valor do desconto de inss deste funcion�rio � de: " + inss);
		System.out.println("O valor do sal�rio liquido deste funcion�rio � de: " + salliq);
	}

}
