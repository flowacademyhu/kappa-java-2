package hu.flowacademy.gyakorlat.primeTester;

public class SingleThreadedPrimeTester {
    public long countPrimes(long target) {
        long count = 0;
        for (long i = 1; i <= target; i++) {
            if(PrimeUtils.isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
