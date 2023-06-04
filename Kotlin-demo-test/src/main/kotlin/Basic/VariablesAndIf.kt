package Basic
val name = "Chris"
//var greeting: String? = null
var greeting: String? = "hello"
fun main() {
//    if(greeting != null){
//        greeting= "hi"
//        println(greeting)
//    }else{
//        println("ciao")
//    }
//    println(name)
//
//
//    greeting = null
//    println(greeting)

//    val greetingToPrint = if(greeting != null) greeting else "Hi"
//    println(greetingToPrint)
    val greetingToPrint = when(greeting){
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
}