/*
==================================================
📘 Kotlin Lesson: Nullable Types & Safe Operators
==================================================

Kotlin helps you avoid `NullPointerException` by forcing you to handle nulls explicitly.

🔹 Nullable Types:
- Use `?` to declare a variable that can hold `null`.

    val name: String? = null

🔹 Safe Call Operator: `?.`
- Calls a method or accesses a property **only if the variable is not null**.

    println(name?.length) // prints null if name is null

🔹 Elvis Operator: `?:`
- Provides a default value when the left-hand side is null.

    val length = name?.length ?: 0 // returns 0 if name is null

🔹 Not-Null Assertion: `!!`
- Throws an exception if the value is null. Use sparingly!

    val sureName = name!! // risky unless you're absolutely sure it's not null

🎯 Best Practice:
- Prefer `?.` and `?:` over `!!`
- Use nullability intentionally — it’s a Kotlin feature, not a flaw.

Time to get safe with nulls 👇
*/

fun nullablePractice() {
    // 1. Declare a nullable String variable called `nickname` and set it to null.
    // Use ?. to safely print its length.


    // 2. Assign a non-null value to `nickname` and print its length again using ?.


    // 3. Use the Elvis operator to assign `nicknameLength`:
    // val nicknameLength = nickname?.length ?: 0


    // 4. Create a nullable Int called `score`. If it's null, print "No score available".


    // 5. Create a function that takes a nullable String and returns the first character, or '?' if it's null or empty.


    // 6. Try using the `!!` operator on a nullable variable and observe what happens if it’s null.


    // 7. Bonus: Combine safe calls — e.g., val result = person?.address?.city ?: "Unknown"


    // 8. Bonus: Write a function that takes a nullable list and returns its size, defaulting to 0 if the list is null.
}
