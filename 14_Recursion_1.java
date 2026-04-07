class Recursion {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        System.out.println("Hello From method : 1");
        method2();
    }
    public static void method2(){
        System.out.println("Hello From method : 2");
        method3();
    }
    public static void method3(){
        System.out.println("Hello From method : 3");
        method4();
    }
    public static void method4(){
        System.out.println("Hello From method : 4");
        method5();
    }
    public static void method5(){
        System.out.println("Hello From method : 5");
    }
}
