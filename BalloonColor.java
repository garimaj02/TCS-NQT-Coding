// import java.util.Scanner;

// public class ballons {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int N = sc.nextInt();
//     char B[] = new char[N];

//     for(int i=0; i<N; i++)
//         B[i] = sc.next().charAt(0);
//         int lower[] = new int[26];
//         int upper[] = new int[26];
    
//         for(int i=0; i<N; i++){
//          if((B[i]>='A') && (B[i]<='Z'))
//          upper[B[i]-'A']++;
//          else if((B[i]>='a') && (B[i]<='z'))
//          lower[B[i]-'a']++;
        
//     }

//     boolean flag = false;
//     char ch ='\0';

//     for(int i =0; i<N; i++){
//         if ((B[i] >= 'A') && (B[i] <= 'Z'))
//             {
//                 if (upper[B[i] - 'A'] % 2 == 1)
//                     {
//                         ch = (char) (B[i]);
//                         flag = true;
//                         break;
//                     }
//             }
//             else if ((B[i] >= 'a') && (B[i] <= 'z'))
//             {
//                 if (lower[B[i] - 'a'] % 2 == 1)
//                 {
//                     ch = (char) (B[i]);
//                     flag = true;
//                     break;
//                 }
//             }
//     }
//     if (flag == true)
//             System.out.println (ch);
//         else
//             System.out.println ("All are even");
//     }
// }


import java.util.HashMap;
import java.util.Scanner;

public class BalloonColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting inputs
        int n = scanner.nextInt(); // Total number of balloons
        scanner.nextLine(); // Consume newline character

        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextLine(); // Reading colors of balloons
        }

        // Counting occurrences of each color
        HashMap<String, Integer> colorCount = new HashMap<>();
        for (String color : colors) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        // Finding the first color occurring odd number of times
        for (String color : colors) {
            if (colorCount.get(color) % 2 != 0) {
                System.out.println(color);
                return;
            }
        }

        // If all colors occur even number of times
        System.out.println("All are even");
    }
}


// This program first accepts the number of balloons and their colors. Then, it counts the occurrences of each color using a HashMap. Finally, it iterates through the colors array to find the first color occurring an odd number of times and prints it. If all colors occur even number of times, it prints "All are even".