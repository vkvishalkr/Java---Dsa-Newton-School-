package telusko;

public class arrayDemo {
    public static void main(String[] args)
    {
        // // Two dimensional array

        // int a[] = {1,2,3,4};
        // int b[] = {2,4,6,8};
        // int c[] = {5,6,7,8};

        // int  d[][] = {
        //     {1,2,3,4},
        //     {2,4,6,8},
        //     {5,6,7,8}
        // };

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         System.out.print(" "+ d[i][j]);
        //     }
        //     System.out.println();
        // }

        //  Enhanced For Loop

        // for(int k[] : d)
        // {
        //     for(int l : k)
        //     {
        //         System.out.print(" "+ l);
        //     }
        //     System.out.println();
        // }

        //  Jagged Array

        
        int a[] = {1,2,3,4};
        int b[] = {2,4,6,8};
        int c[] = {5,6,7,8};

        int  d[][] = {
            {1,2,3,4},
            {2,4,8},
            {5,6,7,8,9}
        };

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<d[i].length; j++)
            {
                System.out.print(" "+ d[i][j]);
            }
            System.out.println();
        }

        //  Enhanced For loop

        for(int k[] : d)
        {
            for(int l : k)
            {
                System.out.print(" "+ l);
            }
            System.out.println();
        }

    }   
}
 