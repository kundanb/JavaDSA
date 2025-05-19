public class LinearSearch {

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;

        return -1;
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++)
            if (arr[i] == target)
                return i;

        return -1;
    }

}
