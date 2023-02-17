package ValidAnagram
/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false*/
fun main(args: Array<String>) {
    val s = Solution()
    println(s.isAnagram("anagram","nagaram"))
}
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = HashMap<Char, Int>()

        val sArray = s.toCharArray()
        val tArray = t.toCharArray()

        for (c in sArray) map[c] = map.getOrDefault(c, 0) + 1

        for (c in tArray) {
            var current = map.getOrDefault(c, 0)
            if (current < 1) return false
            map[c] = --current
        }

        return true

    }
}