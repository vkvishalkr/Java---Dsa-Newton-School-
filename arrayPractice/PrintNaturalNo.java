// package arrayPractice;

// public class PrintNaturalNo {
    
//     public static void main(String[] args) {

//         int arr[] = new int[10];

//         for(int i = 0; i<arr.length; i++) {
//             arr[i] = i+1;
//         }

//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }

//     }

// }



package arrayPractice;

public class PrintNaturalNo {

    public static void main(String[] args)  {

        int arr[] = new int[10]; 

        for (int i=10; i>=1; i--) {
            arr[i-1] = 11-i;
        }

        for (int i=0; i>arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}


