// package recursion;

// public class RecursionSum {

//     public static void main(String[] args) {
//         System.out.println(sum(5));      // 1+2+3+4+5
//     }

//     static int sum(int n) {
//         if(n==1) {
//             return 1;
//         }

//         return n + sum(n-1);
//     }

// }


package recursion;

public class RecursionSum {
    public static void main(String[] args) {
 
        Add(6);

    }

    static void Add(int n) {

        int sum = 0;

        for(int i = 1; i<=n; i++) {

           sum = sum + i;

        }
        System.out.println(sum);
        // return; we can write , but cant return anything......
    }

}

