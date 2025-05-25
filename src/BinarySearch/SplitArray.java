package BinarySearch;

public class SplitArray {

    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int k = 0;

        System.out.println(splitArray(arr, k));
    }

    static int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start)  / 2;

            int sum = 0;
            int pieces = 0;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    pieces++;
                } else {
                    sum += arr[i];
                }
            }

            if (pieces > k)
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }

}
