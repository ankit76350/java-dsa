import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        selectionSort(arr);
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int max = 0;
            for (int j = 0; j <= arr.length - i -1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[max];
            arr[max] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
        return arr;
    }
}
