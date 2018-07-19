package com.company;

public class Main {

    class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> ans = new ArrayList<>();
            if (s == null || s.length() == 0) {
                return ans;
            }
            dfs(s, ans, 0, 0, "");
            return ans;
        }

        private void dfs (String s, List<String> ans, int count, int index, String curS) {
            if (count > 4)  return;
            if (count == 4 && index == s.length()) {
                ans.add(curS);
                return;
            }

            for (int i = 1; i < 4; i++) {
                if (index + i > s.length()) continue;
                String checkS = s.substring(index, index + i);
                int value = Integer.parseInt(checkS);
                if (value > 255 || (checkS.startsWith("0") && value > 0) || checkS.length() > 1 && value == 0){
                    continue;
                }
                dfs(s, ans, count + 1, index + i, curS + checkS + (count == 3 ? "" : ".") );
            }
        }
    }

    public static void main(String[] args) {
        String s = "012345";
        System.out.println(s.substring(0,3));
    }
}
