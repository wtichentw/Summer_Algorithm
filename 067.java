class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;
        int carry = 0;
        while (index1 >= 0 && index2 >= 0) {
            int num1 = a.charAt(index1--) - '0';
            int num2 = b.charAt(index2--) - '0';
            int sum = num1 + num2 + carry;
            carry = 0;
            if (sum >= 2) {
                sum -=2;
                carry = 1;
            }
            sb.append(sum);
        }
        
        while (index1 >= 0) {
            int num = a.charAt(index1--) - '0';
            int sum = num + carry;
            carry = 0;
            if (sum >= 2) {
                sum -=2;
                carry = 1;
            }
            sb.append(sum);
        }
        
        while (index2 >= 0) {
            int num = b.charAt(index2--) - '0';
            int sum = num + carry;
            carry = 0;
            if (sum >= 2) {
                sum -=2;
                carry = 1;
            }
            sb.append(sum);
        }
        if (carry != 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
