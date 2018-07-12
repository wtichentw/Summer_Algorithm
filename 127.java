package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            if (beginWord == null || endWord == null || wordList == null) {
                return 0;
            }
            if (!wordList.contains(endWord)) {
                return 0;
            }

            int path = 1;
            Set<String> wordSet = new HashSet<>(wordList);
            Queue<String> q = new LinkedList<String>();
            Set<String> set = new HashSet<String>();
            set.add(beginWord);
            q.offer(beginWord);
            while (!q.isEmpty()) {
                path++;
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    String s = q.poll();
                    for (String word : nextWords(s, wordSet)) {
                        if (set.contains(word)) {
                            continue;
                        }
                        if (word.equals(endWord)) {
                            return path;
                        }
                        q.offer(word);
                        set.add(word);
                    }
                }
            }
            return 0;
        }

        private List<String> nextWords(String s, Set<String> wordSet) {
            List<String> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                for (char c = 'a'; c < 'z'; c++) {
                    if (c == s.charAt(i)) {
                        continue;
                    }
                    char[] ss = s.toCharArray();
                    ss[i] = c;
                    String temp = new String(ss);
                    if (wordSet.contains(temp)) {
                        list.add(temp);
                    }
                }
            }
            return list;
        }
    }

    public static void main(String[] args) {

    }
}
