package ronansilva;

public class PrisaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prisioneiro Bubba = new Prisioneiro ("bubba", 2.08, 4);
		Prisioneiro Twitch = new Prisioneiro ("twitch", 1.73, 3);
		
		System.out.println(Bubba == Twitch);
		
		Bubba = Twitch;
		System.out.println(Bubba == Twitch);
	}
}
