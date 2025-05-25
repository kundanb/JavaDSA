package BinarySearch;

import java.util.Scanner;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 6, 7, 8, -1, 0, 1, 2 };

        int start = 0;
        int end = arr.length - 1;

        int pivot = findPivot(arr);

        int target = sc.nextInt();
        int targetIdx;

        if (pivot == -1)
            targetIdx = binarySearch(arr, target, start, end);

        else if (target == arr[pivot])
            targetIdx = pivot;

        else if (target >= arr[start])
            targetIdx = binarySearch(arr, target, start, pivot - 1);

        else
            targetIdx = binarySearch(arr, target, pivot + 1, end);

        System.out.println(targetIdx);
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

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

}
