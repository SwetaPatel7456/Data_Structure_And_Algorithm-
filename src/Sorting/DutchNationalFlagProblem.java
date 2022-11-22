package Sorting;

import static java.util.Collections.swap;

public class DutchNationalFlagProblem {

    public void sort(int a[],int low,int high){
        int i = low;
        int j = low;
        int k = high;
        while(i<=k){
            if(a[i]==0){
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[i]==1){
                i++;
            }
            else if(a[i]==2){
                swap(a,i,k);
                k--;
            }
        }
    }
    public void  swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]= temp;
    }

    public static void main(String[] args) {
        DutchNationalFlagProblem ds = new DutchNationalFlagProblem();
        int a[] = {2,1,0,0,0,0};
       // ds.sort(a,0,5);
//        for(int i =0;i<=5;i++){
//            System.out.println(a[i]);
//        }
        //System.out.println(ds.minimumValue(a));
        ds.reverse(a);
    }
    public int minimumValue(int a[]){
        int min = a[0];
        for(int i = 1;i<a.length-1;i++){
            if(a[i]<min){
                min =a[i];
            }
        }
        return min;
    }
    public void reverse(int a[]){

        int i = 0;
        int j = a.length-1;
        while(i<=j){
            swap(a,i,j);
            i++;
            j--;
        }
        for(int k =0;k<=5;k++){
           System.out.println(a[k]);
     }
    }
    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){

                secondMax = max;
                max =arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return  secondMax;
    }

}
