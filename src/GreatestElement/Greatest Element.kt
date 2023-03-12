package GreatestElement

import kotlin.math.max

/*Given an array arr, replace every element in that array with the greatest element among the elements to its right,
and replace the last element with -1.
After doing so, return the array.
Example 1:
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
*/
fun main() {
     val arr = IntArray(6)
    arr[0]=17
    arr[1]=18
    arr[2]=5
    arr[3]=4
    arr[4]=6
    arr[5]=1
    val solution = Solution()
    println(solution.replaceElements(arr).toList())
}

class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxOfRight = -1
        for (i in arr.indices.reversed()){
            val temp = arr[i]
            arr[i] = maxOfRight
            maxOfRight = Math.max(maxOfRight,temp)
        }
        return arr

    }
}