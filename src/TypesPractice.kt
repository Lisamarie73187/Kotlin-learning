/*
=============================
🧪 Kotlin Types – Practice File
=============================

Uncomment each block one at a time and run it to explore how Kotlin handles each type.
*/

fun typesPractice() {
    // ----- Numbers -----

     val age: Int = 30
     val pi: Double = 3.14159
     val price: Float = 19.99f
     val bigNumber: Long = 9_000_000_000L
     val byteValue: Byte = 127
     val shortValue: Short = 32000

     println("Age: $age, Pi: $pi, Price: $price")

    // ----- Boolean -----

     val isSunny: Boolean = true
     println("Is it sunny? $isSunny")

    // ----- Char -----

     val grade: Char = 'A'
     println("Grade: $grade")

    // ----- String -----

    // val firstName: String = "Lisa"
    // val lastName: String = "Herzberg"
    // val fullName = "$firstName $lastName"
    // println("Full name: $fullName")

    // ----- Array -----

    // val numbers = arrayOf(1, 2, 3, 4, 5)
    // println("First number: ${numbers[0]}")

    // ----- List -----

    // val fruits = listOf("Apple", "Banana", "Cherry")
    // println("Favorite fruit: ${fruits[1]}")

    // val mutableFruits = mutableListOf("Orange", "Kiwi")
    // mutableFruits.add("Grape")
    // println("All fruits: $mutableFruits")

    // ----- Nullable Types -----

    // val nickname: String? = null
    // println("Nickname length: ${nickname?.length ?: 0}")

    // ----- Unit (like void) -----

    // fun sayHello(): Unit {
    //     println("Hello!")
    // }
    // sayHello()

    // ----- Nothing -----

    // fun crash(): Nothing {
    //     throw Exception("Something went wrong!")
    // }
    // crash() // Uncommenting this will crash the program
}
