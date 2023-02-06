package adjacentElementsProduct
/*Given an array of integers,
 find the pair of adjacent elements that has the largest product and return that product.
Example
For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.*/

fun main(args:Array<String>){
//    inputArray: [-23, 4, -3, 8, -12]
    val numbers = mutableListOf<Int>(3,6,-2,-5,7,3)
//    numbers[0]=3
//    numbers[1]=6
//    numbers[2]=-2
//    numbers[3]=-5
//    numbers[4]=7
//    numbers[5]=3
    val s = Product()
    println(s.solution(numbers))
}

class Product{
    fun solution(inputArray: MutableList<Int>): Int {
       var max =inputArray[0] * inputArray[1]
        for (i  in 0 until  inputArray.size-1){
            val product = inputArray[i] * inputArray[i+1]
            if (product > max)
                max=product
        }
        return max
    }
}