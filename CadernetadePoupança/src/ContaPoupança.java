import java.util.Scanner;

public class ContaPoupança {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deposito, periodo; 
		double saque;
		Scanner dados = new Scanner(System.in);
		Conta c0001 = new Conta();
		System.out.println("Informe o nome do cliente: ");
		c0001.nome = dados.next();
		/*System.out.println("Informe o valor do depósito: ");
		deposito = dados.nextInt();
		c0001.deposito(deposito);
		System.out.println("Informe o valor do saque: ");
		saque = dados.nextDouble();
		c0001.retirada(saque);
		c0001.mostracliente();*/
		//System.out.println(c0001.calcjuros());	
		//System.out.println(c0001.toString());
		TituloTesouro t1 = new TituloTesouro();
		t1.nome = c0001.nome;
		System.out.println("Informe o valor que deseja investir no seu título: ");
		t1.saldo = dados.nextDouble();
		System.out.println("Informe o prazo de investimento: ");
		periodo = dados.nextInt();
		t1.DefinirPrazoeTaxa(periodo);
		t1.Rendimentos();
	}

}
