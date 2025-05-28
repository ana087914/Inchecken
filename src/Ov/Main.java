package Ov;

public class Main {
    public static void main(String[] args) {
        Ovchipkaart mijnKaart = new Ovchipkaart(20.00);
        Paal paal = new Paal(new Locatie("Station Nijmegen", 10.0, 15.0));

        Oplaadautomaat automaat = new Oplaadautomaat();

        paal.checkIn(mijnKaart);
        paal.checkUit(mijnKaart);

        automaat.laadMet(mijnKaart, 5.00);
        automaat.laadTot(mijnKaart, 20.00);

        paal.checkIn(mijnKaart);
        paal.checkUit(mijnKaart);
    }
}