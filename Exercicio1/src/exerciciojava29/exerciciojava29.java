package exerciciojava29;

import java.util.Scanner;

public class exerciciojava29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO 29
		
		//MODALIDADE = 1 - VOLEY, 2 - BASQUETE, 3 - FUTSAL
	
		String nome, esporte;
		int idade, nhomens, nmulheres, nmulheresb, sih, sim, hj, mod;
		double medh, medm, perc;
		char sexo;
		Scanner ent = new Scanner (System.in);
		nhomens = 0;
		nmulheres = 0;
		nmulheresb = 0;
		sih = 0;
		sim = 0;
		hj = 0;
		medh = 0;
		medm = 0;
		perc = 0;
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println("Informe o nome do(a) atleta: ");
			nome = ent.next();
			System.out.println("Informe a modalidade esportiva do atleta : [1 - Voley], [2 - Basquete] ou [3 - Futsal]");
			mod = ent.nextInt();
			System.out.println("Informe a idade do atleta: ");
			idade = ent.nextInt();
			System.out.println("informe o sexo do atleta: [M/F] ");
			sexo = ent.next().charAt(0);
			if (sexo == 'm' || sexo == 'M') {
				nhomens = nhomens + 1;
				sih = sih + idade;
				medh = (double) sih / nhomens; }
			else if (sexo == 'f' || sexo == 'F')  {
				nmulheres = nmulheres + 1;
				sim = sim + idade;
				medm = (double) sim / nmulheres; }
			if ( mod == 2 && sexo == 'f' || sexo == 'F' ) {
				nmulheresb = nmulheresb + 1; }
			if (sexo == 'm' || sexo == 'M')
				if (idade >= 25 && idade <= 30) {
					hj = hj + 1; }
			perc = (double) (nmulheresb * 100) / nmulheres;
			System.out.println(nmulheres);
			System.out.println(nmulheresb);
			System.out.println("A média de idade dos homens foi de: " + medh);
			System.out.println("A média de idade das mulheres foi de: " + medm);
			System.out.println("O percentual de mulheres matriculadas no basquete foi de: " + perc + " %");
			System.out.println("O número de homens com idade entre 25 e 30 anos é de: " + hj);
			}
		//System.out.println("A média de idade dos homens foi de: " + medh);
		//System.out.println("A média de idade das mulheres foi de: " + medm);
		//System.out.println("O percentual de mulheres matriculadas no basquete foi de: " + perc);
		//System.out.println("O número de homens com idade entre 25 e 30 anos é de: " + hj);
	}
}
