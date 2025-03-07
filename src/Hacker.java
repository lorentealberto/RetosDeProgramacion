import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hacker {
    /*
     * Escribe un programa que reciba un texto y transforme lenguaje natural a
     * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
     *  se caracteriza por sustituir caracteres alfanuméricos.
     * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
     *   con el alfabeto y los números en "leet".
     *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
     */
    Map<Character, String> translation = new HashMap<Character, String>();
    Scanner scn = new Scanner(System.in);
    String quote;

    public Hacker () {
        fillMap();
        System.out.println("Enter text to be translated: ");
        quote = scn.nextLine().toLowerCase();

        String result = "";

        for (char c : quote.toCharArray()) {
            result += translation.get(c);
        }

        System.out.println("Your phrase is: " + result);

    }

    private void fillMap() {
        //Letters
        translation.put('a', "4");
        translation.put('b', "I3");
        translation.put('c', "[");
        translation.put('d', ")");
        translation.put('e', "3");
        translation.put('f', "|=");
        translation.put('g', "&");
        translation.put('h', "#");
        translation.put('i', "1");
        translation.put('j', ",_|");
        translation.put('k', ">|");
        translation.put('l', "1");
        translation.put('m', "[V]");
        translation.put('n', "^/");
        translation.put('o', "0");
        translation.put('p', "|*");
        translation.put('q', "(_,)");
        translation.put('r', "I2");
        translation.put('s', "5");
        translation.put('t', "7");
        translation.put('u', "(_)");
        translation.put('v', "|/");
        translation.put('w', "VV");
        translation.put('x', "><");
        translation.put('y', "j");
        translation.put('z', "2");
        //Numbers
        translation.put('1', "L");
        translation.put('2', "R");
        translation.put('3', "E");
        translation.put('4', "A");
        translation.put('5', "S");
        translation.put('6', "b");
        translation.put('7', "T");
        translation.put('8', "B");
        translation.put('9', "g");
        translation.put('0', "o");

        translation.put(' ', " ");
    }
}
