package prisontest;

public class Prisoner {
	public String name;
	public double altura;
	public int sentenca;
	public Cell cell;
	
	public Prisoner (String name, double altura, int sentenca, Cell cell) {
		this.name = name;
		this.altura = altura; 
		this.sentenca = sentenca;
		this.cell = cell; 
	}

	public void Think() {
		System.out.println("I'll have my revenge");
		
	}
	public void Display() {
		System.out.println("Nome: " + name);
		System.out.println("Altura: " + altura);
		System.out.println("Sentença: " + sentenca);
		System.out.println("Cela:" + cell.getNome());
		System.out.println("Cela: " + cell.getisOpen());
	/*public void OpenDoor() {
		if (cell.isOpen == true) {
			cell.isOpen = false;
			System.out.println("Cela: " + cell.nome + " Foi fechada!");
		}
		else {
			cell.isOpen = true;
			System.out.println("Cela: " + cell.nome + " Foi aberta!");
		}
	}*/

	}
}