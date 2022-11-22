package PracticeDSA;

public class NbitBinaryNumberHavingMore1sthan0sInEveryPrefix {
    public static void main(String[] args) {
        int n =5;
        int no_of_1s =0;
        int no_of_0s =0;
        String output ="";
        solve(n,no_of_1s,no_of_0s,output);
    }

    private static void solve(int n, int no_of_1s, int no_of_0s, String output) {
        if(n==0){
            System.out.println(output);
            return;
        }
        if(n!=0){
            String op1 = output+ "1";
            solve(n-1,no_of_1s+1,no_of_0s,op1);
        }
        if(no_of_1s>no_of_0s){
            String op1 = output +"0";
            solve(n-1,no_of_1s,no_of_0s+1,op1);
        }
    }
}
