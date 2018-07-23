package com.company;

public class Main {
    class Solution {
        public List<List<String>> groupStrings(String[] strings) {
            Map<String, List<String>> map = new HashMap<>();
            List<List<String>> ans = new ArrayList<>();

            for (String s : strings) {
                StringBuilder sb = new StringBuilder();
                int diff = s.charAt(0) - 'a';
                for (Character c : s.toCharArray()) {
                    c = (char)(c - diff);
                    if (c < 'a') {
                        c = (char)(c + 26);
                    }
                    sb.append(c);
                }

                if (!map.containsKey(sb.toString())) {
                    map.put(sb.toString(), new ArrayList<String>());
                }
                map.get(sb.toString()).add(s);
            }

            for (String key : map.keySet()) {
                List<String> list = map.get(key);
                Collections.sort(list);
                ans.add(list);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
    }
}
