package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    int arr[];
    public  BucketSort(int arr[]){
        this.arr = arr;
    }

    public void bucketSort(){
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;

        for(int a: arr){
            if(a>maxValue){
                maxValue = a;
            }

        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i =0;i<buckets.length;i++){
            buckets[i]= new ArrayList<Integer>();
        }
        for(int a :arr){
            int bucketNumber = (int)Math.ceil((float)a*numberOfBuckets/(float)maxValue);
            buckets[bucketNumber-1].add(a);
        }
        System.out.println("Printing buckets before sorting");
       for(ArrayList<Integer> bucket:buckets){
           Collections.sort(bucket);
       }
       int index =0;
       for(ArrayList<Integer> bucket:buckets){
           for(int value:bucket){
               arr[index++]= value;
           }
       }
       for(int r = 0;r<arr.length;r++){
       System.out.println(arr[r]);}

    }

    public static void main(String[] args) {
        int a[] ={3,4,1,2,6,9};
        BucketSort b = new BucketSort(a);
        b.bucketSort();
    }

}
