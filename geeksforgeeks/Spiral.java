
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
        int arr[][] =    {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15,16}};
        
        
        int s_c=0, e_c=3, s_r=0, e_r=3;
        
        while(s_c<=e_c || s_r<=e_r)
        {
            for(int i=s_c; i<=e_c; i++)
            {
                System.out.print(arr[s_r][i]+ " ");
            }
            s_r++;
            
            for(int i=s_r; i<=e_r; i++) 
            {
                System.out.print(arr[i][e_c]+ " ");
            }
            e_c--;
            
            if(s_c<e_c)
            {
                for(int i=e_c; i>=s_c; i--)
                {
                    System.out.print(arr[e_r][i]+ " ");
                }
                e_r--;
            }
            
            if(s_r<e_r)
            {
                for(int i=e_r; i>=s_r; i--)
                {
                    System.out.print(arr[i][s_c]+ " ");
                }
                s_c++;
            }
            
        }
        return new ArrayList<>();
            
    }
}
