package exerciciojava24;

import java.util.Scanner;

public class exerciciojava24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
        double salbase, salbruto, salhora, htrab;
        int turno, codcargo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário: ");
        nome = entrada.next();
        System.out.println("Informe o código do cargo: ");
        codcargo = entrada.nextInt();
        System.out.println("Informe o turno de trabalho: ");
        turno = entrada.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        htrab = entrada.nextDouble();
        if (codcargo == 1) {
            salhora = 5.00;
            salbase = salhora * htrab; } 
        else {
            salhora = 8.00;
            salbase = salhora * htrab; }
        if (turno == 1) {
            salbruto = salbase + (salbase * 3) / 100; } 
        else {
            if (turno == 2) {
                salbruto = salbase + (salbase * 4) / 100; } 
            else {
                salbruto = salbase + (salbase * 5) / 100; }
        System.out.println(salbruto);
        }
    }
}
