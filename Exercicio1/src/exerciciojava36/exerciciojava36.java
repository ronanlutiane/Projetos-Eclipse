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
		System.out.println("    MARIA DA PENHA CONFEC�OES    ");
		System.out.println("---------------------------------");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Informe o nome do funcion�rio(a): ");
			nome = scan.next();
			//if (nome == "sair" || nome == "Sair") {
				//break;
			//}
			System.out.println("Informe o sexo do funcion�rio: ");
			sexo = scan.next().charAt(0);
			System.out.println("Informe a idade do funcion�rio: ");
			idade = scan.nextInt();
			System.out.println("Informe a classe do funcion�rio: ");
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
				//System.out.println("Voc� digitou uma classe inv�lida. Tente novamente.");}
			System.out.println("Informe a quantidade de horas trabalhads do funcion�rio: ");
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
			System.out.println("O sal�rio do funcion�rio: " + nome + " � de: R$ " + salario + ".");
		}
		System.out.println("O Maior sal�rio foi R$ " + maiorsal + " recebido pelo funcion�rio " + nomemaiorsal + ".");
		System.out.println("A mulher mais velha � " + nomevelha + " de " + maisvelha + " anos.");
		System.out.println("O total da folha de pagamento � de " + folha);
	}
}

