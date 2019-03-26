package prisontest;

public class PrisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Prisoner bubba = new Prisoner("Bubba", 2.08, 4, "A1");
		System.out.println(bubba.name)
				
		Prisoner twitch = new Prisoner("Twitch", 1.73, 3, "A2");
		System.out.println(twitch.name)
				
		System.out.println(bubba == twitch);
		
		bubba = twitch; 
			
		System.out.println(bubba == twitch); */
		
		
		Cell cellA1 = new Cell ("A1", false, 1111);
		Cell cellA2 = new Cell ("A2", true, 1234);
		Cell cellA3 = new Cell ("A3", false, 4321);
		Guard G1 = new Guard ("G1");
		
		Prisoner p01 = new Prisoner("P01", 1.60, 10, cellA1);
		Prisoner p02 = new Prisoner("P02", 1.80, 25, cellA2); 
		Prisoner p03 = new Prisoner("P03", 2.45, 150, cellA3);

		p01.Display();
		p02.Display();
		p03.Display();
		}

}
