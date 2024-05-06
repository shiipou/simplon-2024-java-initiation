abstract class Media {

    String titre;
    String auteur;
    int taille;
    Genre genreDeMedia;
    

    // Constructeur
    public Media(String titre, String auteur, int taille, Genre genreInput) {
        this.titre = titre;
        this.auteur = auteur;
        this.taille = taille;
        this.genreDeMedia = genreInput;
    }

    // getter
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getTaille() {
        return taille;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Genre getGenreDeMedia() {
        return genreDeMedia;
    }

    public void setGenreDeMedia(Genre genre) {
        this.genreDeMedia = genre;
    }

    public abstract void afficherDetails();

    @Override
    public String toString() {
        return getClass().getName() + " [titre=" + titre + ", auteur=" + auteur + ", taille=" + taille + ", genre="+ genreDeMedia +"]";
    }

}
