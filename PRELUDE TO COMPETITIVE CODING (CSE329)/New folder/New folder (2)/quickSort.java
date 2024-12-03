public class quickSort {
    public static void swap(int arr[],int l ,int h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    public static int par(int arr[],int low,int high){
        int i = low,j = high,pivot = arr[low];
        while (i<j) {
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j)
            swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;

    }
    public static void qs(int arr[],int low,int high) {
        if(low<high){
            int par_ind = par(arr,low,high);

            qs(arr,low,par_ind-1);
            qs(arr,par_ind+1,high);

        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,8,2};
        qs(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
