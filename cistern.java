import java.util.Scanner;

public class cistern {

   public static int sumofDigits(int N){
    int sum = 0;
    while(N>0){
        sum = sum + N%10;
        N = N/10;
     }
     return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int res = 0;
        
        if(R == 0){
            System.out.println("0");
        }
        else{
            res = sumofDigits(N)*R;
            int sum = 0;
            while (true) {
                while (res>0) {
                    sum = sum+res%10;
                    res = res/10;
                }
                if((sum/10)==0)
                    break;
                else
                    res = sum;
            }
            System.out.println(sum);
        }
    

    }
}
