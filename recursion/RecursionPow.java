// package recursion;

// public class RecursionPow {
    
//     public static void main(String[] args) {
//         System.out.println(pow(3, 4));
//     } 

//     static int pow (int a, int b) {//pow(3,3)

//         if(b==0) {
//             return 1;
//         }

//         return a * pow(a, b-1);// 3 * pow(3,2)

//         //3*3*3*3
//         // 27*3
//         //9*3
//         //3*3
//         //1*3

//         //pow(3,4)
//         // 3 * pow(3,3)
//         // 3 * pow(3,2)
//         // 3 * pow(3,1)
//         // 3 * pow(3,0) 

//     }


package recursion;

public class RecursionPow {
    public static void main(String[] args) {

       pow(2,4);

    }

    static void pow(int base, int power)
    {
        int product=1;
        for(int i=1;i<=power;i++)
        {
            product=product*base;
        }
        System.out.println(product);
    }

}