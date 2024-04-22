// Consider the following series: 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27 ...
// This series is a mixture of 3 series
// • All the prime position values are power of 2.
// • All the perfect square position are power of 3..
// • Remaining positions are sum of previous 2 values.
// For example, if N=15, the 15th term in the series is 104, so only value 104 should be printed to STDOUT.
// You can assume that N will not exceed 40.

import java.util.Scanner;

public class seriesThree {

    public static boolean isPerfectSquare(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Increase array size by 1 to accommodate index 0

        arr[0] = 1; // Initialize first two elements of the series
        arr[1] = 1;
        int pow_of_two = 1;
        int pow_of_three = 1;

        for (int i = 0; i <= n; i++) {
            if (isPrime(i + 1)) {
                arr[i] = pow_of_two;
                pow_of_two *= 2;
            } else if (isPerfectSquare(i + 1)) {
                arr[i] = pow_of_three;
                pow_of_three *= 3;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println(arr[n]);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
