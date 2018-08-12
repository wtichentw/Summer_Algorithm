class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] array = s.toCharArray();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            extendPalindrome(array, i, i);
            extendPalindrome(array, i, i + 1);
        }
        return count;
    }
    
    private void extendPalindrome(char[] array, int left, int right) {
        if (left >= 0 && right < array.length && array[left] == array[right]) {
            count++;
            extendPalindrome(array, left - 1, right + 1);
        }
    }
}
