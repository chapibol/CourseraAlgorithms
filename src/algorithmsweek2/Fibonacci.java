package algorithmsweek2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fastCalcFib(n));
    }

    private static long calcFib(int n) {
        if (n <= 1)
            return n;
        return calcFib(n - 1) + calcFib(n - 2);
    }

    private static long fastCalcFib(int n) {
        // n >= 2
        long[] numbers = new long[n];
        numbers[0] = 0;
        numbers[1] = 1;

        for(int i = 2; i < numbers.length; i++){
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n - 1]; // return the last element which coincides with n

    }

}