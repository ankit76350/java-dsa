class Floor {
    public static void main(String[] args){
        int[] arr = {2,3, 4,5,9, 14, 16, 18};
        int target = 13;
        int index=floorFind(arr, target);

        // System.out.println("Find Number: " + arr[index]);
        System.out.println("Find Number: " +index);
    }


    public static int floorFind(int[] arr, int target ){

        int start = 0;
        int end = arr.length-1;

        if (target < arr[start]) {
            return -1;
        }

        while (start<=end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target<arr[mid]) {
                end = mid-1;
            }

            if (target>arr[mid]) {
                start = mid +1;
            }
        }

        // here end < start; 
        return end;
    }
}
