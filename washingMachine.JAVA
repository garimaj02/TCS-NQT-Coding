import java.util.Scanner;

public class washingMachine {
    public static String estimateTime(int weight) {
        if (weight < 0 || weight > 7000) {
            return "INVALID INPUT";
        } else if (weight == 0) {
            return "Time Estimated: 0 minutes";
        } else if (weight <= 2000) {
            return "Time Estimated: 25 minutes";
        } else if (weight <= 4000) {
            return "Time Estimated: 35 minutes";
        } else if (weight <= 7000) {
            return "Time Estimated: 45 minutes";
        } else {
            return "OVERLOADED";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // int weight = 2000;
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        System.out.println(estimateTime(weight));
    }
}
