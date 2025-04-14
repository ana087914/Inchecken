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
public boolean opwaarderenTot(double totaal) {
    if (totaal > saldo) {
        double verschil = totaal - saldo;
        saldo = totaal;
        System.out.println("Saldo aangevuld met €" + verschil);
        return true;
    } else {
        System.out.println("Saldo is al €" + saldo + " of hoger.");
        return false;
    }
}}
