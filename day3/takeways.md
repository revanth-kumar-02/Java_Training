# 📅 Day 3 Takeaways – Bitwise Operators, Type Casting & Loops

> *Today I learned how Java handles data at a lower level using bitwise operators, converts data between different types, and repeats tasks efficiently using loops.*

---

# 🚀 What I Learned

Day 3 introduced some of the core programming concepts that are used frequently in Java applications. I explored **Bitwise Operators**, **Type Casting**, **Type Parsing**, **Command Line Arguments**, and different **Loop Statements**.

---

# 📖 Topics Covered

* Brief Introduction to Bitwise Operators
* Type Casting
* Type Parsing
* Command Line Arguments
* Loop Statements
* While Loop
* Do-While Loop
* For Loop
* Enhanced For (For-Each) Loop
* Types of While Loops

---

# ⚙️ Bitwise Operators

Bitwise operators perform operations directly on the **binary representation** of numbers.

### Operators Learned

| Operator | Description |            |
| -------- | ----------- | ---------- |
| `&`      | Bitwise AND |            |
| `        | `           | Bitwise OR |
| `^`      | Bitwise XOR |            |
| `~`      | Bitwise NOT |            |
| `<<`     | Left Shift  |            |
| `>>`     | Right Shift |            |

### Important Notes

* Bitwise operators work only with **integer data types** (`byte`, `short`, `int`, `long`, `char`).
* They **cannot** be used with:

  * `float`
  * `double`

---

# 🔄 Type Casting (Type Conversion)

Type casting is the process of converting one data type into another.

### Types of Type Casting

### 1. Between Primitive Data Types

Example:

```java
int number = 100;
double value = number;
```

or

```java
double value = 45.8;
int number = (int) value;
```

---

### 2. Down Casting

* Converts an **Object** into one of its child classes.
* Requires explicit casting.

---

### 3. Up Casting

* Converts a child class object into its parent (`Object`) class.
* Happens automatically.

---

# 🔤 Type Parsing

Type parsing converts a **String** into another data type using **Wrapper Class** methods.

Examples:

```java
int age = Integer.parseInt("20");
```

```java
double salary = Double.parseDouble("25000.50");
```

```java
boolean status = Boolean.parseBoolean("true");
```

### Wrapper Classes Used

* Integer
* Double
* Float
* Long
* Boolean
* Short
* Byte

---

# 💻 Command Line Arguments

Command Line Arguments allow values to be passed to a Java program while running it from the terminal.

Example:

```text
java ProgramName Revanth 20
```

These values are stored inside:

```java
String[] args
```

---

# 🔁 Loop Statements

Loops are used to execute the same block of code repeatedly.

### Why use loops?

* Avoid writing the same code multiple times.
* Reduce code redundancy.
* Repeat execution until a condition becomes `true` or `false`.

---

# While Loop

The `while` loop checks the condition **before** executing the code.

Best used when the number of iterations is unknown.

---

# Do-While Loop

The `do-while` loop executes the code **at least once**, then checks the condition.

---

# For Loop

The `for` loop is commonly used when the number of iterations is known.

It contains:

* Initialization
* Condition
* Increment / Decrement

---

# Enhanced For Loop (For-Each)

The **for-each loop** is used to traverse arrays and collections easily without using an index.

---

# Types of While Loop

### Linear While Loop

* Executes in a straight sequence.
* Condition changes normally until it becomes false.

---

### Non-Linear While Loop

* Execution depends on different conditions or nested logic.
* Often used in menu-driven or interactive programs.

---

# 🎯 Key Takeaways

* Learned the purpose of Bitwise Operators and where they are used.
* Understood that bitwise operators do not work with `float` and `double`.
* Explored different types of Type Casting.
* Learned how Wrapper Classes convert `String` values using parsing methods.
* Understood how Command Line Arguments pass values to Java programs.
* Learned why loops are important for avoiding repetitive code.
* Compared `while`, `do-while`, `for`, and `for-each` loops.
* Learned the difference between Linear and Non-Linear while loops.

---

# 📌 Reflection

Today's session helped me understand how Java works with binary operations, data conversion, and repetitive execution. Loops are one of the most fundamental programming concepts, and learning the different loop types will make writing efficient programs much easier. I also gained an introduction to type conversion techniques and command line arguments, which will be useful in more advanced Java applications.

**Day 3 Complete ✅**
