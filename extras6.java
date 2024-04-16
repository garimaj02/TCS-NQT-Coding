import java.util.Scanner ; 

public class extras6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        int oddPositionTerm = 0 , evenPositionTerm = 0 ; 

        System.out.println("Enter the nth term ");
        int n = sc.nextInt() ; 

        for(int i=1 ; i < n ; i++){
            if(i % 2 != 0){
                if(i == 1){
                    oddPositionTerm = 0 ; 
                } else {
                    oddPositionTerm += 2 ; 
                }
            } else {
                if(i == 2){
                    evenPositionTerm = 0 ; 
                } else {
                    evenPositionTerm += 1 ; 
                }
            }
        }
        if(n % 2 != 0){
            System.out.println("Term: " + oddPositionTerm);
        } else {
            System.out.println("Term: " + evenPositionTerm);
        }
    }
} 