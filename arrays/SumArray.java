package arrays;

import java.util.Scanner;

public class SumArray {
    
    public static void main(String[] args) {
        //  WAP to find sum of all elements of an arrays.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many elements you want?");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter element:"+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Entered is:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        int sum = 0;
        for(int i=0; i<n; i++) {
            sum=sum+arr[i];
        }
        System.out.println("\nSum of array elements are:"+sum);

    sc.close();

    }

}
