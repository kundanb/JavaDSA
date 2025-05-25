package BinarySearch;

public class SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 3;

        if (search(matrix, target))
            System.out.println("Found!");
        else
            System.out.println("Not found!");
    }

    static boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int r = mid / n;
            int c = mid % n;

            if (matrix[r][c] == target)
                return true;

            if (target < matrix[r][c])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return false;
    }

}
