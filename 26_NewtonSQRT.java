class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(squareRoot(40));
    }

    public static double squareRoot(int n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + n / x);

            if (x - root < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}