package matrixElementsSum
fun main(args:Array<String>){
    val matrix = mutableListOf(
        mutableListOf(1, 1, 1, 0),
        mutableListOf(0, 5, 0, 1),
        mutableListOf(2, 1, 3, 10)
    )
    val s = matrixElementsSum()
    println("Sum valid room is ${s.solution(matrix)}")

}
class matrixElementsSum {
    fun solution(matrix: MutableList<MutableList<Int>>): Int {
        var sum=0
        var inhabitedRoom=false

       for (i in 0 until matrix.size){
           for (j in 0 until matrix[i].size) {
               if (matrix[i][j] == 0) {
                   break
               }
               if (!inhabitedRoom) {
                   sum += matrix[i][j]
               }
           }
       }
        return sum
    }

}