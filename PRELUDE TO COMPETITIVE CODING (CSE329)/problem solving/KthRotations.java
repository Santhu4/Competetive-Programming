// public class KthRotations{
//     static int[] rotateArray(int[] arr,int k){
//         int n = arr.length;
//         int newarr[] = new int[n];
//         for(int i = 0;i<k;i++){
//             newarr[i] = arr[n-k+i];
//         }
//         for(int i = 0;i<n-k;i++){
//             newarr[k+i] = arr[i];
//         }
//         return newarr;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6};
//         int k = 3;
//         int j[] = rotateArray(arr,k);
//         for(int i = 0;i<j.length;i++){
//             System.out.print(j[i]+" ");
//         }
//     }
// }





public class KthRotations{
    public static void rev(int arr[],int k,int n){
        int s = k,e=n;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int k = 6;
        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}