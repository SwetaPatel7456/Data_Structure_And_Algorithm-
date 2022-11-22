package PracticeDSA;

public class BalancedParenthesis {

    public static void main(String[] args) {
        int n = 3;
        int open = n;
        int close = n;
        String output ="";
        solve(open,close,output);
    }

    private static void solve(int open, int close,String output) {
        if(open ==0 && close==0){
            System.out.println(output);
            return;
        }
        if(open!=0){
            String op1 = output + "(";
            solve(open-1,close,op1);
        }
        if(open<close){
            String op1 = output + ")";
            solve(open,close-1,op1);
        }
    }
}
