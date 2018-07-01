package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<Integer>();

            for (int i = 0; i <= rowIndex; i++) {
                ans.add(0, 1);
                for (int j = 1; j < ans.size() - 1; j++) {
                    ans.set(j, ans.get(j) + ans.get(j + 1));
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
	// write your code here 
    }
}
