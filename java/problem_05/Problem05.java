// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class Problem05 {
    public static void main(String[] args) {
        boolean foundAFalse = true;
        int counter = 20;
        while(foundAFalse) {
        foundAFalse = false;
            for (int i = 2; i <= 20; i++) {
                if (counter % i != 0) {
                    foundAFalse = true;
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}