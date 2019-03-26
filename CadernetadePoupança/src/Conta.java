
public class Conta {
	
	public double balanco;
	public double taxadejuros = 0.02;
	public String nome;
	
	public void mostracliente() {
		System.out.println("Cliente: " + nome);
		System.out.println("Saldo: " + balanco);
	} 
	
	public void deposito (int x) {
		balanco += x;
	}
	
	public void retirada (double y) {
		if (y > balanco) {
			System.out.println("Você não possui saldo suficiente para esta operação");
			System.out.println("Saldo Atual: " + balanco + " reais"); 
			}
		else if (y < 0) {
			System.out.println("O valor " + y + " reais é inválido para esta operação"); 
			}
		else {
			balanco -=y;
			System.out.println("Saque de " + y + " reais efetuado com sucesso!");
			System.out.println("Saldo atual: " + balanco + " reais");
		}
	}
	
	public double calcjuros() {
		double juros = balanco*taxadejuros/12;
		return juros;
	}

	@Override
	public String toString() {
		return "Conta [balanco=" + balanco + ", taxadejuros=" + taxadejuros + ", nome=" + nome + "]";
	}
	
}
