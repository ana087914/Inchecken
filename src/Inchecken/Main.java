package Inchecken;

public class Main {
	    public static void main(String[] args) {
	    	double saldo;
	    	
	        Ovchipkaart mijnKaart = new Ovchipkaart(20.00);
	        Incheckpaal paal = new Incheckpaal();
	        paal.checkIn(mijnKaart);
	    }
}
