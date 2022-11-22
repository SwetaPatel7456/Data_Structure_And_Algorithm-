package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character,TrieNode> childern;
    boolean endOfString;

    public TrieNode() {
        this.childern = new HashMap<>();
        this.endOfString = false;
    }
    }

