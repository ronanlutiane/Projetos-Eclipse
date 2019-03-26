package exerciciojava26;

import java.util.Scanner;

public class exerciciojava26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO 26
		
		 String tel, nome;
		int pulsos;
		double inturb, tbas, vlc, total, intemb;
		char tipotel;
		vlc = 0.0;
		Scanner ent = new Scanner (System.in);
		System.out.println("Informe o nome do usuário: ");
		nome = ent.next();
		System.out.println("Informe o numero do telefone: ");
		tel = ent.next();
		System.out.println("Informe o numero de pulsos: ");
		pulsos = ent.nextInt();
		System.out.println("Informe o total de interurbanos");
		inturb = ent.nextDouble();
		System.out.println("Informe o tipo de telefone: [ R/C]");
		tipotel = ent.next().charAt(0);
		if (tipotel == 'R' || tipotel == 'r') {
			tbas = 17.20; }
		else {
			tbas = 25.80;
		}
		if (pulsos > 90) {
			vlc = pulsos * 0.07;
		}
		intemb = inturb + (inturb * 5 / 100);
		total = tbas + vlc + inturb + intemb;
		System.out.println("O valor total da sua fatura do telefone " + tel + " é de: R$ " + total);
	}

}
