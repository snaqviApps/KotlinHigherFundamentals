package ghar.course.higherorders.entry.ghar.course.higherorders.entry.ghar.course.higherorders

class HigherOrders(listIn: List<Int>, predicate: (Int) -> Boolean) {

    private val ints = listIn
    val largeInt= ints.all(predicate)

//    val found : Int? = ints.find { it > 3 }
    val found : Int? = ints.find(predicate)


    fun <T> printings(resultInfo : String, input : T){
        println("$resultInfo : $input")
    }
}


