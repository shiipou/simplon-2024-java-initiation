public class Livre extends Media implements Empruntable {
    private boolean disponible = true;
    
    // Constructeur
    public Livre(String titre, String auteur, int nbrPages, Genre genreInput) {
        super(titre, auteur, nbrPages, genreInput);
    }

    public void afficherDetails(){
        System.out.println("Livre : " + getTitre() + "\n" + getAuteur() + "\n" + getTaille() + "\n" + getGenreDeMedia());
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