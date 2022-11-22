package PracticeDSA;

public class BubbleSortingUsingRecursion {

    public static void main(String[] args) {
        int a[]={2,3,1,8,1};
        sortArray(a,5);
        //System.out.println(a.toString());
        for(int i =0;i<5;i++){
            System.out.println(a[i]);
        }
    }

    public static void sortArray(int a[],int n){
        if(n==0){
            return;
        }
        for (int i = 0 ;i<n-1;i++){
            if(a[i]>a[i+1]){
                swap(a,i,i+1);
            }
        }
        sortArray(a,n-1);

    }
    private static void swap(int [] s, int low, int high) {
        int temp = s[low];
        s[low]=s[high];
        s[high]= temp;
    }
}
