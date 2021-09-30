package sortings;

public class SelectionSorting {
    
    public static void main(String[] args) {

        int a[] = {3, 1, -2, 7, 4, 0};
        // -2 , 1 , 3, 7 , 4, 0
        // -2, 0, 3, 7, 4, 1
        // -2, 0, 1, 7, 4, 3
        // -2 , 0, 1, 3, 4, 7

        int n = a.length;

        for (int i=0; i<n-1; i++) {

            int minIndex = i;
            for(int j=i; j<n; j++) {

                if(a[j] < a[minIndex]) {
                    minIndex = j;               //  4
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

        }

        for(int i=0; i<n; i++) {
            System.out.print(a[i]+ " ");
        }

        // for(int e: a) {
        //     System.out.print(e+ " ");
        // }

    }

}
