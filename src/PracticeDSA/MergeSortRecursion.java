package PracticeDSA;

public class MergeSortRecursion {

    public static void main(String[] args) {
        int a[]={2,3,1,8,1};
        MergeSort(a,0,4);
        //System.out.println(a.toString());
        for(int i =0;i<5;i++){
            System.out.println(a[i]);
        }
    }

    public static void MergeSort(int a[], int low, int high) {
        if (low < high) {
            int mid = low +(high-low) / 2;
            MergeSort(a, low, mid);
            MergeSort(a, mid + 1, high);
            Merge(a, low, mid, high);

        }
        else
            return;

    }
    public static void Merge(int a[],int low,int mid,int high){

        int l1 = mid-low+1;
        int l2 = high-mid;

        int b[] = new int[l1];
        int c[] = new int[l2];
        int r = low;
        for(int i =0;i<l1;++i){
            b[i]= a[r++];
        }
        int u =  mid+1;
        for(int i =0;i<l2;++i){
            c[i]= a[u++];
        }
        int k =low;
        int l =mid+1;
        int g =low;
        while (k<=mid && l<=high){
            if(b[k] <= c[l]){
                a[g]= b[k];
                k++;
                g++;
            }
            else {
                a[g]=c[l];
                g++;
                l++;

            }
        }
        while (k<=mid){
                a[g++]=b[k++];

        }
        while (l<=high){

                a[g++]=c[l++];

        }

    }
}
