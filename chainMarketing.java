import java.util.*;

public class chainMarketing {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     
        // Accepting input for parent member
        System.out.println("Enter parent member:");
        String Member = sc.nextLine();
     
        // Accepting input if the parent member has child members
        System.out.println("Does " + Member + " have child members? (Y/N):");
        char hasChild = sc.nextLine().charAt(0);

        // List to store child members
        List<String> children = new ArrayList<>();

        // If parent has child members, accept their names
        if (hasChild == 'Y' || hasChild == 'y') {
            System.out.println("Enter names of child members of " + Member + " (comma separated):");
            String childrenInput = sc.nextLine();
            children.addAll(Arrays.asList(childrenInput.split(",")));
        }

        // Calculate total commission and commission for each member
        int totalMembers = 1 + children.size(); // Including parent
        int parentCommission = (int) (5000 * 0.1); // Parent commission
        int childCommission = (int) (5000 * 0.05); // Child commission

        // Display total members
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Commission Details:");

        // Display parent's commission
        System.out.println(Member + ": " + parentCommission + " INR");

        // Display commission for each child member
        for (String child : children) {
            System.out.println(child + ": " + childCommission + " INR");
    }
}
}
