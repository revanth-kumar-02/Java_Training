# 🍔 Delivery Management System

## 📌 Project Overview

This is a **Java Console-Based Delivery Management System** developed as part of my **#100DaysJava** learning journey.

The application:

* Accepts customer details.
* Validates the input using **Regular Expressions (Regex)**.
* Displays a food menu.
* Allows the customer to select a food item.
* Generates a simple order summary.

---

# 📚 Concepts Used

* Scanner Class
* Variables
* Data Types
* String
* Boolean
* Regular Expressions (Regex)
* `if` Statement
* `switch` Statement
* Console Input & Output

---

# 📝 Code Explanation

## 1. Import Scanner

```java
import java.util.Scanner;
```

### Explanation

* Imports the `Scanner` class.
* Used to receive input from the keyboard.

---

## 2. Create Scanner Object

```java
Scanner check = new Scanner(System.in);
```

### Explanation

* Creates a `Scanner` object.
* Reads user input using `System.in`.

---

## 3. Declare Variables

```java
String name = "", address = "", email = "", mobile = "";
int foodChoice;
double foodPrice = 0.0;
boolean isValid = true;
```

### Explanation

| Variable     | Purpose                             |
| ------------ | ----------------------------------- |
| `name`       | Stores customer name                |
| `email`      | Stores email address                |
| `mobile`     | Stores mobile number                |
| `address`    | Stores delivery address             |
| `foodChoice` | Stores selected menu option         |
| `foodPrice`  | Stores food price                   |
| `isValid`    | Tracks whether all inputs are valid |

---

## 4. Get User Input

```java
name = check.nextLine();
email = check.nextLine();
mobile = check.nextLine();
address = check.nextLine();
```

### Explanation

The program asks the customer to enter:

* Name
* Email
* Mobile Number
* Delivery Address

The values are stored in their respective variables.

---

# 5. Validate Inputs Using Regex

The `matches()` method checks whether the user's input follows the required format.

---

## 👤 Name Validation

```java
if (!name.matches("^[A-Za-z ]{3,30}$"))
```

### Regex

```text
^[A-Za-z ]{3,30}$
```

### Conditions

* `^` → Start of the string
* `[A-Za-z ]` → Only uppercase letters, lowercase letters, and spaces are allowed
* `{3,30}` → Length must be between **3 and 30** characters
* `$` → End of the string

### Examples

✅ Revanth

✅ Rev Kumar

❌ Rev123

❌ @Revanth

---

## 📧 Email Validation

```java
if (!email.matches("^[A-Za-z0-9_.-]{2,}@[A-Za-z]{3,}\\.[a-z]{2,}$"))
```

### Regex

```text
^[A-Za-z0-9_.-]{2,}@[A-Za-z]{3,}\.[a-z]{2,}$
```

### Conditions

* `^` → Start of the string
* `[A-Za-z0-9_.-]{2,}` → Username must contain at least **2** characters
* `@` → Mandatory `@` symbol
* `[A-Za-z]{3,}` → Domain name must contain at least **3** letters
* `\.` → Mandatory dot (`.`)
* `[a-z]{2,}` → Domain extension must contain at least **2** lowercase letters
* `$` → End of the string

### Examples

✅ [revanth@gmail.com](mailto:revanth@gmail.com)

✅ [user123@yahoo.com](mailto:user123@yahoo.com)

❌ revanth@gmail

❌ @gmail.com

---

## 📱 Mobile Number Validation

```java
if (!mobile.matches("^[0-9]{10}$"))
```

### Regex

```text
^[0-9]{10}$
```

### Conditions

* `^` → Start of the string
* `[0-9]` → Only digits are allowed
* `{10}` → Must contain exactly **10 digits**
* `$` → End of the string

### Examples

✅ 9876543210

❌ 987654321

❌ 98A6543210

---

## 🏠 Address Validation

```java
if (!address.matches("^[A-Za-z0-9 ]{5,}$"))
```

### Regex

```text
^[A-Za-z0-9 ]{5,}$
```

### Conditions

* `^` → Start of the string
* `[A-Za-z0-9 ]` → Letters, numbers, and spaces are allowed
* `{5,}` → Minimum **5** characters
* `$` → End of the string

### Examples

✅ 21 Gandhi Street

✅ Salem 636007

❌ @@##

❌ A1

---

## 6. Display Food Menu

```java
System.out.println("1. Burger");
System.out.println("2. Pizza");
System.out.println("3. Fried Rice");
System.out.println("4. Biryani");
```

### Explanation

Displays the list of available food items for the customer.

---

## 7. Read Food Choice

```java
foodChoice = check.nextInt();
```

### Explanation

Reads the food number selected by the customer.

Example:

```
2
```

means the customer selected **Pizza**.

---

## 8. Use Switch Case

```java
switch(foodChoice)
```

### Explanation

The `switch` statement checks the selected food item and assigns its corresponding price.

Example:

```java
case 1:
    foodPrice = 250;
    break;
```

If the customer selects **Burger**, the price becomes **₹250**.

---

## 9. Display Order Summary

```java
System.out.println("Customer Name : " + name);
System.out.println("Customer Email : " + email);
System.out.println("Customer Mobile : " + mobile);
System.out.println("Customer Address : " + address);
System.out.println("Food Price : " + foodPrice);
```

### Explanation

Displays:

* Customer Name
* Email
* Mobile Number
* Address
* Selected Food
* Food Price

This acts as a simple order receipt.

---

## 10. Close Scanner

```java
check.close();
```

### Explanation

Closes the `Scanner` object after all inputs are taken.

Closing the scanner is a good programming practice.

---

# 🎯 Learning Outcomes

By completing this project, I learned:

* How to accept user input using `Scanner`.
* How to validate user input using Regular Expressions (Regex).
* How to use `matches()` for input validation.
* How to use `if` statements to check conditions.
* How to build a menu-driven program using `switch`.
* How to create a simple console-based Java application.

---

# 🚀 Future Improvements

Some features I can add in the future:

* Print the food name instead of the menu number.
* Display the bill only when all inputs are valid.
* Add quantity selection.
* Calculate GST and delivery charges.
* Generate an Order ID.
* Save orders using a database or file handling.

---
