package searching;

import java.util.Scanner;

public class BinarySearching {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();


            int lower = 0;
            int higher = arr.length-1;
            int mid = 0;
            sc.close();


            boolean puchu = false;
            while(lower<=higher) {
                mid = (lower+higher)/2;
                if(arr[mid]==target) {
                    puchu = true;
                    break;
                } 
                else if(arr[mid]<target) {
                    lower = mid+1;
                }
                else if(arr[mid]>target) {
                    higher = mid-1;
                }
            }
            if(puchu == true) {
                System.out.println("Target Exists At Position "+ (mid+1));
            }
            else{
                System.out.println("Doest Not Exist");
            }
        }
}
