public class spiral_matrix {
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                        {6,7,8,9},
                        {10,11,12,13},
                        {14,15,16,17}};

        int top = 0,bottom = arr.length-1,left = 0,right = arr[0].length-1;

        while(left<=right && top<=bottom){

        for(int i = left ;i<=right;i++){
            System.out.print(arr[top][i]+" ");
        }
        top++;

        for(int i = top;i<=bottom;i++){
            System.out.print(arr[i][right]+" ");
        }
        right--;

        if(top<=bottom){
        for(int i = right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
        }

        if(left<=right){
        for(int i = bottom;i>=top;i--){
            System.out.print(arr[i][left]+" ");
        }
        left++;
        }
    }
    }
}





// public class spiral_matrix {
//     public static void main(String args[]){
//         int arr[][] = {
//             {1, 2, 3, 4},
//             {6, 7, 8, 9},
//             {10, 11, 12, 13},
//             {14, 15, 16, 17}
//         };

//         int top = 0, bottom = arr.length - 1;
//         int left = 0, right = arr[0].length - 1;

//         while(left <= right && top <= bottom){

//             // Traverse from left to right
//             for(int i = left; i <= right; i++){
//                 System.out.print(arr[top][i] + " ");
//             }
//             top++;

//             // Traverse from top to bottom
//             for(int i = top; i <= bottom; i++){
//                 System.out.print(arr[i][right] + " ");
//             }
//             right--;

//             // Traverse from right to left, if still in valid row
//             if(top <= bottom){
//                 for(int i = right; i >= left; i--){
//                     System.out.print(arr[bottom][i] + " ");
//                 }
//                 bottom--;
//             }

//             // Traverse from bottom to top, if still in valid column
//             if(left <= right){
//                 for(int i = bottom; i >= top; i--){
//                     System.out.print(arr[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
//     }
// }
