package PracticeDSA;

public class PermutationWithSpace {
    public static void main(String[] args) {
        String input = "AB";
        String output = String.valueOf(input.charAt(0));
        solve(input.substring(1),output);
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1 = output+"_"+input.charAt(0);
        String op2 = output+input.charAt(0);
        String input1 = "";
        if(input.length()>=2){
            input1 = input.substring(1);
        }
        solve(input1,op1);
        solve(input1,op2);
    }
}
