// package recursion;

// public class Recursion1 {
//     public static void main(String[] args) {
//         int n=5;
//         printNum(n);
//     }

//     public static void printNum( int n) {

//         if(n==0) {
//             return;
//         }

//         System.out.println(n);
//         printNum(n-1);
//     }
 
    
// }



////////////////////////////////////////////////////////////////////////


// package recursion;

// public class Recursion1 {
//     public static void main(String[] args) {
//         int n=1;
//         printNum(n);
//     }

//     public static void printNum( int n) {

//         if(n==6) {
//             return;
//         }

//         System.out.println(n);
//         printNum(n+1);
//     }
// }


//////////////////////////////////////////////////////////////////////////////



// package recursion;

// public class Recursion1 {
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }

//     public static void printSum(int i, int n, int sum) {

//         if(i==n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }

//         sum += i;
//         printSum(i+1, n, sum);
//     }
// }


//////////////////////////////////////////////////////////////////////////////




// package recursion;

// public class Recursion1 {
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = calcFactorial(n);
//         System.out.println(calcFactorial(ans));
//     }

//     public static int calcFactorial(int n) {
//         if(n==1 || n==0){
//             return 1;
//         }

//         int fact_nm1 = calcFactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
        
//     }
// }



////////////////////////////////////////////////////////////////////////////

package recursion;

    public class Recursion1 {
        public static void main(String[] args) {

            System.out.println(findPow(3, 4));

        }

        public static int findPow(int a, int b){

            if(b == 1) {
                return a;
            }

            int value = a * findPow(a , b-1);
            return value;

        }
    }

    //////////////////////////////////////////////////////////////////////////