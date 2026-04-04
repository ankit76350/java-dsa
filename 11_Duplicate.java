class Duplicate {

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        int[] arr2 = {1,3,4,2,2};
        // int[] arr1 = {3,1,3,4,2};

        System.out.print(findDisappearedNumbers(arr2));
    }

    public static int findDisappearedNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    public static void swap(int[] arr, int currentIndex, int correctIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}