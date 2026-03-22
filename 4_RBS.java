// https://leetcode.com/problems/search-in-rotated-sorted-array/
class RBS {
    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(findPivot(nums));

    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }

            if (start < arr[mid]) {
                start = mid + 1;
            }

        }

        return -1;

    }

}