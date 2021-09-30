package loop;

public class ForLoop {
    
    public static void main(String[] args) {


        int i;
        for(i=0; i<10; i++) {
            System.out.println(i);
        }

        System.out.println(i); // 10
        System.out.println(i);   //10
        System.out.println(i++);   //10
        System.out.println(i);   //11


        // **************************************

        // for(int i=0; ;) {
        //     System.out.println(i);
        //     i++;          // Running ifinite times
        // }


        // ******************************************

            // int i = 0;
            // for( ; ; ) {
            //     System.out.println(i);    
            //     i++;                        // Running infinite times
            // }


    }

}


