public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization oddThread = new LazyPrimeFactorization();
        Thread t1 = new Thread(oddThread);
        OptimizedPrimeFactorization evenThead = new OptimizedPrimeFactorization();
        Thread t2 = new Thread(evenThead);
        t1.start();
        t2.start();
    }
}
