package arrayPractice;

// import java.util.Scanner;
import java.util.Scanner;


public class ScannerArray {

    public static void main(String[] args) {
        
        // // Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);


        // // int n = sc.nextInt();
        // int n = sc.nextInt();
        
        // System.out.println(n+1);
        // // int arr[] = new int[n];




        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=1; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]+ " ");
        }  
            
    }

}
