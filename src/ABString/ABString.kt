package ABString

fun main(args: Array<String>) {
    val abString =ABString()
    var list=Array<String>(3){""}
    list[0]="a"
    list[1]="c"
    list[2]="a"
    println(abString.solution(list))
}

class ABString {
    fun solution(list:Array<String>):Double{
       var aCount=0.0
        var bCount=0.0
        for (i in list.indices){
            if (list.isEmpty()) return -0.1
            when(list[i]){
                "a"->aCount++
                "b" ->bCount++
                else->return -0.1
            }
        }
        if (aCount==0.0||bCount==0.0) return -0.1
        return aCount/(aCount+bCount)

                     // or
//        var aCount = 0.0
//        var bCount = 0.0
//
//        if (list.isEmpty()) return -1.0
//
//        list.forEach {
//            when (it) {
//                "a" -> aCount++
//                "b" -> bCount++
//                else -> return -1.0
//            }
//        }
//
//        if (aCount == 0.0 || bCount == 0.0) return -1.0
//
//        return aCount / (aCount + bCount)
    }
}