package telusko;

public class iterationDemo {
    
    public static void main(String[] args)
    {
        // //  While loop
        // int i = 1;
        // while(i<=5)
        // {
        //     System.out.println("Hello");
        //     i++;
        // }


        // // do While loop
        // int i = 9;
        // do
        // {
        //     System.out.println("Hello");
        //     i++;
        // } while(i<=5);

        // //  for Loop
        //     for(int i=1; i<=5; i++)
        //     {
        //         System.out.println("Hello");
        //     }

        //  printing stars // Nested loops
        // for (int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=4; j++)
        //     {
        //         System.out.print(j+ " ");
        //         // System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Print 1 to 6  like triangle

        // int i,j;
        // for(i=1;i<=6; i++)
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print(j +" ");
        //     }
        //     System.out.println(" ");
        // }

            for (int i =0; i<=5; i++)
            {
                int alphabet=65;        // ASCII value of A 
                for(int j=0;j<=i;j++)
                {
                    System.out.print((char)alphabet+" ");
                    alphabet++;
                }
                System.out.println();
            }
    } 
}

