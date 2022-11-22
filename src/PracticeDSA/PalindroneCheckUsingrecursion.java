package PracticeDSA;

public class PalindroneCheckUsingrecursion {
    public static boolean palindrone(char[] s, int low ,int high){
        boolean result = false;
        if(s[low]!=s[high]){
            return false;
        }
        else if (high==low || high<low){
            System.out.println("It is apalindrone");
            return true;
        }

        if(s[low]==s[high]) {
            result= palindrone(s, low + 1, high - 1);

        }
        return result;

    }


    public static void main(String[] args) {
        String s = "ab";
        int l = s.length() - 1;
        char c[] = s.toCharArray();
        String h = "";
        boolean g = palindrone(c,0,l);
        System.out.println("Given String is palindrone" + g);
    }
}
