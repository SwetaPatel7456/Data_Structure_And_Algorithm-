package Sorting;

public class SortArrayUsingRecursion {

    public void sort(int a[],int n){

        if(n>0){
            for(int i =0;i<n;i++){
                if(a[i]>a[n-1]){
                    swap(a,i,n-1);
                }
            }
            sort(a,n-1);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        SortArrayUsingRecursion sortArrayUsingRecursion = new SortArrayUsingRecursion();
        int a[] = {2,1,3,7,5,6};
        //sortArrayUsingRecursion.sort(a,6);
       // sortArrayUsingRecursion.insertionsort(a,6);
        sortArrayUsingRecursion.RecursionSortWay(a,5);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void insertionsort(int a[],int n){
        //Base case
        if(n<=1){
            return;
        }
        //recursive case
        insertionsort(a,n-1);

        int last = a[n-1];
        int j = n-2;
        while(j>=0 && a[j]>last){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=last;
    }

    public  void RecursionSortWay(int a[],int n){
        if(n==0){
            return;
        }
        RecursionSortWay(a,n-1);
        insert(a,a[n],n);
    }
    public void insert(int a[],int last,int lastIndex){
        for(int i = 0;i<lastIndex;i++){
            if(last<a[0]){
                for(int j = 0;j<lastIndex;j++){
                    a[j+1] =a[j];
                }
                a[0] = last;
                break;
            }
            else if(last >a[i] && last <a[i+1]){
                int index = i+1;
                for(int j = index;j<lastIndex;j++){
                    a[j+1]=a[j];
                }
                a[index] =last;
            }
        }
    }

}
