package Hashing;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize;

    public DirectChaining(int size){
        hashTable = new LinkedList[size];
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
    public void insert(String word){
        int index= HashFunctionCreation(word,hashTable.length);
        if(hashTable[index]==null){
            hashTable[index] = new LinkedList<String>();
            hashTable[index].add(word);
        }
        else{
            hashTable[index].add(word);
        }
    }
    public  void display(){
        if(hashTable==null){
            System.out.println("HashTable does not exist");
        }
        else{
            System.out.println("HashTable");
            for(int i =0;i<hashTable.length;i++){

                System.out.println(hashTable[i]);
            }
        }
    }
    public  void search(String word){
        int index= HashFunctionCreation(word,hashTable.length);
        if(hashTable[index].contains(word)){
            System.out.println("Given word is present");
        }
        else{
            System.out.println("Given word is not present");
        }

        }
        public void delete(String word){
            int index= HashFunctionCreation(word,hashTable.length);
            if(hashTable[index].contains(word)){
                hashTable[index].remove(word);
                System.out.println("Given word is deleted successfully");
            }
            else
                System.out.println("Given word is not present so we can not delete");
        }




}
