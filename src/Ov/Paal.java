package Ov;

public class Paal {

    public void checkIn(Ovchipkaart kaart) {
        if (kaart.inchecken()) {
            System.out.println("Inchecken gelukt, genoeg saldo");
        } else {
            System.out.println("Inchecken mislukt, niet genoeg saldo");
        }
    }

    public void checkUit(Ovchipkaart kaart) {
        if (kaart.uitchecken()) {
            System.out.println("Uitchecken gelukt, saldo na rit: €" + kaart.saldo);
        } else {
            System.out.println("Uitchecken mislukt, niet genoeg saldo");
        }
    }
}
