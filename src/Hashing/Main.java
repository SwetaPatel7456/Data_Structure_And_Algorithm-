package Hashing;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(7);
        directChaining.insert("ABCD");
        directChaining.insert("CDEF");
        directChaining.insert("ABCD");
        directChaining.insert("sasa");
        directChaining.insert("ewqa");

        directChaining.display();
        System.out.println("hashtable after deletion");
        directChaining.delete("CDEF");
        directChaining.display();
    }
}
