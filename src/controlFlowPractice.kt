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


//    =============  If Challenges ================

    // 1. Create a val for age. Use `if` to print whether someone can vote (18+).

    var age = 1

    age = 45

    if (age >= 18) println("Yes") else println("No")


    // 2. Check if a number is positive, negative, or zero.

    val numberToCheck = -5

    if (numberToCheck > 0) {
        println("Yes number is positive")
    }
    if (numberToCheck < 0) {
        println("Yes number is negative")
    } else if (numberToCheck === 0) {
        println("Yes number 0")
    }

    // 3. Create a variable for temperature and print:
    // - "Cold" if less than 50
    // - "Warm" if between 50–80
    // - "Hot" if greater than 80

    val temperature = 38

    if(temperature < 50){
        println("Cold")
    }


    // 4. Check if a number is even or odd using %.


    // 5. Use an if-expression to assign a variable isAdult (true/false) based on age.


    // 6. Create two numbers and print the larger one.


    // 7. Check if a string is empty and print "Empty" or "Not empty".


//    =============  When Block Challenges ================

    // 2. Create a `when` block to print a greeting based on the hour of the day:
    //  - 0..11 → "Good morning"
    //  - 12..17 → "Good afternoon"
    //  - 18..23 → "Good evening"
    //  - else → "Invalid hour"

    val hourOfTheDay = 15

    var result =  when (hourOfTheDay) {
       in  0..11 -> "Good morning"
        in 12..19 -> "Good afternoon"
        in 20..30 -> "Good night"
        else -> "Sorry"
    }
    println(result)

//    =============  for loop Challenges ================

    // 3. Write a `for` loop that prints numbers from 1 to 5.

    for(i in 1..5){
        println(i)
    }


    // 4. Write a `for` loop that prints only even numbers from 1 to 10.

    for(i in 1..10){
        if(i % 2 == 0) {
            println(i)
        }
    }

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers)

//    =============  While Loop Challenges ================

    // 5. Use a `while` loop to count down from 5 to 1, then print "Lift off!"
    var i = 5

    while (i >= 1) {
        println(i)
        i--
    }
    println("Lift off!")


    //    =============  Do While Block Challenges ================

    // 6. Use a `do-while` loop to simulate asking for user input until a valid password is entered.
    // (Just mock this with a hardcoded "correct" password.)


    // 7. Bonus: Use `when` to check if a character is a vowel, consonant, or something else.


    // 8. Bonus: Use `if` as an expression to assign a result to a variable (e.g., isEven = if (n % 2 == 0) true else false)
}
