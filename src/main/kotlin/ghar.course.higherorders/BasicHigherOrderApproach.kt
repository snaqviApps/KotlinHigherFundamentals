package ghar.course.higherorders.entry.ghar.course.higherorders

fun main(args: Array<String>) {

    /**
     * anonymous object (similar to java anonymous) approach
     * @process
     */
    BasicHigherOrderApproach.fibonacci(5, object : BasicHigherOrderApproach.Companion.Process {
        override fun execute(value: Int) {
            println(value)
        }
    })
}

class BasicHigherOrderApproach {

    companion object {

        interface Process {
            fun execute(value: Int)
        }

        fun fibonacci(limit: Int, action: Process) {
            var prePrev = 0
            var prev = 0
            var current: Int
            action.execute(prev)               // strategy, same
            for (i in 1..limit) {
                current = prePrev + prev
                when (current) {
                    0 -> current = 1
                }
                action.execute(current)         // strategy
                prePrev = prev
                prev = current
            }
        }

    }
}