package Contains_Duplicate

fun main() {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (num in nums) {
            if (seen.contains(num)) {
                return true
            }
            seen.add(num)
        }
        return false
    }
}


    

