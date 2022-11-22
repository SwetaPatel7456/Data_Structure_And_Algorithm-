package Sorting;

public class MergeTwoSortedArrays {

    public int[] merge(int a[],int b[]){

        int l1 = a.length;
        int l2 = b.length;

        int c[] = new int[l1+l2];

        int i =0,j=0,k=0;

        while (i<l1 && j<l2){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k]= b[j];
                j++;
            }
            k++;
        }
        while(i<l1){
            c[k]= a[i];
            k++;
            i++;
        }
        while(j<l2){
            c[k]= b[j];
            k++;
            j++;
        }
        return  c;
    }

    public static void main(String[] args) {
        int a[] ={3,4,5,6};
        int b[] = {1,2,9};
        MergeTwoSortedArrays ms = new MergeTwoSortedArrays();
        int c [] = ms.merge(a,b);
        for(int i = 0;i< c.length;i++){
            System.out.println(c[i]);
        }
    }
}
