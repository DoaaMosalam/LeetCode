package Add_Numbers

fun main(args: Array<String>) {
    val a = AddNumbers()
    println("Addition numbers = ${a.add(3,4)}")
}
class AddNumbers {
    fun add(x: Int, y: Int): Int {
        return x + y
    }
}