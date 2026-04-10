
class WhatIsRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1); // return ke time pe function alwasya go there from where the function is called (basicalli to the next line)
        System.out.println(n);
    }
    
}
