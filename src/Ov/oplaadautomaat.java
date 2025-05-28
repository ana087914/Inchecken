package Ov;

public class Oplaadautomaat {
    public void laadMet(Ovchipkaart kaart, double bedrag) {
        if (bedrag > 0) {
            kaart.verhoogSaldo(bedrag);
            System.out.println("Saldo verhoogd met €" + bedrag);
        } else {
            System.out.println("Opladen mislukt. Bedrag moet positief zijn.");
        }
    }

    public void laadTot(Ovchipkaart kaart, double gewenstSaldo) {
        double huidigSaldo = kaart.getSaldo();
        if (gewenstSaldo > huidigSaldo) {
            double verschil = gewenstSaldo - huidigSaldo;
            kaart.verhoogSaldo(verschil);
            System.out.println("Saldo aangevuld met €" + verschil);
        } else {
            System.out.println("Saldo is al €" + huidigSaldo + " of hoger.");
        }
    }
}