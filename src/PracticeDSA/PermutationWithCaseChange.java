package PracticeDSA;

import java.util.Locale;

public class PermutationWithCaseChange {
    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        solve(input,output);
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1 = output+String.valueOf(input.charAt(0)).toUpperCase();
        String op2 = output+String.valueOf(input.charAt(0));
        String input1 = "";
        if(input.length()>=2){
            input1 = input.substring(1);
        }
        solve(input1,op1);
        solve(input1,op2);

    }
}
