import java.math.BigDecimal;
import java.math.RoundingMode;

public class TituloTesouro {
	
	public String nome;
	public double saldo;
	public int prazo, mesesrestantes;
	double taxadejuros;
	
	
	//System.out.println(bd.doubleValue());
	public void DefinirPrazoeTaxa (int t) {
		if (t >= 0 && t <= 11) {
			taxadejuros = 0.005;
		}
		else if (t <= 23) {
			taxadejuros = 0.0010;
		}
		else if (t <= 35) {
			taxadejuros = 0.0015;
		}
		else if (t <= 47) {
			taxadejuros = 0.0020;
		}
		else if (t <= 60){
			taxadejuros = 0.0025;
		}
		else {
			System.out.println("Prazo inválido. ");
			t = 0;
		}
		prazo = t;
		mesesrestantes = t;
	}
	public void Rendimentos() {
		if (mesesrestantes > 0) {
			saldo += saldo*taxadejuros;
			mesesrestantes --;
			//BigDecimal bd = new BigDecimal(saldo).setScale(2, RoundingMode.HALF_EVEN);
			//System.out.println("Saldo " + bd.doubleValue() + " reais");
			System.out.printf("Saldo: R$ %.2f\n", saldo);
			System.out.println("Taxa " + taxadejuros);
			System.out.println(" Meses restantes " + mesesrestantes);
		}
		else {
			System.out.println("Título Vencido!");
		}
	/*
	@Override
	public String toString() {
		return "TituloTesouro [nome=" + nome + ", saldo=" + saldo + ", prazo=" + prazo + ", mesesrestantes="
				+ mesesrestantes + ", taxadejuros=" + taxadejuros + "]";
	*/
	}
}
