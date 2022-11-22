package PracticeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumLengthOfconcatenatedString {

    static String result ="";

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        String a[] = new String[]{"un","iq","ui"};
        List<String> arrays = new ArrayList<>(Arrays.asList(a));
        solve(arrays,0,list);
        System.out.println(result);
    }

    private static void solve(List<String> a, int index, List<Character> list) {

        if(index==a.size()){
            return;
        }
        String atIndex = a.get(index);
        for (int i =0;i<atIndex.length();i++){
            if(!list.contains(atIndex.charAt(i))){
                list.add(atIndex.charAt(i));
                result = result+atIndex.charAt(i);
            }
        }
        solve(a,index+1,list);

    }


}
