package PracticeDSA;

public class ReverseStringUsingRecursion {

    public static void reverseString(char[] s, int low ,int high){
        if(high<=low){
            return;
        }
        swap(s,low,high);
        reverseString(s,low+1,high-1);

    }

    private static void swap(char[] s, int low, int high) {
        char temp = s[low];
        s[low]=s[high];
        s[high]= temp;
    }

    public static void main(String[] args) {
        String s = "sweta";
        int l = s.length()-1;
        char c[]= s.toCharArray();
        String h ="";
        reverseString(c,0,l);
       for(int i =0;i<c.length;i++) {
            h = h+ c[i];
        }
        System.out.println(h);
    }
}
