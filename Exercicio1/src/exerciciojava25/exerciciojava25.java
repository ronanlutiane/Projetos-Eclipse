package exerciciojava25;

import java.util.Scanner;

public class exerciciojava25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXERCICIO JAVA 25
		
		String nome;
		int nfilhos;
		double vpag, mens;
		mens = 120.00;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o nome do responsável: ");
		nome = entrada.next();
		System.out.println("Informe o numero de filhos: ");
		nfilhos = entrada.nextInt();
		if (nfilhos == 1) { 
			vpag = mens - (mens * 10 / 100); }
		else {
			if (nfilhos <= 3) {
				vpag = mens - (mens * 15 / 100); }
			else {
				vpag = mens - (mens * 20 / 100);
			}		
		}
		System.out.println("Valor de mensalidade a ser pago por " + nome + " é de: R$ " + vpag);
	}

}
