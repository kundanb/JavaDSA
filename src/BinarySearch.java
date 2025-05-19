public class BinarySearch {

    static int usingLoop(int[] arr, int target) {
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

        return -1;
    }

    static int usingRecursion(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return usingRecursion(arr, target, start, mid - 1);
        else
            return usingRecursion(arr, target, mid + 1, end);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[arr.length - 1] >= arr[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }

}
