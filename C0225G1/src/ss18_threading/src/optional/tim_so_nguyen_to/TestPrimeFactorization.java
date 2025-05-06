package optional.tim_so_nguyen_to;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        Thread optimizedThread = new Thread(new OptimizedPrimeFactorization());

        lazyThread.setPriority(Thread.MIN_PRIORITY);      
        optimizedThread.setPriority(Thread.MAX_PRIORITY);

        lazyThread.start();
        optimizedThread.start();
    }
}
