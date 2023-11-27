package Is_Subsequence

class IsSubsequence {
    fun subsequence(s: String, t: String): Boolean {
        var i=0
        var j =0
        while (i <s.length && j<t.length){
            if (s[i] == t[j]){
                i++
            }
            j++
        }
        return i == s.length
    }
}
    fun main() {
        val sub = IsSubsequence()
        println(sub.subsequence("abc", "ahbgdc"))
        println(sub.subsequence("axc", "ahbgdc"))
    }



////        for (i in 0..s.length){
//            if (t[i] == s[j]){
//                j++
//            }
//        }
//        return j == s.length
//    }
