package Ov;

public class Ovchipkaart {
    double saldo;

    public Ovchipkaart(double saldo) {
        this.saldo = saldo;
    }

    public boolean inchecken() {
        return saldo >= 10;
    }

    public boolean uitchecken() {
        double ritPrijs = 4.00;
        if (saldo >= ritPrijs) {
            saldo -= ritPrijs;
            return true;
        } else {
            return false;
        }
    }

public boolean opwaarderenMet(double bedrag) {
    if (bedrag > 0) {
        saldo += bedrag;
        return true;
    } else {
        return false;
    }
}
