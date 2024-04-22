import java.util.Scanner;

public class RoundTableConference {
    
    public static long factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members (N):");
        int N = sc.nextInt();

        if (N < 2 || N > 50) {
            System.out.println("Invalid input. Number of members should be between 2 and 50.");
            return;
        }
        
        // Calculate the number of arrangements for members other than the president and prime minister
        long remainingArrangements = factorial(N - 1);
        
        // The president and prime minister will be considered as a single member, so multiply by 2!
        long twoTogetherArrangements = 2;
        
        // Total possible ways
        long totalWays = remainingArrangements * twoTogetherArrangements;
        
        System.out.println("Possible ways of seating the members: " + totalWays);
    }
}
