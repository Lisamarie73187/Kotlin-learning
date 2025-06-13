/*
====================================
📘 Kotlin Lesson: String Templates
====================================

Kotlin lets you embed variables and expressions directly into strings using **string templates**.

🔹 Basic Variable Insertion:
    val name = "Lisa"
    println("Hello, $name!")

🔹 Expressions in Templates:
    val age = 30
    println("In 5 years, you'll be ${age + 5} years old.")

- Use `$` for variables.
- Use `${}` for more complex expressions.

🎯 Best Practice:
- Use string templates for cleaner, more readable code.
- Use proper formatting for currency, decimals, etc., when needed.

Now try the challenges below!
*/

fun stringTemplatePractice() {
    // 1. Create val variables for your first name and last name.
    // Print: "Hello, my name is [full name]"


    // 2. Create a val for your current age.
    // Print: "Next year, I'll be [age + 1] years old."


    // 3. Create two variables: one for your city and one for your state.
    // Print: "I live in [city], [state]."


    // 4. Create a val for the number of unread emails (e.g., 7).
    // Print: "You have 7 unread emails." using string templates.


    // 5. Create a val for a product price and a val for the quantity.
    // Print: "Total cost: $[price * quantity]"


    // 6. Create a val for your favorite quote.
    // Print it like: "\"The only limit is your mind\" - Unknown"


    // 7. Bonus: Format a multiline string using string templates
    // Print something like:
    // Hello, Lisa!
    // You have 3 tasks remaining.
    // Keep going 💪

}