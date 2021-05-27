package hu.flowacademy.gyakorlat.primeTester;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adj meg egy felső határt!");
        long target = new Scanner(System.in).nextLong();
        System.out.println("Egy szálas prím tesztelő futtatása...");
        long start = System.nanoTime();
        long primes = new SingleThreadedPrimeTester().countPrimes(target);
        long stop = System.nanoTime();
        System.out.println("Egy szálas prím tesztelés befejeződött. Prímek száma: " + primes);
        System.out.println("Futásidő: " + (stop - start) / 10E5 + " ms");

        System.out.println("Több szálas prím tesztelő futtatása...");
        MultithreadedPrimeTester primeTester = new MultithreadedPrimeTester(Runtime.getRuntime().availableProcessors());
        start = System.nanoTime();
        primeTester.countPrimes(target);
        stop = System.nanoTime();
        System.out.println("Több szálas prím tesztelés befejeződött. Prímek száma: " + primeTester.getNumberOfPrimes());
        System.out.println("Futásidő: " + (stop - start) / 10E5 + " ms");
    }
}
