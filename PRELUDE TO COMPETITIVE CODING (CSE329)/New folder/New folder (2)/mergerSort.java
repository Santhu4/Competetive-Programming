public class mergerSort {
    public static void sort(int arr[],int low,int high,int mid){
        int i = low,j = mid+1;
         int a[] = new int[high - low + 1];
         int k = 0;
        while(i<=mid && j<= high){
           if(arr[i]<=arr[j]){
            a[k++] = arr[i++];
           }else{
            a[k++] = arr[j++];
           }
        }
        while(i<=mid){
            a[k++] = arr[i++];
        }
        while(j<=high){
            a[k++] = arr[j++];
        }
        System.arraycopy(a,0,arr,low,a.length);
    }
public static void ms(int arr[],int low,int high){
    if(low<high){
        int mid = (low+high)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        sort(arr,low,high,mid);
    }
}
    public static void main(String args[]){
        int arr[] = {2,2,1,8,9,0,-1};
        ms(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
