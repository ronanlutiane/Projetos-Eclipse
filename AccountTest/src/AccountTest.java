
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca0001 = new CheckingAccount();
		ca0001.balance = 1000;
		ca0001.name = "Damien";
		ca0001.deposit(1000);
		System.out.println("Cliente: " + ca0001.name);
		System.out.println("Seu Saldo é de: " + ca0001.balance);
	}

}
