package exerciciojava34;

import java.util.Scanner;

public class exerciciojava34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO JAVA 34
		
		char sexo, resposta;
		int nsim, nnao, numeromulheres, nummulheressim;
		double perc; 
		nsim = 0;
		nnao = 0;
		numeromulheres = 0;
		nummulheressim = 0;
		Scanner dado = new Scanner (System.in);
		for (int i = 1; i <= 6; i++) {
			System.out.println("Infome o sexo do entrevistado:");
			sexo = dado.next().charAt(0);
			System.out.println("Informe a resposta do entrevistado [s/n]");
			resposta = dado.next().charAt(0);
			if (resposta == 's' || resposta == 'S') {
				nsim = nsim + 1; }
			else {
				nnao = nnao + 1;
			}
			if (sexo == 'f' || sexo == 'F') {
				numeromulheres = numeromulheres + 1;
			if (sexo == 'f' || sexo == 'F'&& resposta == 's' || resposta == 'S') {
				nummulheressim = nummulheressim + 1; 
				}
			}
		}
		perc = (double) nummulheressim * numeromulheres ;
		System.out.println("O total de respostas SIM foi de :" + nsim);
		System.out.println("O total de respostas NAO foi de :" + nnao);
		System.out.println("Entre as mulheres, " + nummulheressim + " % responderam SIM à pesquisa.");
	}
}
