package Sorting;

public class QuickSort {

    public void sort(int a[],int low,int high){
        if(low<high){
            int p = partition(a,low,high);
            sort(a,low,p-1);
            sort(a,p+1,high);
        }
    }

    public  int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int i = low-1;
        for(int j = low;j<=high-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }

        }
        swap(a,i+1,high);
        return i+1;


    }
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
