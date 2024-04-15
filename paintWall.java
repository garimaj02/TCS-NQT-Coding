import java.util.Scanner;

public class paintWall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ni = sc.nextInt();
        int ne = sc.nextInt();

        float intP = 18, extP = 12, cost = 0 ;

        if(ni < 0 || ne < 0){
         System.out.println("INVALID INPUT");
        }
        else if(ni ==0 && ne == 0){
            System.out.println("Total Estimated Cost: 0.0");
        }
        else{
            for(int i = 0; i<ni; i++ ){
                float temp = sc.nextFloat();
                cost += intP * temp;
            }
            for(int i = 0; i<ne; i++ ){
                float temp = sc.nextFloat();
                cost += extP * temp;
            }
        }
        System.out.printf("Total Estimated cost: %.1f", cost,  "INR"); 
    }
}
