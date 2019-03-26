package TIP02;

public class Calculator {
	public double taxa = 0.05;
	public double gorjeta = 0.15;
	public double consumo = 0;
	
	public void EncontrarTotal() {
		System.out.println(consumo * (1 + taxa + gorjeta));
	}

}
