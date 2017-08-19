import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem04 {

    // A palindromic number reads the same both ways. 
    // The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    // Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args) {
        List<Integer> palindromeCollection = new ArrayList<Integer>();
        for (int i = 1; i <= 999; i++) {
            for (int j= 1; j <= 999; j++) {
                int sum = i * j;
                String stringNum = String.valueOf(sum);
                if ( stringNum.equals(reverse(stringNum))) {
                    palindromeCollection.add(sum);
                }
            }
        }

        System.out.println(Collections.max(palindromeCollection)); // 906609
    }

    private static String reverse(String testString) {
        String result = "";
        for (int i = testString.length()-1; i >= 0; i--) {
            result = result + testString.charAt(i);
        }
        return result;
    }
}