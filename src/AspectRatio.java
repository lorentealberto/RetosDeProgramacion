import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AspectRatio {

    /*
     * Crea un programa que se encargue de calcular el aspect ratio de una
     * imagen a partir de una url.
     * - Url de ejemplo:
     *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
     * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
     *   imagen de 1920*1080px.
     */
    private ArrayList<Integer> primes;
    private Image image;
    private URL url;

    public AspectRatio () {
        primes = getPrimes(30);

        try {
            url = new URL("https://wallpapershome.com/images/pages/pic_h/647.jpg");
            image = ImageIO.read(url);

            calcGCF(image.getWidth(null), image.getHeight(null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void calcGCF(int width, int height) {
        int gcf = findGCF(width, height);

        int w = width / gcf;
        int h = height / gcf;

        System.out.printf("Image dimension is %dx%dpx. GCF is %d so it's aspect ration is %d:%d", width, height, gcf, w, h);
    }


    private ArrayList<Integer> getPrimes(int max) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < max; i++) {
            if (isPrime(i))
                primes.add(i);
        }

        return primes;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n -1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> primesUsed = new ArrayList<>();

        int currentPrime = 0;
        int result = n;

        while (result > 1) {
            int curr = primes.get(currentPrime);
            if (result % curr == 0) {
                primesUsed.add(curr);
                result /= curr;
            }
            else
                currentPrime++;
        }

        return primesUsed;
    }

    private int findGCF(int n_1, int n_2) {
        ArrayList<Integer> primesN1 = primeFactorize(n_1);
        ArrayList<Integer> primesN2 = primeFactorize(n_2);
        ArrayList<Integer> commonPrimes = new ArrayList<>();
        int gcf = 1;
        int lastCommon = 0;

        for (int i = 0; i < primesN1.size(); i++)
            for (int j = lastCommon; j < primesN2.size(); j++)
                if (primesN1.get(i) == primesN2.get(j)) {
                    lastCommon = j + 1;
                    commonPrimes.add(primesN1.get(i));
                    break;
                }

        for (int prime : commonPrimes)
            gcf *= prime;

        return gcf;
    }
}
