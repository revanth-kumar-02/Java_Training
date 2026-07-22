# 📅 Day 2 Takeaways – Decision Making, Data Types & Java Basics

> *Writing code isn't just about syntax—it's about choosing the right logic for the right problem.*

## 🚀 What I Learned

Day 2 focused on strengthening Java fundamentals by exploring different decision-making techniques, understanding Java identifiers and keywords, learning about regular expressions, and revisiting core data types and operators.

---

## 📖 Topics Covered

* `if-else-if` Ladder (Part 2)
* `switch` Statement
* Ternary Operator
* Regular Expressions (Regex)
* Identifiers
* Keywords
* Comments
* Primitive Data Types
* Wrapper Classes
* Operators
* Separators

---

## 🔀 Decision Making

### `if-else-if` Ladder

Used when multiple conditions need to be checked one after another.

**Characteristics**

* Conditions are checked sequentially.
* Stops once a matching condition is found.
* Best when conditions involve ranges or complex expressions.

### `switch` Statement

Used when comparing a single value against multiple fixed cases.

**Characteristics**

* Cleaner and easier to read than long `if-else-if` ladders.
* Suitable for menu-driven applications.
* Often easier for the compiler to optimize when checking fixed values.

> **Takeaway:** Both approaches are efficient. The choice depends more on the problem than on performance.

---

## ⚡ Ternary Operator

A shorthand alternative to simple `if-else` statements.

```java
result = (condition) ? value1 : value2;
```

Useful for writing concise conditional expressions.

---

## 🔍 Regular Expressions (Regex)

Learned the basics of pattern matching.

| Symbol      | Meaning                                     |
| ----------- | ------------------------------------------- |
| `+`         | One or more occurrences                     |
| `*`         | Zero or more occurrences                    |
| `^`         | Start of a string (or negation inside `[]`) |
| `$`         | End of a string                             |
| `?`         | Zero or one occurrence                      |
| `{min,max}` | Specifies a repetition range                |
| `[a-z]`     | Lowercase alphabets                         |
| `[A-Z]`     | Uppercase alphabets                         |
| `[0-9]`     | Digits                                      |

---

## 🏷️ Identifiers

Identifiers are names given to Java elements such as:

* Class names
* Variable names
* Object names
* Package names
* Method names

### Rules

* Must be unique within their scope.
* Cannot use Java keywords.
* Should use meaningful names.

---

## 🔑 Keywords

Java contains **52 reserved keywords**.

These keywords already have predefined meanings and **cannot** be used as identifiers.

---

## 💬 Comments

Used to improve code readability and documentation.

### Single-line Comment

```java
// This is a single-line comment
```

### Multi-line Comment

```java
/*
 This is a
 multi-line comment
*/
```

---

## 📦 Primitive Data Types

| Data Type | Size          |
| --------- | ------------- |
| byte      | 1 byte        |
| short     | 2 bytes       |
| int       | 4 bytes       |
| long      | 8 bytes       |
| float     | 4 bytes       |
| double    | 8 bytes       |
| char      | 2 bytes       |
| boolean   | JVM dependent |

---

## 📚 Wrapper Classes

Every primitive type has a corresponding wrapper class.

| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

Example:

```java
Double price = 7.8;
```

---

## ➕ Operators

### Arithmetic

```
+  -  *  /  %
```

### Relational

```
>  <  >=  <=  ==  !=
```

### Logical

```
&&   ||
```

### Assignment

```
=  +=  -=  *=  /=
```

### Unary

```
++   --
```

### Bitwise

```
&   |   ^   ~   <<   >>
```

---

## 📌 Separators

Java separators include:

```
;   ,   ( )   { }
```

---

## 🎯 Key Takeaways

* Choose `switch` when comparing one variable against multiple fixed values.
* Use `if-else-if` for complex conditions and ranges.
* The ternary operator simplifies simple conditional expressions.
* Regex makes input validation much easier.
* Identifiers should be meaningful and cannot be Java keywords.
* Wrapper classes allow primitive data types to be treated as objects.
* Understanding operators and data types is essential before moving into advanced Java concepts.

---

## 📌 Reflection

Today's session strengthened my understanding of Java syntax and decision-making. Learning when to use `switch`, `if-else`, and the ternary operator gave me a better understanding of writing cleaner code. I also explored regex, identifiers, wrapper classes, and Java's core building blocks, which will be useful throughout my Java journey.

**Day 2 Complete ✅**
