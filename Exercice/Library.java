import java.util.ArrayList;
import java.util.List;

public class Library {

   /*
    * De plus, implémentez une classe "Library" qui représente une bibliothèque et
    * qui peut contenir une liste de médias (Livres et DVD). Cette classe devrait
    * avoir des méthodes pour ajouter et supprimer des médias, ainsi que pour
    * afficher tous les médias présents dans la bibliothèque.
    */

   // Initialisation d'une librairie
   private List<Media> libraryList = new ArrayList<>();

   public void addMedia(Media media) {
      libraryList.add(media);
   }


   public void deleteMedia(Media media) {
      libraryList.remove(media);
   }

   public Media findByTitle(String title) {
      return libraryList.stream()
         .filter(media -> media.getTitre().equals(title))
         .findAny()
         .orElse(null);
   }

   public void afficherMedias() {
      for (Media media : libraryList) {
         media.afficherDetails();
      }
   }

   public boolean emprunterUnMedia(String titre) throws ClassCastException {
      Media media = findByTitle(titre);
      // if(media instanceof Empruntable) {
         Empruntable target = (Empruntable)media;
         if(target.estDisponible()){
            target.emprunter();
            return true;
         }
      // }
      return false;
   }
}
