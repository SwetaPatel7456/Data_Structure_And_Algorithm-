package Sorting;

public class InsertionSorting {

    public static void insertion(int a[]){
        int l = a.length;
        for(int i =1;i<l;i++){
            int key = a[i];
            int j =i-1;
            while( j>=0 && key<a[j] ){
                    a[j+1]=a[j];
                    j--;
                }
            a[j+1]= key;

            }

        }

    public static void main(String[] args) {
        int a[] ={2,4,1,6,5};
        insertion(a);
        for(int i =0;i<a.length;i++){
            System.out.println((a[i]));
        }
    }

}
