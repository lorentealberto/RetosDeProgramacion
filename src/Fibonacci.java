public class Fibonacci {
    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    int tmp = 0, first = 0, second = 1;

    public Fibonacci () {
        for (int i = 0; i < 50; i++) {
            System.out.println(first + second);
            tmp = second;
            second = first + second;
            first = tmp;
        }
    }
}
