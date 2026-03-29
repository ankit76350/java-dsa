import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.print(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int i = 0;
        while (i< arr.length) {
            int correctIndex = arr[i] -1;
            if (i != correctIndex) {
                swap(arr , i, correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }

     public static void swap(int[] arr , int currentIndex , int correctIndex){
       int temp = arr[currentIndex];
       arr[currentIndex] = arr[correctIndex];
       arr[correctIndex] = temp;
    }
}
