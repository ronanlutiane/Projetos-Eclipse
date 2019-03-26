
public class CheckingAccount {
	public double balance;
	public String name;
	public double interestRate = 0.02;
	
	public void deposit(int x) {
		balance += x;
	}
	public void withdraw(double y) {
		balance -= y;
		
	}
}
