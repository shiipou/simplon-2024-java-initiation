public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Poster l1 = new Poster("GOT", "JRR", 2500, Genre.FANTASY);
        // Empruntable panier = l1;

        // System.out.println(panier.estDisponible());
        // panier.emprunter();
        // System.out.println(panier.estDisponible());

        Media film1 = new DVD("Captain Orgazmo", "les createurs de south park", 120, Genre.COMEDY);
        Media l2 = new Livre("SDA", "Tolkien", 4000, Genre.FANTASY);

        library.addMedia(l1);
        library.addMedia(film1);
        library.addMedia(l2);

        library.afficherMedias();

        // library.deleteMedia(l1);

        library.afficherMedias();

        try {
            boolean jePeuxEmprunter = library.emprunterUnMedia("GOT");

            if(jePeuxEmprunter) {
                System.out.println("J'ai emprunté le livre");
            } else {
                System.out.println("Il n'est pas disponible");
            }
        } catch(ClassCastException error) {
            System.err.println("Erreur, vous ne pouvez pas emprunter ce média.");
        } catch(Exception error) {
            System.err.println("Erreur inconnue");
        }

    }
}
