package Ov;

public class Main {
    public static void main(String[] args) {
        double saldo;

        Ovchipkaart mijnKaart = new Ovchipkaart(20.00);
        Paal paal = new Paal();

        paal.checkIn(mijnKaart);      // verifică dacă are suficient pentru inchecken
        paal.checkUit(mijnKaart);     // scade 4 euro dacă e posibil
    }
}
