class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] primeNumbers = new boolean[n+1];
        findPrimeNumbers(n,primeNumbers);

    }

    public static void findPrimeNumbers(int n,boolean[] primeNumbers) {
        
        for (int i = 2; i*i <= n; i++) {
            if (!primeNumbers[i]) {
                for (int j = i * 2; j <= n; j+=i) {
                    primeNumbers[j] = true;
                }
            }
            
        }

        for (int i = 2; i <=n; i++) {
            if (!primeNumbers[i]) {
                System.out.println(i);
            }
        }

       
    }
}
