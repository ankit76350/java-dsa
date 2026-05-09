import java.util.ArrayList;

class Factor {
    public static void main(String[] args) {
        factorN(20);
        factorSqrtN(20);
        factorSqrtNSorted(20);
    }

    // factorN() → O(n)
    public static void factorN(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // factorSqrtN() → O(√n)
    public static void factorSqrtN(int n) {

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n % i == i) {
                    System.out.print(i + " ");
                } else {

                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
        System.out.println();
    }

    // factorSqrtNSorted() → O(√n) 
    public static void factorSqrtNSorted(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n % i == i) {
                    System.out.print(i + " ");
                } else {

                    System.out.print(i + " ");
                    arrayList.add(n / i);
                }
            }
        }

        // for (Integer integer : arrayList) {
        // System.out.print(integer + " ");
        // }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

}
