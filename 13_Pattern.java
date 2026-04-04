// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

class Pattern {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 -row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {
            int totalCols = row > n ? 2*n-row : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
