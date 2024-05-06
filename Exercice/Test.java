import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Media dvd1 = new DVD("The Mask", "sais pas", 120, Genre.COMEDY);
        dvd1.afficherDetails();

        System.out.println("---------------------------------");

        Media l1 = new Livre("GOT", "JRR", 2500, Genre.FANTASY);
        l1.afficherDetails();

        // Tableau avec une taille fixe de 2 éléments
        Media[] listeLivre = new Media[2];
        listeLivre[0] = l1;

        System.out.println(listeLivre[0]); // Livre [titre=GOT, auteur=JRR, taille=2500]
        System.out.println(listeLivre[1]); // null

        System.out.println(listeLivre.length); // 2
        
        // Liste de livre avec une taille dynamique
        List<Media> collectionLivre = new ArrayList<Media>();
        collectionLivre.add(l1);
        collectionLivre.add(dvd1);
        collectionLivre.get(0); // Livre [titre=GOT, auteur=JRR, taille=2500]
        System.out.println(collectionLivre.size()); // 2

        // Les collections de type Map 
        // En Javascript : 
        // const maMap = {
        //     'GOT': l1
        // }
        // En Java :
        Map<String, Media> mapLivre = new HashMap<>();
        mapLivre.put(l1.titre, l1);
        Media livre1 = mapLivre.get("GOT"); // Je retrouve ici le livre avec le titre "GOT"
        System.out.println(livre1); // Livre [titre=GOT, auteur=JRR, taille=2500]

    }
}