import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    // private static List<Integer> integerList = new ArrayList<>();
    private static final String[][] CIPHER_ARRAY = {
        {" "},
        {},
        {"A", "B", "C"},
        {"D", "E", "F"},
        {"G", "H", "I"},
        {"J", "K", "L"},
        {"M", "N", "O"},
        {"P", "Q", "R", "S"},
        {"T", "U", "V"},
        {"W", "X", "Y", "Z"}
    };

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // try{
        //     while(true) {
        //         System.out.print("Entrez un nombre (ctrl+c to stop) : ");
        //         int consoleInput = sc.nextInt();

        //         integerList.add(consoleInput);

        //     }
        // } catch (InputMismatchException error) {
        //     System.err.println("Vous n'avez pas entré un nombre.");
        // } catch(NoSuchElementException error) {
        //     System.out.println("\nFin du programme.");
        // } catch(IllegalStateException error) {
        //     System.out.println("Erreur de lecture dans la console (Disque plein ??): " + error.getMessage());
        // }
        
        // try{
        //     sc.close();
        // } catch (IllegalStateException error) {
        //     System.err.println("Impossible de fermer la lecture de la console : " + error.getMessage());
        // }

        // // if(!inputIsValid(integerList)) {
        // //     System.err.println("Entrez au minimum 2 nombres");
        // //     System.exit(1);
        // // }

        StringBuilder strBuild = new StringBuilder();
        // strBuild.append("Somme: ").append(sum(integerList)).append("\n");
        // strBuild.append("Permutation: ").append(permut(integerList)).append("\n");
        strBuild.append("EncodeT9: ").append(t9Encode("Hello World")).append("\n");
        strBuild.append("DecodeT9: ").append(t9Decode("44 33 555 555 666 0 9 666 777 555 3")).append("\n");
        strBuild.append("encodeCeasar: ").append(ceasarEncode("Hello World", 12)).append("\n");
        strBuild.append("decodeCeasar: ").append(ceasarDecode("tqxxa iadxp", 12)).append("\n");

        System.out.println(strBuild);
    }

    private static Object ceasarEncode(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toLowerCase().toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    private static Object ceasarDecode(String message, int offset) {
        return ceasarEncode(message, 26-offset);
    }

    private static String t9Encode(String message) {

        StringBuilder result = new StringBuilder();
        for (String letter : message.split("")) {
            boolean found = false;
            for (int t9Index = 0; t9Index < CIPHER_ARRAY.length; t9Index++) {
                if(found)
                    break;
                String[] row = CIPHER_ARRAY[t9Index];
                for (int nthTime = 0; nthTime < row.length; nthTime++) {
                    String col = row[nthTime];
                    if(letter.toUpperCase().equals(col)) {
                        result.append(String.valueOf(t9Index).repeat(nthTime+1)).append(" ");
                        found = true;
                        break;
                    }
                }
            }
        }

        return result.toString();
    }

    private static Object t9Decode(String message) throws NumberFormatException, IndexOutOfBoundsException {
        StringBuilder result = new StringBuilder();
        for (String letters : message.split(" ")) {
            int row = Integer.parseInt(String.valueOf(letters.charAt(0)));
            int nthTime = letters.length();
            result.append(CIPHER_ARRAY[row][nthTime - 1]);
        }
        return result.toString();
    }

    private static List<Integer> permut(List<Integer> integers) {
        for (int i = 0; i < integers.size() - 1; i+= 2) {
            Integer tmp = integers.get(i);
            integers.set(i, integers.get(i+1));
            integers.set(i+1, tmp);
        }
        return integers;
    }

    private static Integer sum(List<Integer> integers) {
        Integer resultat = 0;
        for (int i = 0; i < integers.size(); i++) {
            resultat+= integers.get(i);
        }
        return resultat;
    }

    private static boolean inputIsValid(List<Integer> integers) {
        return integers.size() >= 2;
    }

}
