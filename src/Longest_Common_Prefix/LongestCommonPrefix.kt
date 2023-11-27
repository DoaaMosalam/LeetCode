package Longest_Common_Prefix

import java.lang.StringBuilder
/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
class LongestCommonPrefix {
    //    list = ["flower","flow","flight"]
    fun longestCommonPrefix(strs: Array<String>): String {

        val firstPrefix = strs[0]
        val lastPrefix = strs[strs.size - 1]
        val stringBuilder = StringBuilder()

        if (strs.isEmpty()) {
            return ""
        }
        strs.sort()
        for (i in firstPrefix.indices) {
            if (i < lastPrefix.length && i < firstPrefix.length && firstPrefix[i] == lastPrefix[i]) {
                stringBuilder.append(firstPrefix[i])
            } else {
                break
            }
        }
        return stringBuilder.toString()

    }

}
fun main(){

    val example1 = arrayOf("flower", "flow", "flight")
    val example2 = arrayOf("dog", "racecar", "car")


    println("Example 1: ${LongestCommonPrefix().longestCommonPrefix(example1)}") // Output: "fl"
    println("Example 2: ${LongestCommonPrefix().longestCommonPrefix(example2)}") // Output: ""
}

