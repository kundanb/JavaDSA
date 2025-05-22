public class BSQuestions {

    static int ceilingOfNumber(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        if (target > arr[arr.length - 1])
            return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }

    static int floorOfNumber(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        if (target < arr[0])
            return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return end;
    }

    static char nextGreaterChar(char[] arr, char target) {
        if (arr.length == 0)
            return '\0';

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return arr[start % arr.length];
    }

    static int[] firstAndLastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int leftIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                leftIndex = mid;
                end = mid - 1;
            } else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (leftIndex == -1)
            return new int[]{ -1, -1 };

        start = leftIndex;
        end = arr.length - 1;

        int rightIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                rightIndex = mid;
                start = mid + 1;
            } else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return new int[]{ leftIndex, rightIndex };
    }

    static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int diff = end - start + 1;
            start = end + 1;
            end = start + 2 * diff;
        }

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

    static int peakOfMountainOrBitonicArray(int[] arr) {
        if (arr.length < 3)
            return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid + 1] > arr[mid])
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }

    static int findInMountainArr(int[] arr, int target) {
        if (arr.length < 3)
            return -1;

//        find the peak

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid + 1] > arr[mid])
                start = mid + 1;
            else
                end = mid;
        }

        int peak = start;

//        search in ascending array

        start = 0;
        end = peak;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

//        search in descending array

        start = peak;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

}
