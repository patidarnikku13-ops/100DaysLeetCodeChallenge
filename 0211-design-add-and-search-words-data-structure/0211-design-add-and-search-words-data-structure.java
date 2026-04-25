class WordDictionary {
    private TrieNode root;

    private static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for (char c: word.toCharArray()){
            int i = c-'a';
            if(node.children[i] == null) node.children[i] = new TrieNode();
            node = node.children[i];
        }
        node.isEnd = true;
        
    }
    
    public boolean search(String word) {
        
        return dfs(word, 0,root);
    }
    private boolean dfs(String word,int idx,TrieNode node){
        if(node == null) return false;
        if(idx == word.length()) return node.isEnd;

        char c = word.charAt(idx);
        if(c == '.'){
            for(TrieNode child : node.children){
                if(child != null && dfs(word, idx+1,child)) return true;
            }
            return false;
        } else{  
            return dfs(word,idx+1, node.children[c -'a']);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */