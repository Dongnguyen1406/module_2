package optional.tim_so_nguyen_to;

public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        long number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("Lazy Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
