package Sorting;

public class Selection {

    public  static void selectionSorting(int a[]) {
        int l = a.length;
        int min = 0;
        int minimumIndex=0;
        for (int i = 0; i < l-1; i++) {
            min = a[i];
            minimumIndex = i;
            for(int j =i;j<l;j++){
                if(a[j]<min){
                    min = a[j];
                    minimumIndex =j;
                }
            }
            int temp = a[minimumIndex];
            a[minimumIndex]=a[i];
            a[i]= temp;
        }
    }

    public static void main(String[] args) {
        int a[] ={2,1,4,3,5,6};
        selectionSorting(a);
        display(a);
    }

    private static void display(int[] a) {
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
