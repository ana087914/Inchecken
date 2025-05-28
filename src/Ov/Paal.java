package Ov;

public class Paal {
    private Locatie locatie;

    public Paal(Locatie locatie) {
        this.locatie = locatie;
    }

    public void checkIn(Ovchipkaart kaart) {
        if (kaart.heeftGenoegSaldoVoorIncheck()) {
            System.out.println("Inchecken gelukt bij " + locatie.getNaam());
        } else {
            System.out.println("Inchecken mislukt bij " + locatie.getNaam() + ", niet genoeg saldo");
        }
    }

    public void checkUit(Ovchipkaart kaart) {
        if (kaart.kanUitchecken()) {
            kaart.betaalRit();
            System.out.println("Uitchecken gelukt bij " + locatie.getNaam() + ", nieuw saldo: €" + kaart.getSaldo());
        } else {
            System.out.println("Uitchecken mislukt bij " + locatie.getNaam() + ", niet genoeg saldo");
        }
    }
}