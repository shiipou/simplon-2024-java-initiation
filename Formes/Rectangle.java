package Formes;

public class Rectangle implements Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }
}
