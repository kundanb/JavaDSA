package BinarySearch;

public class SortedArrayRotationCount {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, -1, 0, 1, 2 };
        int pivot = findPivot(arr);
        System.out.println(pivot + 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] < arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

}
