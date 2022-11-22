package PracticeDSA;

public class LinearSearch {
    public  static  boolean linearsearch(int arr[],int n,int item){

        if(n==-1){
            return  false;
        }
        if(arr[n]==item && n>=0){
            System.out.println("found");
            return true;
        }
        else{
            boolean remainingPart = linearsearch(arr,n-1,item);
            return remainingPart;
        }

    }
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7};
        System.out.println(linearsearch(a,5,9));
    }
}
