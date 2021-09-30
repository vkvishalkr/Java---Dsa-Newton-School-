package searching;

import java.util.Scanner;

public class LinearSearching {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // int totalElement = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int[n];

    int target = sc.nextInt();


        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean puchu = false;
        int i;
        for(i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
                puchu = true;
                break;
            } 
        }
        if(puchu == true) {
            System.out.println("Found at index " + i);
        } else {
            System.out.println("Not found");
        }
        
    }    
    
}


