package com.gosssen.myleetcode.easy;

import java.util.LinkedList;

public class ValidParentheses {

    /*  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
        determine if the input string is valid.

        An input string is valid if:
        1. Open brackets must be closed by the same type of brackets.
        2. Open brackets must be closed in the correct order.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false
    */
    public boolean isValid(String s) {
        char[] s1 = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s1) {
            // s1[i]如果是右括號，則從檢查stack是否有元素存在
            if ((c == ')') || (c == ']') || (c == '}')) {
                if (stack.peek() == null)
                    return false;
            }
            // s1[i]如果是右括號，則從stack取出最後一個元素並刪除比對
            if (c == ')') {
                char ch = stack.pollLast();
                if (ch != '(')
                    return false;
            } else if (c == ']') {
                char ch = stack.pollLast();
                if (ch != '[')
                    return false;
            } else if (c == '}') {
                char ch = stack.pollLast();
                if (ch != '{')
                    return false;
            } else {
                // s1[i]不是右括號，表示s1[i]為左括號其一，將其新增至stack中
                stack.add(c);
            }
        }
        // stack為空的話，表示左右括號都有比對成功
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("[]"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]"));
    }
}
