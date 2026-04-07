// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

class Pattern {
    public static void main(String[] args) {
        pattern312(5);
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
            for (int col = 1; col <= n + 1 - row; col++) {
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
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCols = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalCols;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }
            // first half
            for (int col = row; col > 1; col--) {
                System.out.print(col + " ");
            }
            // second half
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    public static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalCols = row > n ? 2 * n - row : row;

            for (int spaces = 1; spaces <= n - totalCols; spaces++) {
                System.out.print("  ");
            }
            // first half
            for (int col = totalCols; col > 1; col--) {
                System.out.print(col + " ");
            }
            // second half
            for (int col = 1; col <= totalCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    public static void pattern311(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
//    I come from the top to bottom
    public static void pattern312(int n) {
        int N = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = N - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
