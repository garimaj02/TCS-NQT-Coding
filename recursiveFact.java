import java.util.Scanner;

public class recursiveFact {

    public static int fact(int n){
        if(n == 0 || n == 1)
        return 1;
        else
        return n * fact(n-1); 
   }
       
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res = 0;
        if(n<0){
            System.out.println("Please enter positive number");
        }
        else{
            res = fact(n);
            System.out.println("factorial of this number is: " + res);
        }
       
       
    }
    
}
