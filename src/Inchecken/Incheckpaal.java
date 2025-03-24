package Inchecken;

public class Incheckpaal {

	public void checkIn (Ovchipkaart kaart) {
		if (kaart.inchecken()) {
			System.out.println("Inchecken gelukt,genoeg saldo");
		}
		else {
			System.out.println("Inchecken mislukt,niet genoeg saldo");
		}
	}
}