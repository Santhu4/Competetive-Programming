public class upper_lower_triangular_matrix {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(j>=i){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}