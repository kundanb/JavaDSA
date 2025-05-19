import java.util.Arrays;

public class MaxValue {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static int findMaxInRange(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static int[] maxWealth(int[][] arr) {
        int idx = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++)
                sum += arr[i][j];

            if (sum > max) {
                idx = i;
                max = sum;
            }
        }

        return new int[]{ idx, max };
    }

}
