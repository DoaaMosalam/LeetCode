package MissingNumber

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
       val n = nums.size
        val expectedSum = n*(n+1)/2
        val actualSum = nums.sum()
        return expectedSum-actualSum
    }

}
fun main(){
    val missing = MissingNumber()
    val example1 = intArrayOf(3,0,1)
    val example2 = intArrayOf(0,1)
    val example3 = intArrayOf(9,6,4,2,3,5,7,0,1)
    println("Example 1 ${missing.missingNumber(example1)}")
    println("Example 2 ${missing.missingNumber(example2)}")
    println("Example 3 ${missing.missingNumber(example3)}")

}
