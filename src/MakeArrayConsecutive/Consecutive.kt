package MakeArrayConsecutive
/*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
 each statue having an non-negative integer size. Since he likes to make things perfect,
 he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
 He may need some additional statues to be able to accomplish that.
 Help him figure out the minimum number of additional statues needed.
Example
For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.*/
fun main(args: Array<String>) {
//    val statues = mutableListOf<Int>(6,2,3,8)
   val  statues = mutableListOf<Int>(0, 3)

    val s = Consecutive()
   println("Size status is: ${s.solution(statues)}")

}
class Consecutive {
    fun solution(statues: MutableList<Int>): Int {
        var count=0
        statues.sort()
        for (i in 0 until statues.lastIndex){
            if (statues[i+1] - statues[i]>1){
                count += statues[i+1]- statues[i]-1
            }
        }
        return count

    }
}