package ronansilva;

public class Prisioneiro {
	
	String Nome;
	double Altura;
	int AnosdeCondenacao;
	
	public Prisioneiro (String Nome, Double Altura, int AnosdeCondenacao) {
		this.Nome = Nome;
		this.Altura = Altura;
		this.AnosdeCondenacao = AnosdeCondenacao;
	}
	public void Think() {
		System.out.println("Terei minha Vingança");
	}
}

