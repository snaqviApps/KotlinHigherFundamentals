package ghar.course.higherorders.entry.ghar.course.higherorders

fun main(args: Array<String>) {
    println("Hi from basic-higherOrder functions approach: ")
    BasicHigherOrderApproach.fibonacci(5)
}

class BasicHigherOrderApproach {

    companion object {

        fun fibonacci(limit: Int) {   // withOut HigherOrder approach
            var prePrev = 0
            var prev = 0
            var current: Int
            println(prePrev)
            for (i in 1..limit) {
                current = prePrev + prev
                when (current) {
                    0 -> current = 1
                }
                println(current)
                prePrev = prev
                prev = current
            }
        }

    }
}