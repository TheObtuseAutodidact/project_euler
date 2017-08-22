// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
// we can see that the 6th prime is 13.

// What is the 10,001st prime number?
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem07 {
    public static void main(String[] args) {
        List<Integer> primesCollection = new ArrayList<>();
        int counter = 2;
        while (primesCollection.size() < 10001) {
            if (nextPrime(counter, primesCollection)) {
                primesCollection.add(counter);
            }
            counter++;
        }
        System.out.println(Collections.max(primesCollection));
    }

    private static boolean nextPrime(int nextNum, List<Integer> primes) {
        for (int prime : primes) {
            if (nextNum % prime == 0) {
                return false;
            }
        }
        return true;
    }
}