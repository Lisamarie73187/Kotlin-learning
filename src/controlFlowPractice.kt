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
    // 1. Create a val for age. Use `if` to print whether someone can vote (18+).


    // 2. Create a `when` block to print a greeting based on the hour of the day:
    //  - 0..11 → "Good morning"
    //  - 12..17 → "Good afternoon"
    //  - 18..23 → "Good evening"
    //  - else → "Invalid hour"


    // 3. Write a `for` loop that prints numbers from 1 to 5.


    // 4. Write a `for` loop that prints only even numbers from 1 to 10.


    // 5. Use a `while` loop to count down from 5 to 1, then print "Lift off!"


    // 6. Use a `do-while` loop to simulate asking for user input until a valid password is entered.
    // (Just mock this with a hardcoded "correct" password.)


    // 7. Bonus: Use `when` to check if a character is a vowel, consonant, or something else.


    // 8. Bonus: Use `if` as an expression to assign a result to a variable (e.g., isEven = if (n % 2 == 0) true else false)
}
