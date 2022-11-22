package PracticeDSA;

import java.util.*;

public class PrintSubsetsOfString {
    static Set<String> uniqueString= new HashSet<>();

    public static void main(String[] args) {
        String input = "ab";
        String output ="";
        //solve(input,output);
        printUniqueSubset("aab","");
        Iterator<String> iterator = uniqueString.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1 = output;
        String op2 = output+input.charAt(0);
        String input1 = "";
        if(input.length()>=2)
            input1 = input.substring(1);

        solve(input1,op1);
        solve(input1,op2);
    }
    public static void  printUniqueSubset(String input, String output){
        if(input.length()==0){
            uniqueString.add(output);
            return;
        }
        String op1 = output;
        String op2 = output+input.charAt(0);
        String input1 = "";
        if(input.length()>=2)
            input1 = input.substring(1);

        printUniqueSubset(input1,op1);
        printUniqueSubset(input1,op2);
    }
}
