class Solution {
    int count = 0;
    public int countArrangement(int N) {
        helper(N, new boolean[N + 1], 1);
        return count;
    }
    
    private void helper(int N, boolean[] used, int pos) {
        if (pos > N) {
            count++;
            return;
        }
        
        for (int i = 1; i <= N; i++) {
            if (!used[i] && ((i % pos == 0) || (pos % i) == 0)) {
                used[i] = true;
                helper(N, used, pos + 1);
                used[i] = false;
            }
        }
    }
}
