package searching;

// import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        
        int arr[] = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        
        int search = 28;
        int lower =0;     // 6
        int higher = arr.length-1;   // 11  7
        int mid=0;

        boolean puchu = false;
        while(lower<=higher) {

            mid = (lower+higher)/2;  //  (0+11)/2 = 5  // 8  // 6

            if(arr[mid] == search) {
                puchu = true;
                break;
            }
            else if(arr[mid]<search) {
                lower = mid+1;          
            }
            else if(arr[mid]>search) {
                higher = mid-1;
            }

        }

        if(puchu == true) {
            System.out.print("At position " + (mid+1));
        } else {
            System.out.print("Not Found");

        }

    }

}