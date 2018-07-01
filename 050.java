package com.company;

public class Main {
    class Solution {
        public double myPow(double x, int n) {

            //corner case
            if(n == 0)
                return 1;

            // flip - power
            if(n < 0) {
                n = -n;
                x = 1 / x;
            }

            double ans = 1;
            while(n != 0) {
                // 10011
                if((n & 1) == 1)
                    ans = ans * x;
                x = x * x;
                n = n / 2;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
    }
}
