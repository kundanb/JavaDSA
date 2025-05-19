public class CountDigits {

    static int bruteForce(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    static int withLog10(int n) {
        return (int) Math.log10(n) + 1;
    }

}
