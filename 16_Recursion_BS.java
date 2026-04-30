class RecursionBS {
    public static void main(String[] args) {
        int[] arr = {
                1, 3, 5, 7,
                10, 11, 16, 20,
                23, 30, 34, 60
        };
        System.out.print("Here is the index: " + search(arr,15,0,arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] < target) {
            return search(arr, target, m + 1,e);
        }

        return search(arr, target, s, m - 1);
    }
}
