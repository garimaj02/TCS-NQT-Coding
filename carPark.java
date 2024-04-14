import java.util.Scanner;

public class carPark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Value of Row: ");
        int R = sc.nextInt();

        System.out.println("Enter Value of Column: ");
        int C = sc.nextInt();

        int M[][] = new int[R][C];

        for(int i=0; i<R; i++)
            for(int j=0; j<C; j++)
            M[i][j] = sc.nextInt();

            int max = 0, count =0, index =0;
            for(int i=0;i<R;i++){
            //    count = 0;
               for(int j=0; j<C;j++){
                if(M[i][j]==1)
                count++;
               }
               if(count>max){
                max=count;
                index=i+1;
               }
            }
               System.out.println(index);
            }
        }
   
