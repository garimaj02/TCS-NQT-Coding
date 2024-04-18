import java.util.Scanner;

public class chocoPacket {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element in arr: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int count=0,i;

    for(i = 0; i< n; i++){
     arr[i] = sc.nextInt();
    }
    
  for( i =0; i<n; i++){
    if(arr[i] != 0){
      arr[count++] = arr[i];
    }
}
for(i = count ; i<n; i++){
    arr[i]=0;
}
for(i = 0; i<n; i++) {
  System.out.println(arr[i]+ " ");
}
    }
}
