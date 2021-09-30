package arrays; 

import java.util.Scanner;

public class Searching {
    
    public static void main(String[] args) {

        int a[] = new int[5];
        int n;
        int count=0;
  
        System.out.print("Enter element in Array ");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Array Elements ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println("\nEnter Search Elements ");
        n=sc.nextInt();
        for(int i=0; i<a.length; i++) {

            if(a[i]==n) {
                count++;
            }

        }

        if(count>0) {
            System.out.print("Item found "+count+" times");
        }
        else {
            System.out.print("Item not found");
        }



    }

}
