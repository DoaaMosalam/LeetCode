package checkPalindrome
/*
Given the string, check if it is a palindrome.

Example
For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
//===========================================
 --- Palindrome---
A string that doesn't changed when reversed (it reads the same backward and forward).
Examples:
"eye" is a palindrome
"noon" is a palindrome
"decaf faced" is a palindrome
"taco cat" is not a palindrome (backwards it spells "tac ocat")
"racecars" is not a palindrome (backwards it spells "sracecar")
*/
fun main(args:Array<String>){
    val p =checkPalindrome()
    //println(p.solution("decaf faced"))

}
class checkPalindrome {
    fun solution(inputString: String): Boolean {
        if (inputString == inputString.reversed()){
            return true
        }
        return false
    }
    fun solution2(x: Int): Boolean {
        val xArray = x.toString()
        if (xArray == xArray.reversed()){
            return true
        }
        return false
    }

}