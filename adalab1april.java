public class adalab1april {
    public static int Partition ( int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
    public static void QuickSort(int arr[],int low , int high){
        if (low<high){
            int pidx = Partition(arr, low, high);
            QuickSort(arr,low,pidx-1);
            QuickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,2,4,5,2,4,5};
        int n = arr.length;
        QuickSort(arr , 0 , n-1);
        //printing array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
