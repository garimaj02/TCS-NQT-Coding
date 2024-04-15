import java.util.Scanner;

public class priorMaxCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
        // int arr[] = {5,3,4,5,8,9};
        int count=1;

        for(int i=1; i<arr.length;i++){
             if(arr[i]>arr[i-1]){
                   count++;
             }
        }
        System.out.println(count);
    }
}
