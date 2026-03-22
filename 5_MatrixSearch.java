import java.util.Arrays;

class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 },
        };

        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 9)));

    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int firstR = 0;
        // int lastC = matrix[0].length - 1;
        int lastC = matrix.length - 1;

        // while (firstR < lastC ) {
        while (firstR < matrix.length && lastC >= 0) {
            int element = matrix[firstR][lastC];
            
            if (element == target) {
                return new int[] { firstR, lastC };
            }

            if (element > target) {
                lastC--;
            } else {

                firstR++;
            }

        }

        return new int[] { -1, -1 };
    }
}
