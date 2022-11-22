package Sorting;

public class MoveZeroToEnd {

    public void moveZeroToEnd(int a[]){
        int l = a.length-1;
        int j =0;
        for(int i =0;i<=l;i++){

            if(a[j]==0 && a[i]!=0){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroToEnd mv = new MoveZeroToEnd();
        int a[] ={2,3,0,4,5};
        mv.moveZeroToEnd(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
