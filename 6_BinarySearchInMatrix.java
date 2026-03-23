import java.util.Arrays;

class BinarySearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 16)));
    }

    // searching in the cloumn.
    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        int start = cStart;
        int end = cEnd;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (target > arr[row][mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int sRow = 0;
        int eRow = rows - 1;
        int cMid = cols / 2;

        while (sRow < eRow - 1) {
            int rMid = sRow + (eRow - sRow) / 2;

            if (target == matrix[rMid][cMid]) {
                return new int[] { rMid, cMid };
            }

            if (target > matrix[rMid][cMid]) {
                sRow = rMid;
            } else {
                eRow = rMid;
            }

        }

        if (target == matrix[sRow][cMid]) {
            return new int[] { sRow, cMid };
        }

        if (target == matrix[eRow][cMid]) {
            return new int[] { eRow, cMid };
        }

        // 1st quadrant
        if (target <= matrix[sRow][cMid - 1]) {
            return binarySearch(matrix, sRow, 0, cMid - 1, target);
        }

        // 2nd quadrant
        if (target >= matrix[sRow][cMid + 1] && target <= matrix[sRow][cols - 1]) {
            return binarySearch(matrix, sRow, cMid + 1, cols - 1, target);
        }

        // 3rd quadrant
        if (target <= matrix[eRow][cMid - 1]) {
            return binarySearch(matrix, eRow, 0, cMid - 1, target);
        }

        // 4th quadrant
        return binarySearch(matrix, eRow, cMid + 1, cols - 1, target);

    }
}
