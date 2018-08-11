class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int n = s.length();
        for (int curLength = 1; curLength < n; curLength++) {
            if (n % curLength == 0) {
                int num = (n / curLength);
                String temp = s.substring(0, curLength);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < num; i++) {
                    sb.append(temp);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
