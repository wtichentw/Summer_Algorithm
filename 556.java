class Solution {
    public int nextGreaterElement(int n) {
        int i, j;
        
        char[] array = (n + "").toCharArray();
        for (i = array.length - 2; i >= 0; i--) {
            if (array[i + 1] > array[i]) {
                break;
            }
        }
        
        //right to left is ascending order
        if (i == -1) {
            return -1;
        }
        
        for (j = array.length - 1; j >= i; j--) {
            if (array[j] > array[i]) {
                break;
            }
        }
        swap(array, i, j);
        Arrays.sort(array, i + 1, array.length);
        
        //Corener case
        long val = Long.parseLong(new String(array));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
    
    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
