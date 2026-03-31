// problem: https://leetcode.com/problems/remove-outermost-parentheses/
package com.corejava.strings;

import java.util.ArrayDeque;

public class RemoveOuterParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())({}[])";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        String result = "";
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                if (!stack.isEmpty()) {
                    result += c;
                }
                stack.push(c);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    result += c;
                }
            }
        }
        return result;
    }
}
