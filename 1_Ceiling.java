class Ceiling{
    public static void main(String[] args){
        int[] arr = {2,3, 4,5,9, 14, 16, 18};
        int target = 17;
        int index=ceilingFind(arr, target);

        // System.out.println("Find Number: " + arr[index]);
        System.out.println("Find Number: " + index);
    }

    public static int ceilingFind(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end - start)/2;
            if (target==arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        //start == end 
        if (arr[end] < target) {
            return -1;
        }

        //start and end eqaul
        return start; // return end;
    }
}