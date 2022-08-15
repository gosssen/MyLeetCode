package com.gosssen.myleetcode.easy;

public class IsPalindrome {

    /* Given an integer x, return true if x is palindrome integer.
       An integer is a palindrome when it reads the same backward as forward.
       For example, 121 is a palindrome while 123 is not.

       Example 1:
       Input: x = 121
       Output: true
       Explanation: 121 reads as 121 from left to right and from right to left.

       Example 2:
       Input: x = -121
       Output: false
       Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
       Therefore it is not a palindrome.

       Example 3:
       Input: x = 10
       Output: false
       Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

       Constraints:
       -231 <= x <= 231 - 1

       Follow up: Could you solve it without converting the integer to a string?
    */
    public boolean isPalindrome(int x) {
        String reverse = new StringBuilder(String.valueOf(x)).reverse().toString();
        return reverse.equals(String.valueOf(x));
    }

    // best
    public boolean isPalindrome2(int x) {
        // negative case
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int res = 0;
        // idea here is to recontruct the given input from reverse and later check whether
        // the input and the result match
        while (res < x) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        return (x == res || res / 10 == x);
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(121));
        System.out.println(new IsPalindrome().isPalindrome(-121));
        System.out.println(new IsPalindrome().isPalindrome(10));
    }
}
