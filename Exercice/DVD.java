public class DVD extends Media implements Empruntable {
    private boolean disponible = true;

    // Constructeur
    public DVD(String titre, String realisateur, int duree, Genre genreInput) {
        super(titre, realisateur, duree, genreInput);
    }

    public void afficherDetails() {
        System.out.println("DVD : " + getTitre() + "\n" + getAuteur() + "\n" + getTaille() + "\n" + getGenreDeMedia());
    }

    @Override
    public void emprunter() {
        disponible = false;
    }

    @Override
    public void rendre() {
        disponible = true;
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }


}