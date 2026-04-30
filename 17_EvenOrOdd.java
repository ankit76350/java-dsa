class EvenOrOdd {
    public static void main(String[] args) {
        int a=91;
        //finding odd?
        System.out.println(odd(a));
    }

    public static boolean odd(int num) {
        // if return 1 then it will be odd
        return (num & 1) == 1;
    }
}
