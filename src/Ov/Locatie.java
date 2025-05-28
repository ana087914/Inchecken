package Ov;

public class Locatie {
    private String naam;
    private double coordX;
    private double coordY;

    public Locatie(String naam, double coordX, double coordY) {
        this.naam = naam;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getNaam() {
        return naam;
    }

    public double berekenAfstandTot(Locatie andereLocatie) {
        double deltaX = this.coordX - andereLocatie.coordX;
        double deltaY = this.coordY - andereLocatie.coordY;
        double afstand = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("Afstand tot " + andereLocatie.getNaam() + " is: " + afstand + " km");
        return afstand;
    }
}