public class Poster extends Media {

    public Poster(String titre, String auteur, int taille, Genre genreInput) {
        super(titre, auteur, taille, genreInput);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Poster : " + getTitre() + "\n" + getAuteur() + "\n" + getTaille() + "\n" + getGenreDeMedia());
    }
 
}
