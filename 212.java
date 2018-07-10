package com.company;

public class Main {

    class Solution {
        class TrieNode {
            TrieNode[] children;
            String word;
            public TrieNode() {
                children = new TrieNode[26];
                word = null;
            }
        }

        public List<String> findWords(char[][] board, String[] words) {
            List<String> ans = new ArrayList<>();
            if (board == null || board.length == 0 || board[0].length == 0 || words == null || words.length == 0) {
                return ans;
            }

            TrieNode root = buildTrieTree(words);
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (root.children[board[i][j] - 'a'] != null) {
                        helper(board, ans, root, i, j);
                    }
                }
            }
            return ans;
        }

        private void helper(char[][] board, List<String> ans, TrieNode node, int i, int j) {
            if (node.word != null) {
                ans.add(node.word);
                node.word = null;
            }
            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                    board[i][j] == '*' || node.children[board[i][j] - 'a'] == null) {
                return;
            }
            char c = board[i][j];
            node = node.children[c - 'a'];
            board[i][j] = '*';
            helper(board, ans, node, i - 1, j);
            helper(board, ans, node, i + 1, j);
            helper(board, ans, node, i, j + 1);
            helper(board, ans, node, i, j - 1);
            board[i][j] = c;
        }

        private TrieNode buildTrieTree(String[] words) {
            TrieNode root = new TrieNode();

            for (String s : words) {
                TrieNode runner = root;
                for (Character c : s.toCharArray()) {
                    if (runner.children[c - 'a'] == null) {
                        runner.children[c - 'a'] = new TrieNode();
                    }
                    runner = runner.children[c - 'a'];
                }
                runner.word = s;
            }

            return root;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
