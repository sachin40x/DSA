public class PrimeRange {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (Prime.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}