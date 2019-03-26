package TIP02;

import java.util.Scanner;
import java.util.Calendar;

import javax.swing.JOptionPane;
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		char resposta;
		do {
		JOptionPane.showInputDialog("Informe o valor consumido: ");
		//calc.consumo = sc.nextDouble();
		calc.EncontrarTotal();
		System.out.println("Deseja informar outro valor? S/N");
		resposta = sc.next().charAt(0);
		}
		while (resposta == 's');
	}

}
