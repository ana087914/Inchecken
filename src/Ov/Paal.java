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
            System.out.println("Uitchecken gelukt, saldo na rit: €" + kaart.getSaldo());
        } else {
            System.out.println("Uitchecken mislukt, niet genoeg saldo");
        }
    }

    public void laadMet(Ovchipkaart kaart, double bedrag) {
        if (kaart.opwaarderenMet(bedrag)) {
            System.out.println("Saldo opgeladen met €" + bedrag);
            System.out.println("Nieuw saldo: €" + kaart.getSaldo());
        } else {
            System.out.println("Opladen mislukt. Bedrag moet positief zijn.");
        }
    }

    public void laadTot(Ovchipkaart kaart, double totaal) {
        if (kaart.opwaarderenTot(totaal)) {
            System.out.println("Saldo is nu €" + kaart.getSaldo());
        }
    }
}
