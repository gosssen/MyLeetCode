package com.gosssen.myleetcode.easy;

public class StrStr {

    /*  Implement strStr().

        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Clarification:
        What should we return when needle is an empty string? This is a great question to ask during an interview.
        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

        Example 1:
        Input: haystack = "hello", needle = "ll"
        Output: 2

        Example 2:
        Input: haystack = "aaaaa", needle = "bba"
        Output: -1

        Constraints:
        1 <= haystack.length, needle.length <= 104
        haystack and needle consist of only lowercase English characters.
    */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.length() < 1 || needle.length() > 104) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("hello", "ll"));
        System.out.println(new StrStr().strStr("aaaaa", "bba"));
    }
}
