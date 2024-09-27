package org.example.part_4_practice._2024_09_25_mercedes_benz_india;

/*
 * calculate sum of discount in range of number e.g 10 to 100
 *      if(sum of digits of the number - highest digit in the number = highest digit)
 *          discount += number
 *
 * My mistakes:
 *  1. always use 2 different variables for iterators in a while and for loops // this is a silly mistake, sometimes doesn't strike
 *      1.1 the iterator should never be processed, just read // fundamental mistake
 *  2. use proper variables // this happens because of lack of focus
 *
 */
public class P2 {
    public static void discount(int a, int b) {
        System.out.println("discount");
        int discount = 0;

        for (int number = a; number <= b; number++) {
            System.out.println("for a to b: " + number);
            int sumDigits = 0;
            int high = 0;
            int currentNumber = number;

            while (currentNumber > 0) {
                System.out.println("while currentNumber>0: " + currentNumber);
                int digit = currentNumber % 10;
                sumDigits += digit;

                if (digit > high) {
                    high = digit;
                }

                currentNumber = currentNumber / 10;
            }

            System.out.println("sumDigits: " + sumDigits);
            System.out.println("high: " + high);
            int diff = sumDigits - high;
            if (diff == high) {
                System.out.println("our number: " + number);
                discount += number;
            }
        }

        System.out.println("final discount: " + discount);
    }

    public static void main(String[] args) {
        System.out.println("start");
        discount(10, 1000); //495
    }
}
