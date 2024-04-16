import java.util.*;

public class vending {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
      String c[] = {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"};
      String[] t = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardmom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"};
      String[] s = {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"};
      String[] b = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"};
 
      int i =0;
      Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       int item = sc.nextInt();

       if(ch == 'c'){
          for(i=0; i<3; i++){
            if(item == i+1){
                System.out.println("Welcome to CCD! \nEnjoy Your " + c[i]);
                break;
            }
          }
          if(i==3){
            System.out.println("INVALID OPTION!");
          }
       }
       else if(ch == 't'){
        for(i=0; i<8; i++){
            if(item == i+1){
                System.out.println("Welcome to CCD! \nEnjoy Your " + t[i]);
                break;
            }
          }
          if(i==8){
            System.out.println("INVALID OPTION!");
          }
       }
       else if(ch == 's'){
        for(i=0; i<4; i++){
            if(item == i+1){
                System.out.println("Welcome to CCD! \nEnjoy Your " + s[i]);
                break;
            }
          }
          if(i==4){
            System.out.println("INVALID OPTION!");
          }
       }
       else if(ch == 'b'){
        for(i=0; i<3; i++){
            if(item == i+1){
                System.out.println("Welcome to CCD! \nEnjoy Your " + b[i]);
                break;
            }
          }
          if(i==3){
            System.out.println("INVALID OPTION!");
          }
       }
       else
       {
        System.out.println("INVALID INPUT");
       }
    }
}
