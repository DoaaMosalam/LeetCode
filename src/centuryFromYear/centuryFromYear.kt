package centuryFromYear

fun main(args: Array<String>) {
    val c =centuryFromYear()
    println("century: ${c.solution(1905)}")

}
class centuryFromYear {
   fun solution(year:Int):Int{
       var century:Int=year/100
       if (year%100==0){
           return century
       }else{
           return century+1
       }

    }
}