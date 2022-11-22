package PracticeDSA;

public class LetterCaseChange {
    public static void main(String[] args) {
        String input = "a1b2";
        String output ="";
       // solve(input,output);
        solveMethod2(input,output);

    }

    private static void solveMethod2(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        if(Character.isLetter(input.charAt(0))){
            String op1 = output + String.valueOf(input.charAt(0)).toUpperCase();
            String op2 =  output + String.valueOf(input.charAt(0));
            String input1 = "";
            if(input.length()>=2){
                input1 = input.substring(1);
            }
            solveMethod2(input1,op1);
            solveMethod2(input1,op2);
        }
        else{
            String op = output+ input.charAt(0);
            String input1 = "";
            if(input.length()>=2){
                input1 = input.substring(1);
            }
            solveMethod2(input1,op);
        }
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1 = output;
        String op2 = output;
        if(Character.isLetter(input.charAt(0))){
            op1 = op1 + String.valueOf(input.charAt(0)).toUpperCase();
            op2 = op2 + String.valueOf(input.charAt(0));
        }
        int i = 1;
        String input1 = "";
        if(input.length()==2 && Character.isDigit(input.charAt(1))){
            op1= op1+input.charAt(1);
            op2 = op2+input.charAt(1);
            input1 ="";
        }
        if(input.length()>2) {

            while (Character.isDigit(input.charAt(i))) {
                op1 = op1+input.charAt(i);
                op2 = op2+input.charAt(i);
                i++;
            }
            input1 = input.substring(i);
        }
        solve(input1,op1);
        solve(input1,op2);
        }


    }

