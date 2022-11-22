package PracticeDSA;

public class CountZerosInANumber {
    public static void main(String[] args) {
       countZeros(4050,0);
    }

    public static int countZeros(int n,int count){
        if(n==0){
            System.out.println("The numbr of zeros are " + count);
            return 0;
        }
        int r = n%10;
        if(r!=0)
            return countZeros(n/10,count);
        else
            return countZeros(n/10,count+1);
    }
}
