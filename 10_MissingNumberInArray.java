    class MissingNumberInArray {
        public static void main(String[] args) {
            int[] arr = { 4, 0, 2, 1 };
            System.out.print(missing(arr));

        }

        public static int missing(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                // if (i < arr.length && i != arr[correct])
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if (j != arr[j]) {
                    return j;
                }
            }

            return arr.length;
        }

        public static void swap(int[] arr, int currentIndex, int correctIndex) {
            int temp = arr[currentIndex];
            arr[currentIndex] = arr[correctIndex];
            arr[correctIndex] = temp;
        }

    }
