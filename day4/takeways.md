# 📅 Day 4 Takeaways – Nested Loops & Pattern Generation

> *Today I learned how combining loops can solve more complex problems. Nested loops opened the door to creating patterns and understanding how rows and columns work together.*

---

# 🚀 What I Learned

Day 4 focused on **Nested Loops**, one of the most important concepts in Java. Using nested loops, I learned how to generate different console patterns such as squares and triangles.

---

# 📖 Topics Covered

* Nested Loops
* Introduction to Pattern Generation
* Perfect Square Pattern
* Triangle Pattern

---

# 🔁 Nested Loops

A **nested loop** is a loop inside another loop.

* The **outer loop** controls the number of rows.
* The **inner loop** controls the number of columns.

### Structure

```java
for(initialization; condition; increment){
    for(initialization; condition; increment){
        // Code to execute
    }
}
```

### Key Points

* One loop runs inside another loop.
* The inner loop completes all its iterations for every single iteration of the outer loop.
* Mostly used for creating patterns, working with matrices, and processing two-dimensional data.

---

# ⭐ Pattern Generation

Pattern generation is the process of printing characters, numbers, or symbols in a specific arrangement using loops.

It helps improve understanding of:

* Nested loops
* Loop execution order
* Row and column logic
* Problem-solving skills

---

# ⬜ Perfect Square Pattern

The perfect square pattern prints the same number of columns for every row.

### Example

```text
* * * *
* * * *
* * * *
* * * *
```

### Logic

* Outer loop → Controls the number of rows.
* Inner loop → Prints the same number of stars in every row.
* After the inner loop finishes, move to the next line.

---

# 🔺 Triangle Pattern

The triangle pattern increases the number of characters in each row.

### Example

```text
*
* *
* * *
* * * *
```

### Logic

* Outer loop → Controls the number of rows.
* Inner loop → Prints stars based on the current row number.
* The number of stars increases with each new row.

---

# 🎯 Key Takeaways

* Learned how nested loops work.
* Understood the role of the outer loop (rows) and inner loop (columns).
* Created simple console patterns using nested loops.
* Learned the basic logic behind square and triangle pattern generation.
* Improved understanding of loop execution and iteration.

---

# 📌 Reflection

Today's session introduced me to nested loops and pattern generation. Although pattern programs look simple, they helped me understand how loops interact with each other. This knowledge will be useful for solving logic-building problems and preparing for coding interviews.

**Day 4 Complete ✅**
