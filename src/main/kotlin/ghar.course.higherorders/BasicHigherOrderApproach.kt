package ghar.course.higherorders.entry.ghar.course.higherorders

fun main(args: Array<String>) {

    /**
     * moved to 'functional-style'
     */
    val basicHigherOrderApproach = BasicHigherOrderApproach()
//    basicHigherOrderApproach.fibonacci(5, {  println(it) })                    // same as below
//    basicHigherOrderApproach.fibonacci(5, { value -> println(value) })            // same as below
    basicHigherOrderApproach.fibonacci(5) { value -> println(value) }             // same as below: moved above lambda 'outside of parenthesis'
//    basicHigherOrderApproach.fibonacci(5, ::println)                              // same as above, but using functional-reference
}

class BasicHigherOrderApproach {

        fun fibonacci(limit: Int, action: (Int) -> Unit) {
            var prePrev = 0
            var prev = 0
            var current: Int
            action(prev)               // strategy, same as below
            for (i in 1..limit) {
                current = prePrev + prev
                when (current) {
                    0 -> current = 1
                }
                action(current)         // strategy
                prePrev = prev
                prev = current
            }
        }

}