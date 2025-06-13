/*
=======================
📘 Kotlin Lesson: Variables
=======================

In Kotlin, you can declare variables using two keywords: `val` and `var`.

🔹 val (value)
- Immutable: once assigned, the value cannot be changed.
- Think of it like a "final" or "constant" variable.
- Use it by default for safety and predictability.

    Example:
    val name = "Lisa"
    val pi = 3.14

🔹 var (variable)
- Mutable: you can change the value later.
- Use it when the value is expected to change over time.

    Example:
    var age = 37
    age = 38

📌 Kotlin is statically typed — every variable has a type like `Int`, `String`, `Double`, `Boolean`, etc.
Types can be inferred or declared explicitly:

    val city: String = "Bend"
    val year = 2025 // Kotlin infers Int

🎯 Best Practice:
Use `val` by default, and only use `var` when you actually need to reassign the variable later.

Now go try out the challenges below!
*/


fun variablePractice() {
    // 1. Create a val for your first name and a val for your last name.
    // Then, combine them into a full name string using string templates and print it.

    val firstName = "Lisa"
    val lastName = "Herzberg"

    val fullName = "$firstName $lastName"

    println(fullName)


    // 2. Create a var for your current age. Print it, then increase it by 1 and print again.

    var age = 37

    age = age + 1

    println(age)


    // 3. Create a val that holds the number of days in a week. Try to change it and see what happens.


    // 4. Create a var for your mood. Change it twice and print each time.

    var mood = "happy"

    println(mood)

    mood = "hungry"

    println(mood)

    mood = "tired"

    println(mood)
    // 5. Create val variables for pi (use 3.14159) and the radius of a circle.
    // Calculate and print the area of the circle.


    // 6. Create a var for temperature in Fahrenheit.
    // Convert it to Celsius and print the result.


    // 7. Create a val for whether it is sunny today (true or false).
    // Use string templates to print a sentence like "Is it sunny today? true"


    // 8. Create two variables: one for the number of apples and one for the number of oranges.
    // Calculate and print the total number of fruits.


    // 9. Create a val for your favorite quote. Use \n and \t to format it nicely when printed.


    // 10. Bonus: Create a var that stores your bank account balance.
    // Subtract a purchase amount and print the new balance.
}