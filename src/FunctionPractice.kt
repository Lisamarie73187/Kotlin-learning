/*
==============================
📘 Kotlin Lesson: Functions & Parameters
==============================

In Kotlin, functions are declared using the `fun` keyword.

🔹 Basic Syntax:

    fun greet() {
        println("Hello!")
    }

🔹 Functions with Parameters:

    fun greetUser(name: String) {
        println("Hello, $name!")
    }

- You define the parameter name followed by a colon and the type.

🔹 Functions that Return a Value:

    fun add(a: Int, b: Int): Int {
        return a + b
    }

- The return type comes after a colon.
- Use `return` to send back a value.

🔹 Single-Expression Functions:

    fun square(n: Int): Int = n * n

- Useful for simple logic; no need for curly braces or `return`.

🔹 Default Parameters:

    fun greet(name: String = "Guest") {
        println("Welcome, $name!")
    }

- Allows calling the function with or without that parameter.

🔹 Named Arguments:

    greet(name = "Lisa") // increases readability

🎯 Best Practice:
- Keep functions focused: one job per function.
- Use meaningful parameter names.
- Prefer expressions when functions are simple.

Now go practice writing and using functions below!
*/

fun functionPractice() {
    // 1. Create a function called greetUser that takes a name (String) as a parameter
    // and prints "Hello, [name]!".

    fun greetUser (name: String) {
        println("Hello $name")
    }

    greetUser("John")


    // 2. Create a function called addNumbers that takes two Ints and returns their sum.
    // Call it and print the result.


    // 3. Create a function called convertToCelsius that takes a Fahrenheit temperature (Double)
    // and returns the Celsius equivalent. (C = (F - 32) * 5/9)


    // 4. Create a function called printAgeInFiveYears that takes an age (Int)
    // and prints what the age will be in 5 years.


    // 5. Create a function called isEven that takes an Int and returns true if it’s even.


    // 6. Create a function called areaOfRectangle that takes width and height (both Doubles)
    // and returns the area. Print the result of calling this function.


    // 7. Create a function called introduceYourself that takes a name and age,
    // and prints "My name is [name] and I'm [age] years old."


    // 8. Create a function called calculateTip that takes the total bill (Double) and tip percentage (Int),
    // and returns the tip amount. Example: 100.0 and 15 returns 15.0


    // 9. Create a function called multiply that has default values for both parameters (e.g., a = 2, b = 3)
    // and returns the product. Call it with and without arguments.


    // 10. Bonus: Create a function called isTeenager that takes an age (Int)
    // and returns true if age is between 13 and 19 (inclusive).
}