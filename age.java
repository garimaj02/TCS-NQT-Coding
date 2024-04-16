import java.util.Scanner;

public class age {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of ages: ");
       int n= sc.nextInt();
       int[] age = new int[n];
       int i = 0, fees = 0;

       for(i=0;i<n;i++){
        System.out.print("Enter age " + (i + 1) + ": ");
        age[i] = sc.nextInt();
        }

        for(i=0; i<age.length; i++){
        if(age[i]==0 || age[i]<0){
            System.out.println("INVALID INPUT");
        }
        else{
        if(age[i]<17){
            fees += 200;
        }
        else if(age[i]>=17 && age[i] <= 40){
            fees += 400;
        }
        else if(age[i]>40){
            fees += 300;
        }
        }
    }
    System.out.println("Total Income " + fees + " INR");
}
}


// import java.util.Scanner;

// public class age {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of ages: ");
//         int n = sc.nextInt();
        
//         if (n <= 0) {
//             System.out.println("INVALID INPUT");
//             return;
//         }
        
//         int[] ages = new int[n];
//         int fees = 0;

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter age " + (i + 1) + ": ");
//             ages[i] = sc.nextInt();
//             if (ages[i] <= 0) {
//                 System.out.println("INVALID INPUT");
//                 return;
//             }
//         }

//         for (int age : ages) {
//             if (age < 17) {
//                 fees += 200;
//             } else if (age >= 17 && age <= 40) {
//                 fees += 400;
//             } else {
//                 fees += 300;
//             }
//         }
//         System.out.println("Total Income: " + fees + " INR");
//     }
// }
