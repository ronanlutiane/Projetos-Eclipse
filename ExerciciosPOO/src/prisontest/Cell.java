package prisontest;

public class Cell {
	
	private String nome;
	private Boolean isOpen;
	private int secCode;
	
	public Cell (String nome, Boolean isOpen, int secCode) {
		this.nome = nome;
		this.isOpen = isOpen;
		this.secCode = secCode;
	}
	public String getNome() {
		return nome;
	}
	public Boolean getisOpen() {
		return isOpen;
	}
	public void setisOpen(int code) {
		if (code != secCode) {
			System.out.println("Código de segurança incorreto!");
		}
		else {
			if (isOpen = true ) {
			isOpen = false;
			System.out.println("Cela: " + nome + " aberta!");
			}
			else {
			isOpen = true;
			System.out.println("Cela " + nome + " fechada!" );
			}
		
		}
	}
	
}
