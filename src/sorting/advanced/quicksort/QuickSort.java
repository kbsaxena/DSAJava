package sorting.advanced.quicksort;

public class QuickSort {
    public void quickSort(int[] arr, int lo, int hi) {
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);
        quickSort(arr,lo,pivot-1);
        quickSort(arr,pivot+1,hi);
    }

    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i=lo, j=hi-1;
        while(i<=j){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap last(hi) with i
        int temp = arr[i];
        arr[i] = arr[hi];
        arr[hi] = temp;

        return i;
    }
}
