class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 23, 2, 4, 6, 7, 23 };

        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int unique = 0;

        for (int ele : arr) {
            unique = unique ^ ele;
        }

        return unique;
    }
}
