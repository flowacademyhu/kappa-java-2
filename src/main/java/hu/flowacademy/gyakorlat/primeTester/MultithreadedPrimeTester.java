package hu.flowacademy.gyakorlat.primeTester;

public class MultithreadedPrimeTester {
    private final int numberOfThreads;
    private final PrimeTester[] primeTesters;

    public MultithreadedPrimeTester(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
        this.primeTesters = new PrimeTester[numberOfThreads];
    }

    public void countPrimes(long target) {
        for (int i = 0; i < numberOfThreads; i++) {
            primeTesters[i] = new PrimeTester(i * target / numberOfThreads + 1, (i + 1) * target / numberOfThreads);
            primeTesters[i].start();
        }

        try {
            for (int i = 0; i < numberOfThreads; i++) {
                primeTesters[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfPrimes() {
        int count = 0;
        for (PrimeTester pt : primeTesters) {
            count += pt.getNumberOfPrimes();
        }
        return count;
    }
}

class PrimeTester extends Thread {
    private final long begin;
    private final long end;
    private long numberOfPrimes;

    public PrimeTester(long begin, long end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (long i = begin; i <= end; i++) {
            if (PrimeUtils.isPrime(i)) {
                numberOfPrimes++;
            }
        }
    }

    public long getNumberOfPrimes() {
        return numberOfPrimes;
    }
}


