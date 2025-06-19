/*
===============================================
📘 Kotlin Lesson: Basic Control Flow
===============================================

Kotlin provides standard control flow tools for decision-making and looping.

🔹 if / else
- Works like other languages, but can also return values.

    val age = 18
    val canVote = if (age >= 18) "Yes" else "No"

🔹 when
- Replaces `switch` from other languages. More powerful and readable.

    val day = 2
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        else -> "Unknown"
    }

🔹 for
- Used to iterate over ranges, collections, and arrays.

    for (i in 1..5) {
        println(i)
    }

🔹 while / do-while
- `while` checks before entering loop
- `do-while` always runs once

    var i = 0
    while (i < 3) {
        println(i)
        i++
    }

🎯 Best Practice:
- Prefer `when` over nested `if-else` chains for clarity.
- Use range expressions (e.g., `1..10`, `0 until 5`) in `for` loops.

Time to practice!
*/

fun controlFlowPractice() {


////    =============  If Challenges ================
//
//    // 1. Create a val for age. Use `if` to print whether someone can vote (18+).
//
//    var age = 1
//
//    age = 45
//
//    if (age >= 18) println("Yes they can vote") else println("No can't vote")
//
//
//    // 2. Check if a number is positive, negative, or zero.
//
//    val numberToCheck = -5
//
//    if (numberToCheck > 0) println("Yes number is positive")
//    if (numberToCheck < 0) println("Yes number is negative")
//    else if (numberToCheck === 0) println("Yes number 0")
//
//    // 3. Create a variable for temperature and print:
//    // - "Cold" if less than 50
//    // - "Warm" if between 50–80
//    // - "Hot" if greater than 80
//
//    val temperature = 88
//
//    var weatherMan = ""
//
//    if(temperature < 50) weatherMan = "Cold"
//    if(temperature in 50..80) weatherMan = "Warm"
//    if(temperature > 80)weatherMan = "Hot"
//
//    weatherMan = when {
//        temperature < 50 -> "Cold"
//        temperature in 50..80 -> "Warm"
//        else -> "Hot"
//    }
//
//    println(weatherMan)
//
//    // 4. Check if a number is even or odd using %.
//
//    val number = 11
//
//    if(number % 2 == 0) println("Even number is $number") else println("Odd number is $number")
//
//
//    // 5. Use an if-expression to assign a variable isAdult (true/false) based on age.
//
//    val ageTwo = 19
//
//    if(ageTwo > 17) println("Your an adult") else println("Your not an adult")
//
//    // 6. Create two numbers and print the larger one.
//
//    val numberOne = 25123
//    val numberTwo = 31123
//
//    if(numberOne > numberTwo) println(numberOne) else println(numberTwo)
//
//    println(maxOf(numberOne, numberTwo))
//
//    // 7. Check if a string is empty and print "Empty" or "Not empty".
//
//    val string = ""
//
//    if(string.isEmpty()) println("String is empty") else println("Not Empty")



    // =============  When Block Challenges ================

// 1. Given a day name, print the type of day:
// - "Saturday", "Sunday" → "Weekend"
// - "Monday" to "Friday" → "Weekday"
// - else → "Invalid day"

    val day = "Tuesday"

    val result = when (day) {
        "Saturday" -> "Weekend"
        "Sunday" -> "Weekend"
        "Monday" -> "Weekday"
        "Tuesday" -> "Weekday"
        "Wednesday" -> "Weekday"
        "Thursday" -> "Weekday"
        "Friday" -> "Weekday"
        else -> "Undefined"
    }

    val resultTwo = when (day) {
        "Saturday", "Sunday" -> "Weekend"
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday"
        else -> "Undefined"
    }

println(result, resultTwo)


// 2. Create a `when` block to print a greeting based on the hour of the day:
// - 0..11 → "Good morning"
// - 12..17 → "Good afternoon"
// - 18..23 → "Good evening"
// - else → "Invalid hour"



// 3. Create a `when` block to print a grade description based on score:
// - in 90..100 → "Excellent"
// - in 80..89 → "Great"
// - in 70..79 → "Good"
// - in 60..69 → "Pass"
// - below 60 → "Fail"
// - else → "Invalid score"



// 4. Create a `when` block that prints what action to take based on light color:
// - "red" → "Stop"
// - "yellow" → "Slow down"
// - "green" → "Go"
// - else → "Unknown color"



// 5. Create a `when` block that prints whether a number is:
// - 0 → "Zero"
// - in 1..9 → "Single digit"
// - 10 or more → "Double digit or more"
// - else → "Invalid number"

// 6. Given a character, print whether it's a vowel, consonant, or not a letter:
// - 'a', 'e', 'i', 'o', 'u' → "Vowel"
// - any other letter → "Consonant"
// - anything else → "Not a letter"



// 7. Given a temperature in Celsius, print the state of water:
// - less than 0 → "Frozen"
// - 0..99 → "Liquid"
// - 100 or more → "Boiling"
// - else → "Invalid temperature"



// 8. Given a month number (1–12), print the corresponding season:
// - 12, 1, 2 → "Winter"
// - 3, 4, 5 → "Spring"
// - 6, 7, 8 → "Summer"
// - 9, 10, 11 → "Fall"
// - else → "Invalid month"



// 9. Given a score from 1 to 5, print a message:
// - 5 → "Excellent"
// - 4 → "Very good"
// - 3 → "Good"
// - 2 → "Needs improvement"
// - 1 → "Poor"
// - else → "Invalid rating"


// 10. Given an animal name, print the category:
// - "dog", "cat", "hamster" → "Pet"
// - "cow", "chicken", "pig" → "Farm animal"
// - "lion", "tiger", "bear" → "Wild animal"
// - else → "Unknown animal"

//    =============  for loop Challenges ================

    // 3. Write a `for` loop that prints numbers from 1 to 5.
//
//    for(i in 1..5){
//        println(i)
//    }


    // 4. Write a `for` loop that prints only even numbers from 1 to 10.

//    for(i in 1..10){
//        if(i % 2 == 0) {
//            println(i)
//        }
//    }
//
//    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
//
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//
//    println(evenNumbers)

//    =============  While Loop Challenges ================

    // 5. Use a `while` loop to count down from 5 to 1, then print "Lift off!"
//    var i = 5
//
//    while (i >= 1) {
//        println(i)
//        i--
//    }
//    println("Lift off!")


    //    =============  Do While Block Challenges ================

    // 6. Use a `do-while` loop to simulate asking for user input until a valid password is entered.
    // (Just mock this with a hardcoded "correct" password.)


    // 7. Bonus: Use `when` to check if a character is a vowel, consonant, or something else.


    // 8. Bonus: Use `if` as an expression to assign a result to a variable (e.g., isEven = if (n % 2 == 0) true else false)
}
