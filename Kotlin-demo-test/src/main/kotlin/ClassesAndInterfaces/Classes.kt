package ClassesAndInterfaces

fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach(){itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name") //default values


fun main() {

    val person = Person()
//    person.firstName
//    person.lastName
//    person.nickName = "Spiderman"
//    person.nickName = "New Nickname"
//    println(person.nickName)
    person.printInfo()
}
