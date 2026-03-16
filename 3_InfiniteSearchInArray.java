class InfiniteArraySearch{
    public static void main(String[] args){
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;        
        System.out.println("FoundIndex "+ ans(arr, target));
    }

    
    public static int ans(int[] arr, int target){

        int start = 0;
        int end = 1;

        // while(end < arr.length && target > arr[end]){
        while(target > arr[end]){ // this is beacuase our array length is infinite
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return search(arr, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end){
    
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            if(target< arr[mid]){
                end = mid -1;
            }else{
                start= mid+1;
            }
        }

        return -1;
    }
} 