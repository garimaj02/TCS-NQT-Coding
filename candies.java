import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int res = N - K;

        if (K >= 1 && K <= 5) {
            System.out.println("NUMBER OF CANDIES SOLD:" + K);
            System.out.println("NUMBER OF CANDIES AVAILABLE:" + res);

        } else {
            System.out.println("INVALID INPUT NUMBER OF");
            System.out.println("CANDIES LEFT: " + N);
        }
    }
}
