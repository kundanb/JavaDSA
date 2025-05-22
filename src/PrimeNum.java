public class PrimeNum {

    static boolean bruteForce(int n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static boolean upToSquareRoot(int n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static boolean with6kPlusMinus1(int n) {
        if (n < 2)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        int i = 5;

        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

            i += 6;
        }

        return true;
    }

    static void sieveOfEratosthenes(int max) {
        byte[] primes = new byte[max + 1];

        primes[0] = 0;
        primes[1] = 1;

        for (int i = 2; i <= max; i++)
            primes[i] = 1;

        for (int i = 2; i * i <= max; i++)
            if (primes[i] == 1)
                for (int j = i * i; j <= max; j += i)
                    primes[j] = 0;

        for (int i = 0; i < primes.length; i++)
            if (primes[i] == 1)
                System.out.println(i);
    }

}
