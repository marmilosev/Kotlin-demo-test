package Basic
fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach(){itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name") //default values


fun main() {
//    val interestingThings = arrayOf("Kotlin", "Java", "PHP")
////    sayHello("hi", listOf()) //without vargarg
//    sayHello("Hi", *interestingThings)

//    greetPerson(name = "John")
    greetPerson()

    val interestingThings = arrayOf("Kotlin", "Java", "PHP")
    sayHello(itemsToGreet = *interestingThings, greeting = "Hi")

}

