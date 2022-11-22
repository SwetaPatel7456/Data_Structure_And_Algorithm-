package Hashing.OpenAddressing;

public class main {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(9);
        linearProbing.insertInHashTable("AB");
        linearProbing.insertInHashTable("CD");
        linearProbing.insertInHashTable("EF");
        linearProbing.insertInHashTable("GH");
        linearProbing.insertInHashTable("IJ");
        linearProbing.insertInHashTable("CD");
        linearProbing.insertInHashTable("EFKK");
        linearProbing.insertInHashTable("CYD");
        linearProbing.insertInHashTable("EYF");
        linearProbing.insertInHashTable("GYH");
        linearProbing.insertInHashTable("IYJ");
        linearProbing.deleteKeyHashTable("IYJ");
        linearProbing.deleteKeyHashTable("CYD");

        linearProbing.display();
    }
}
