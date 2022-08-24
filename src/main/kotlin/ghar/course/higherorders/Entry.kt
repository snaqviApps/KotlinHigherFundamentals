package ghar.course.higherorders.entry

import ghar.course.higherorders.entry.ghar.course.higherorders.entry.ghar.course.higherorders.HigherOrders

class Entry {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val predicate: (Int) -> Boolean = { v : Int -> v > 3 }

            with(HigherOrders(listOf(1, 3, 5, 11), predicate)) {
                printings("large integers check: ", largeInt)
                printings("if input found: ", found)
            }

            val meetings = listOf(
                Meeting(1, "Lisa", "Board Meeting"),
                Meeting(2, "Munnu", "Tech Board Meeting"),
                Meeting(3, "Garcia", "Marketing Board Meeting")
            )

//                useFlatMap(meetings = meetings)

             val x = 5
            if(x > 3){
                println("$x,  x > 3")
            } else if (x == 3) {
                println("$x, x = 3")
            } else {
                println("$x, x <= 3")
            }

            }



    }

    }

class Meeting(i: Int, boardSecretary: String, s1: String) {
//    val Secretaries = Person(boardSecretary)
}
