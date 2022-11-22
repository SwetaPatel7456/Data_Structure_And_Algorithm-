package Sorting;

public class BubbleSorting {

    public void bubble(int a[]){
        int l = a.length;
        int temp =0;
        for(int i =0;i<l-1;i++){
            for(int j =0;j<l-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
}
