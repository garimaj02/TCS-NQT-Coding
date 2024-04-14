import java.util.Scanner;

public class StrMatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int c1= 0;
        int c2=0;

        for(int i=0; i<str.length();i++){
        if(str.charAt(i)=='*'){
            c1++;
        }
        else if(str.charAt(i)=='#'){
            c2++;
        }
    }
        System.out.println(c1-c2);
    
    }
}
