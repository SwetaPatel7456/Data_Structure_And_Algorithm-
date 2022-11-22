package trie;

import java.util.Set;

public class Trie {
    TrieNode root;
    public  Trie(){
        root = new TrieNode();
        System.out.println("Successfully,node has created");
    }
    public  void insert(String word){
        TrieNode current = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.childern.get(ch);
            if(node==null){
                node = new TrieNode();
                current.childern.put(ch,node);
            }
            current = node;

        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + "in Trie");
    }
    public void search(String word){
        TrieNode current = root;
        for (int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            Set<Character> set = current.childern.keySet();
            if(!set.contains(ch)){
                System.out.println("Not present");
                return;
            }
            if(set.contains(ch)){
                current = current.childern.get(ch);
            }
        }
        System.out.println("The given word is prsent");

    }

    public  boolean delete(TrieNode parentNode,String word,int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.childern.get(ch);
        boolean canThisNodeBeDeleted;
        if(currentNode.childern.size()>1){
            delete(currentNode,word,index+1);
            return  false;
        }
        if(index==word.length()-1){
            if(currentNode.childern.size()>=1){
                currentNode.endOfString= false;
                return false;
            }
            else{
               // parentNode.childern.remove();
            }

        }
        return  false;

    }






    }












