package exerciciojava27;

import java.util.Scanner;

public class exerciciojava27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO JAVA 27
		
		String nome, resultado ;
		double n1, n2, n3, n4, total, media ;
		int naula ;
		Scanner ent = new Scanner (System.in);
		System.out.println("Informe o nome do aluno: ") ;
		nome = ent.next() ;
		System.out.println("Informe a quantidade de aulas frequentadas : ");
		naula = ent.nextInt();
		System.out.println("Informe a primeira nota: ") ;
		n1 = ent.nextDouble() ;
		System.out.println("Informe a segunda nota: ") ;
		n2 = ent.nextDouble() ;
		System.out.println("Informe a terceira nota: ") ;
		n3 = ent.nextDouble() ;
		System.out.println("Informe a quarta nota: ") ;
		n4 = ent.nextDouble() ;
		total = n1 + n2 + n3 + n4 ; 
		media = (n1 + n2 + n3 + n4) / 4 ;
		if (total >= 60 && naula >= 160) {
			resultado = "ALUNO(A) APROVADO" ; }
		else if (total < 60 && naula >= 160) {
			resultado = "ALUNO(A) REPROVADO POR QUE NÃO ALCANÇOU A NOTA MÍNIMA"; }
			else if (total >= 60 && naula < 160) {
				resultado = "ALUNO(A) REPROVADO POR QUE NAO ALCANÇOU NÚMERO MÍNIMO DE AULAS"; }
				else {
					resultado = "ALUNO REPROVADO"; }				
		System.out.println(resultado);
	}

}
