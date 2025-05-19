public class DigitFrequency {

    static int bruteForce(int n, int target) {
        int count = 0;

        while (n > 0) {
            int d = n % 10;

            if (d == target)
                count++;

            n /= 10;
        }

        return count;
    }

}
