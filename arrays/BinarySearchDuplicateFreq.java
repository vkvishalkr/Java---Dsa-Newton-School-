package arrays; 

public class BinarySearchDuplicateFreq {
    
    public static void main(String[] args) {
        int[]arr = {1,2,2,2,2,2,2,2, 3, 3, 3, 5};
        int target = 5;
        int result = searchDupFreq(arr, 0, arr.length-1, target);
        System.out.println("Frequencyof Target "+ target );
        System.out.println( result );
    } 

    private static int searchDupFreq(int []arr, int s, int e, int target) {

        // step 1: finding first position
        //  step 2: finding last position
        //  step 2: return last position - first position + 1;

        int sp = searchFirstTargetPos(arr, s, e, target);
        if ( sp == -1) {
            return 0;
        }
        int ep = searchLastTargetPos(arr, s, e, target);
        if (ep == -1) {
            return 0;
        }
        return ep-sp+1;

    }

    private static int searchLastTargetPos(int []arr, int s, int e, int target) {
        int lastTargetPosistion = -1;

        while(s<=e) {
            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                lastTargetPosistion = mid;
                s = mid+1;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return lastTargetPosistion;
    }

    private static int searchFirstTargetPos(int []arr, int s, int e, int target) {

        int firstTargetPosition = -1;

        while (s<=e) {

            int mid = s + (e-s)/2;
            if (arr[mid] == target) {
                firstTargetPosition = mid;
                e = mid-1;
            } else if (arr[mid] > target) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return firstTargetPosition;
    }

}
