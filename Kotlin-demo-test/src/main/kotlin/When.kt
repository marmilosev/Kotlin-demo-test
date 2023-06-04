val firstname = "Anna"
var greet: String? = null

fun main() {
    greet = "Hello"
    when(greet){
        null -> println("Hi")
        else -> println(greet)
    }
    println(firstname)
}