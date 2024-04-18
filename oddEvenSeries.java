import java.util.Scanner;

public class oddEvenSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b= 1;
        if(n % 2 == 0){
           for(int i =1 ; i <= (n-2); i=i+2){
         a = a*2;
         b = b*3;
           }
           System.out.println(n + " element of the series is = "+b);
        }
        else{
            for(int i = 1; i<(n-2); i = i+2){
                a = a* 2;
                b = b* 3;

            }
            a = a* 2;
            System.out.println(n + " element of the series is = "+a);
        }

    }
}
