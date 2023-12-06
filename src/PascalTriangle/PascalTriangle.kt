package PascalTriangle
/*
118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]*/
class PascalTriangle {
    fun solution(numRows: Int): List<List<Int>> {
      val triangle = mutableListOf<List<Int>>()
    for (i in 0 until numRows) {
        val row = MutableList(i + 1) { 1 }
        for (j in 1 until i) {
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
        }
        triangle.add(row)
    }
    return triangle

    }

}
fun main(){
    val solution = PascalTriangle()

    val example1 = 5
    val example2 = 1

    println("Example 1: ${solution.solution(example1)}")
    println("Example 2: ${solution.solution(example2)}")

}