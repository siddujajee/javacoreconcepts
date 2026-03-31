// problem: https://leetcode.com/problems/remove-outermost-parentheses/
// this is optimal solution with time complexity O(n) and space complexity O(1) because we haven't used any extra space (stack in previous case)
// used string builder to store the result because string concatenation is costly in java as it creates new string object every time we concatenate
package com.corejava.strings;

public class RemoveOuterParanthesisOptimalSolution {
    public static void main(String[] args) {
        String s = "(()())(())({}[])";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
