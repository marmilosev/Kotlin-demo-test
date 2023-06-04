fun saySth(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach(){itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    //NIZOVI
//    val interestingThings = arrayOf("Kotlin", "Java", "JavaScript")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(1))


//    for(interestingThing in interestingThings){
//        println(interestingThing)
//    }

//    interestingThings.forEach {
//        println(it)
//    }

//    interestingThings.forEach {interestingThing ->
//        println(interestingThing)
//    }
//
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

    //LISTA
//    val interestingThings = listOf("Kotlin", "Java", "JavaScript")
//    interestingThings.forEach(){interestingThing ->
//        println(interestingThing)
//    }

    val interestingThings = mutableListOf<String>("Kotlin", "Java", "JavaScript")
    interestingThings.add("Go")

    //MAP
//    val map = mapOf<Int,String>(1 to "Kotlin", 2 to "Java", 3 to "JavaScript")
//    map.forEach(){
//                 key, value-> println("$key -> $value")
//    }
//    val map = mutableMapOf<Int,String>(1 to "Kotlin", 2 to "Java", 3 to "JavaScript")
//    map.forEach(){
//            key, value-> println("$key -> $value")
//    }
//    map.put(4, "Go")

    saySth("Hi", interestingThings)
}