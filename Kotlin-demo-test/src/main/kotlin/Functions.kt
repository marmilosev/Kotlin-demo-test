
//fun getGreeting(): String {
//    return "Hello Kotlin"
//}

//fun getGreeting(): String = "Hello Kotlin"
//fun getGreeting() = "Hello Kotlin"

//fun sayHello(){ // : Unit
//    println(getGreeting())
//}


//fun sayHello(itemToGreet:String){
////    val msg = "Hello " + itemToGreet
//    val msg = "Hello $itemToGreet"
//    println(msg)
//}

    fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
//    println("Hello World")
//    println(getGreeting())
//    sayHello()

    sayHello(itemToGreet = "Kotlin", greeting = "Hi");
    sayHello("Hello","World")
}