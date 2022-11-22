package PracticeDSA;

public class CalculatePowerUsingRecusion {

    public static double powerCal(int a, int b){
        if(b==0){
            return 1.00;
        }
        if (b==1){
            return a;
        }
        if(b%2==0){
            return powerCal(a,b/2)*powerCal(a,b/2);
        }
        if(b%2!=0){
            return a*powerCal(a,b/2)*powerCal(a,b/2);
        }
        return 1;
    }

    public static void main(String[] args) {
        double c = powerCal(2,102);
        System.out.println(c);
    }
}
