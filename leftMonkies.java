import java.util.Scanner; 

public class leftMonkies{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    //    number of total monkies
       int n = sc.nextInt();
    //    
       int k = sc.nextInt();
       int j = sc.nextInt();
       int m = sc.nextInt();
       int p = sc.nextInt();

       if(n<=0 || k <= 0 || j<= 0 || m<=0 || p<=0){
        System.out.println("INVALID INPUT");
       }
       else{
        int res = n-m/k-p/j;
        System.out.println("Number of monkeys left on the tree:" + res);
       }
    }
}
