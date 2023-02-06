package RepaitCharacter
/*Give two string,find the numbers of common characters between them.
* Example
* For s1="aabcc" and s2="adcaa", the output
* should be
* solution(s1,s2)=3
*String have 3 common characters -2 "a"s and 1"c"*/

fun main(args:Array<String>){
    val s =RepitCharacter()
    println(s.solution("aabcc","adcaa"))

}
class RepitCharacter {
    fun solution(s1: String, s2: String): Int {
        val s1Counts = IntArray(26)
        val s2Counts = IntArray(26)

        for (c in s1) {
            s1Counts[c - 'a']++
        }
        for (c in s2) {
            s2Counts[c - 'a']++
        }

        var commonCount = 0
        for (i in 0 until 26) {
            commonCount += minOf(s1Counts[i], s2Counts[i])
        }

        return commonCount
    }

}


//        var result = 0
//        var ss2 = s2
//        for (i in s1.indices) {
//            for (j in ss2.indices) {
//                if (s1[i] == ss2[j]) {
//                    result++
//                    ss2 = if (j == ss2.length - 1) {
//                        ss2.substring(0, j)
//                    } else {
//                        ss2.substring(0, j) + ss2.substring(j + 1)
//                    }
//                    break
//                }
//            }
//        }
//        return result
