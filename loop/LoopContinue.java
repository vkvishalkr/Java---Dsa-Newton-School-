package loop;

public class LoopContinue {
    
    public static void main(String[] args) {


        // for(int i=0; i<5; i++) {
        //     if(i%2 == 0) {
        //         System.out.println(i);            // 0 2 4
        //         continue;
        //     }
        //     System.out.println(i);                // 1 3 4
        // }


        // ***************************************************

        int i=0;
        while(i<5) {

            if(i%2 == 0) {
                System.out.println(i);
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    } 
}
