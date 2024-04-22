import java.util.Scanner;

public class ceaserCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int key = sc.nextInt();

        for(int i =0; i<str.length(); i++){
            if(str.indexOf(i)>=65 && str.indexOf(i) <=90){
                   int index = str[i] - 'A';
            }
        }
    }
}
