package exerciciojava36;

import java.util.Scanner;

public class exerciciojava36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, nomemaiorsal, nomevelha;
		char sexo, classe;
		int idade, maisvelha;
		double hrstrab, salhora, maiorsal, folha, salario;
		idade = 0;
		folha = 0;
		salhora = 0;
		nomemaiorsal = " ";
		nomevelha = " ";
		maisvelha = 0;
		maiorsal = 0;
		salario = 0;
		nome = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------"); 
		System.out.println("    MARIA DA PENHA CONFECÇOES    ");
		System.out.println("---------------------------------");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Informe o nome do funcionário(a): ");
			nome = scan.next();
			//if (nome == "sair" || nome == "Sair") {
				//break;
			//}
			System.out.println("Informe o sexo do funcionário: ");
			sexo = scan.next().charAt(0);
			System.out.println("Informe a idade do funcionário: ");
			idade = scan.nextInt();
			System.out.println("Informe a classe do funcionário: ");
			classe = scan.next().charAt(0);
			if (classe == '1') {
				salhora = 10.00; }
			else if (classe == '2'){
				salhora = 15.00; }
			else if (classe == '3') {
				salhora = 18.00; }
			else if (classe == '4') {
				salhora = 25.00; }
			//else {
				//System.out.println("Você digitou uma classe inválida. Tente novamente.");}
			System.out.println("Informe a quantidade de horas trabalhads do funcionário: ");
			hrstrab = scan.nextDouble();
			salario = hrstrab * salhora;
			folha = folha + salario;
			if (salario > maiorsal) {
				maiorsal = salario;
				nomemaiorsal = nome;
			}
			if (sexo == 'f' || sexo == 'F') {
				maisvelha = idade;
				nomevelha = nome;
			}
			System.out.println("O salário do funcionário: " + nome + " é de: R$ " + salario + ".");
		}
		System.out.println("O Maior salário foi R$ " + maiorsal + " recebido pelo funcionário " + nomemaiorsal + ".");
		System.out.println("A mulher mais velha é " + nomevelha + " de " + maisvelha + " anos.");
		System.out.println("O total da folha de pagamento é de " + folha);
	}
}

