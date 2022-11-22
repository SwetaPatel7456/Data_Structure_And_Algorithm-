package PracticeDSA;

public class SelectionSortusingRecursion {

    public static void main(String[] args) {
        int a[]={2,3,1,8,1};
        sortArraySelection(a,5);
        //System.out.println(a.toString());
        for(int i =0;i<5;i++){
            System.out.println(a[i]);
        }
    }

    public static void sortArraySelection(int a[],int n){
        if(n==0){
            return;
        }
        int max=a[0];
        int index =0;
        int i = 1;
        for( i = 1;i<n;i++){
            if(a[i]>max){
                max= a[i];
                index =i;
            }
        }
        swap(a,index,n-1);
        sortArraySelection(a,n-1);
    }
    private static void swap(int [] s, int low, int high) {
        int temp = s[low];
        s[low]=s[high];
        s[high]= temp;
    }
}
