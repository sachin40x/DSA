public class factorial {
    public static int factorial (int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoff = fact_n /(fact_r*fact_nmr);
        return binCoff;
    }

    public static void main(String[] args) {
       // System.out.println("factorial of n is " +factorial(4));
        System.out.println(binCoff(5, 2));
    }
}