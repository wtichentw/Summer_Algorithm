package com.company;

public class Main {

    class Solution {
        public String multiply(String num1, String num2) {
            int[] pos = new int[num1.length() + num2.length()];
            for (int i = num1.length() - 1; i >= 0; i--) {
                for (int j = num2.length() - 1; j >=0; j--) {
                    int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int sum = mul + pos[i + j + 1];
                    pos[i + j] += sum /10;
                    pos[i + j + 1] = sum % 10;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pos.length; i++) {
                if (sb.length() == 0 && pos[i] == 0) {
                    continue;
                }
                sb.append(pos[i]);
            }
            return (sb.length() == 0) ? "0" : sb.toString();
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
