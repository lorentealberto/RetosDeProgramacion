import java.util.Scanner;

public class Anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    Scanner scn = new Scanner(System.in);

    String firstWord, secondWord;

    public Anagrama () {
        System.out.println("Enter a word:");
        firstWord = scn.next().toLowerCase();
        System.out.println("Enter another word");
        secondWord = scn.next().toLowerCase();

        if (firstWord.equals(secondWord)) {
            System.out.println("Both words must be different");
            return;
        }

        for (char c : firstWord.toCharArray()) {
            if (!secondWord.contains(Character.toString(c))) {
                System.out.println("Both words are not anagrams");
                return;
            }
        }

        System.out.println("Both words are anagrams");
    }
}
