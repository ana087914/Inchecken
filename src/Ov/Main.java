package Ov;

public class Main {
    public static void main(String[] args) {
       

        Ovchipkaart mijnKaart = new Ovchipkaart(20.00);
        Paal paal = new Paal();
        

        paal.checkIn(mijnKaart);      // verifică dacă are suficient pentru inchecken
        paal.checkUit(mijnKaart);     // scade 4 euro dacă e posibil
    
    paal.laadMet(mijnKaart, 5.00); // saldo = 12.00

    // Dag 2: laad tot 20 euro
    paal.laadTot(mijnKaart, 20.00); // saldo = 20.00

    // Dag 3: check in
    paal.checkIn(mijnKaart);

    // Dag 4: check uit
    paal.checkUit(mijnKaart);
}}
