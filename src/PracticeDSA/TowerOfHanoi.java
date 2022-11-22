package PracticeDSA;

public class TowerOfHanoi<count> {
    int s=1;
    int h = 2;
    int d = 3;
    int n = 3;

    public void toh(int s,int d,int h,int n){

        if(n==1){
            System.out.println("move disk from"+ s + "to "+ d);
            return;
        }
        toh(s,h,d,n-1);
        System.out.println("move " + n+"th disk from"+ s + "to "+ d);
        toh(h,d,s,n-1);
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.toh(toh.s,toh.d,toh.h,toh.n);
       // System.out.println(count);
    }
}
