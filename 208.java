class Trie {

    class TrieNode {
        TrieNode[] children;
        boolean hasWord;
        public TrieNode() {
            this.hasWord = false;
            this.children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] array = word.toCharArray();
        TrieNode runner = root;
        for (Character c : array) {
            if (runner.children[c - 'a'] == null) {
                runner.children[c - 'a'] = new TrieNode();
            }
            runner = runner.children[c - 'a'];
        }
        runner.hasWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] array = word.toCharArray();
        TrieNode runner = root;
        for (Character c : array) {
            if (runner.children[c - 'a'] == null) {
                return false;
            }
            runner = runner.children[c - 'a'];
        }
        return runner.hasWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] array = prefix.toCharArray();
        TrieNode runner = root;
        for (Character c : array) {
            if (runner.children[c - 'a'] == null) {
                return false;
            }
            runner = runner.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
