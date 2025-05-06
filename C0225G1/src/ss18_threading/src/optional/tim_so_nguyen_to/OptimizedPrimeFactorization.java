package optional.tim_so_nguyen_to;

public class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run() {
        long number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("Optimized Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
