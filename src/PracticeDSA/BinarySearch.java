package PracticeDSA;

public class BinarySearch {
    public static void main(String[] args) {
     int a[] = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(a,0,6,0));
    }
    public static boolean binarySearch(int a[],int low,int high,int item){
        if(high<low){
            System.out.println("Element is not present in array");
            return false;
        }
        int mid = (low+high)/2;
        if(a[mid]== item){
            System.out.println("element is present");
            return true;
        }
        if(a[mid]>item){
            high= mid-1;

        }
        if(a[mid]<item){
            low = mid+1;
        }
        boolean remainingPart= binarySearch(a,low,high,item);
        return  remainingPart;
    }
}
