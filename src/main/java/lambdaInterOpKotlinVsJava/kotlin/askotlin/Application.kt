package lambdaInterOpKotlinVsJava.java

import lambdaInterOpKotlinVsJava.kotlin.asjava.Created
import lambdaInterOpKotlinVsJava.kotlin.asjava.User


fun main() {

    val user = User("Mashto")                   // does not work with NoClassDefFoundError
    var count = 0;

    // creating 'event-listener'
    val eventListener = { u:User -> println("data-object (User) $u has been created: ${++count} times") }
    user.create(eventListener)


    // SAM Constructor approach
    val eventListenerSAM: Created = Created { println("User has been created: $it")  }
    user.create(eventListenerSAM)
    user.create { println("with SAM-approach, data-object (User) $it has been created: ${++count} times") }

}