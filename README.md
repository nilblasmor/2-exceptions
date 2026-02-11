## 📌 Exercise Statement

This module is divided into several exercises to explore Java’s error-handling system using **exceptions**. Each exercise has been completed and documented following the **Conventional Commits** standard.

### Level 1 — Exercise 1: Custom Exceptions and Sale Management

A system is designed to manage sales and products, ensuring that operations are robust against invalid input and empty data.

- A **custom exception `EmptySaleException`** is implemented to handle cases where a sale contains no products.  
- The `Sale` class manages a collection of `Product` objects and calculates the total price using the `calculateTotal()` method.  
- `calculateTotal()` throws `EmptySaleException` when the product list is empty, preventing invalid calculations.  
- Standard exceptions such as `IndexOutOfBoundsException` are simulated and caught to demonstrate proper error handling.  
- The custom exception was later updated to extend `RuntimeException` to illustrate the difference between **checked** and **unchecked exceptions**.  

---

## ✨ Features

- Creation and handling of **custom exceptions**  
- Catching and managing **standard Java exceptions** (`IndexOutOfBoundsException`)  
- Input validation to ensure safe and reliable operations  
- Working with collections (`ArrayList<Product>`)  
- Applying best practices for reusable methods, clear naming, and defensive programming  

---

## 🛠 Technologies

- **Backend**: Java 21 (LTS)  

---

## 🚀 Installation & Execution

1. Clone the repository by running `git clone <repository-url>` and navigate to the project folder.  
2. Compile all Java source files using `javac -d out src/**/*.java`. This will create `.class` files in the `out` directory.  
3. Run the program with `java -cp out Main`. This executes the main program demonstrating custom exception handling and sale management exercises.  
