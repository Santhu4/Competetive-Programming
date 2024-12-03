public class diagonal_matrix {
 public static void main(String[] args) {
    int arr[][] = {{1,2,3,4},
                    {6,7,8,9},
                    {10,11,12,13},
                    {14,15,16,17}};

        int d = 0;
        int n = arr[0].length;
        int m = arr.length;
        int row = 0;
        int col = 0;
        int i = 0;
        while(i<(m*n)){
            System.out.print(arr[row][col]+" ");
            i++;
            if(d == 0){
                if(col == n-1){
                    row++;
                    d = 1;
                }else if(row == 0){
                    col++;
                    d = 1;
                }else{
                    row--;
                    col++;
                }
            }else if(d == 1){
                if(row == m-1){
                    col++;
                    d = 0;
                }else if(col == 0){
                    row++;
                    d = 0;
                }else{
                    row++;
                    col--;
                }
            }
        }
 }   
}
