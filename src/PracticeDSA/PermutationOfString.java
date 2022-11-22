package PracticeDSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PermutationOfString {

    public static void main(String[] args) {
        char c[] ={'1','2','3'};
        List<String> list = new ArrayList<>();
         solve(c,0,list);
    }
    public static void  solve(char a[], int index, List<String> list){
        if(index>=a.length){
            System.out.println(a);
            return;
        }

       // char b[] =a;
        String s ="";
        for (int i = index;i<a.length;i++){
            swap(a,index,i);
            solve(a,index+1,list);
            swap(a,index,i);
        }

    }
    private static void swap(char [] s, int low, int high) {
        char temp = s[low];
        s[low]=s[high];
        s[high]= temp;
    }
}
