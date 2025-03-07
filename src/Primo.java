public class Primo {
    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */
    public Primo () {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                System.out.println("Number " + i + " is prime");
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
;}
