package almostIncreasingSequence

import MakeArrayConsecutive.Consecutive

/*Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2].
Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (kt)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.*/
fun main(args: Array<String>) {
    val sequence = mutableListOf<Int>(1, 3, 2, 1)
//    val sequence = mutableListOf<Int>(1, 3, 2)
    val s = almostIncreasingSequence()
    println( s.solution(sequence))
}
class almostIncreasingSequence {
    fun solution(sequence: MutableList<Int>): Boolean {
        var remove = false
        for (i in 1 until sequence.size){
            if (sequence[i] <= sequence[i-1])
                return false
                remove = true
            if (i==1 || sequence[i]>sequence[i-2]) sequence[i-2]=sequence[i]
            else sequence[i]= sequence[i-1]
        }
        return true

    }
}