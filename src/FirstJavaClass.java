import java.util.Scanner;
package src;

public class FirstJavaClass {

    public static void main(String[] args) {

        //   System.out.println(); 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        float age = sc.nextFloat();

        System.out.println(2 * age); 
    }
    
}
