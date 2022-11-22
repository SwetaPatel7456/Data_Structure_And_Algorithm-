package Hashing.OpenAddressing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public  LinearProbing(int size){
        hashTable = new String[size];
        usedCellNumber =0;
    }
    public int HashFunctionCreation(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int sum=0;
        for(int i =0;i<ch.length;i++){
            sum= sum+ch[i];
        }
        return sum%M;
    }
    public double getLoadFactor(){
        double loadfactor = usedCellNumber*1.0/hashTable.length;
        return  loadfactor;
    }
    //rehashing
    public  void rehash(String word){
        usedCellNumber =0;
        ArrayList<String> arrayList = new ArrayList<>();
        for(String s:hashTable){
            if(s!=null){
                arrayList.add(s);
            }
        }
        arrayList.add(word);
        hashTable = new String[2*hashTable.length];
        for(String s: arrayList){
            insertInHashTable(s);
        }



    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehash(word);
        } else {
            int index = HashFunctionCreation(word, hashTable.length);
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println("The " + word + " successfully inserted at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied . Trying next empty cell");
                }
            }
        }
        usedCellNumber++;
    }

    public  boolean search(String word){
        int index = HashFunctionCreation(word, hashTable.length);
        for(int i = index ;i<index+hashTable.length;i++){
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex].equals(word) && hashTable[newIndex]!=null){
                return true;
            }
        }
        return  false;
    }
    public  void deleteKeyHashTable(String word) {
        int index = HashFunctionCreation(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex].equals(word) && hashTable[newIndex] != null) {
                hashTable[newIndex] = null;
                return;
            }
            System.out.println("This word is not present in hash table");
        }
    }
    public  void display(){
        if(hashTable==null){
            System.out.println("Hashtable does not exist");
        }
        else{
            for(String s:hashTable ){
                System.out.println(s);
            }
        }
    }


}
