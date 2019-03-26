package exerciciojava23;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO JAVA 23
		
		String nome ;
		int turno;
		double sal = 0 ;
		Scanner data = new Scanner (System.in); 
		System.out.print("Informe o nome da funcionaria:");
		nome = data.next();
		System.out.print("Informe o turno de trabalho da funcionária: ");
		turno = data.nextInt();
		if (turno == 1) {
			sal = 450.00; }
		else { 
			if (turno == 2) {
				sal = 490.00; }
			else {
				if (turno == 3) {
					sal = 650.00; }
				else {
					System.out.println("Voce inseriu um codigo de turno inválido. Tente novamente!");
					}
				}	
			}
		System.out.println ("O Salário da funcionária " + nome + " é de: R$ " + sal);
	}

}
