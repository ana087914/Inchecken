package Inchecken;

public class Ovchipkaart {
double saldo;

public Ovchipkaart(double saldo) {
    this.saldo = saldo;}
    
public boolean inchecken() {

	if (saldo >=10) {
		return true;
		//System.out.println("Genoeg saldo");
	}
	else {
		return false;
	}

}
}
