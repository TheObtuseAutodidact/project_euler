// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem03 {

    public static void main(String[] args) {
        List<Integer> results = new ArrayList<Integer>();
        // results.add(2);
        boolean isPrime;
        long startingSum = 600851475143L;
        int i = 2;
        while(true) {
            
            if (startingSum % i == 0) {
                startingSum /= i;
                if (!results.contains(i)) {
                    results.add(i);
                    i = 2;
                }
            }
            if (i>=startingSum) {
                break;
            }
            i++;
        }
       
        System.out.println(Collections.max(results));
    }
}