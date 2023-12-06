package FindNumbersDisappeared
/*
* Given an array nums of n integers where nums[i] is in the range [1, n],
* return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]*/
class FindNumbersDisappeared {
    fun solution(nums: IntArray): List<Int>{
        val seen = BooleanArray(nums.size)
        val result = mutableListOf<Int>()
        for (num in nums) {
            seen[num - 1] = true
        }
        for (i in seen.indices) {
            if (!seen[i]) {
                result.add(i + 1)
            }
        }
        return result
    }

}

fun main(){
    val example1 = intArrayOf(4,3,2,7,8,2,3,1)
    val example2 = intArrayOf(1,1)
    println("Example 1: ${FindNumbersDisappeared().solution(example1)}")
    println("Example 2: ${FindNumbersDisappeared().solution(example2)}")
}