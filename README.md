📌 **Exercise Statement**

This module focuses on Java’s exception-handling system, with the goal of increasing application robustness and preventing failures caused by invalid input or illegal operations. The exercises progressively introduce standard exceptions, custom exceptions, and proper error management strategies, while reinforcing clean code structure and separation of responsibilities.

**Level 1 — Exercise 1: Custom Exceptions and Error Handling**

A simple sales management scenario is implemented to work with exceptions in a concrete context. Each sale may contain multiple products, and the system must calculate the total price only when valid data is present.

A Product class is created with the attributes name and price. A Sale class maintains a collection of products and a totalPrice attribute. The calculateTotal() method checks whether the product list is empty before performing any calculation.

If the collection is empty, the method throws a custom exception named EmptySaleException with an explanatory message. If products exist, their prices are summed and stored as the total.

The EmptySaleException initially extends Exception, making it a checked exception that must be handled explicitly. The exercise also includes the forced generation and handling of an IndexOutOfBoundsException to illustrate common runtime errors when working with collections.

In a final step, EmptySaleException is refactored to extend RuntimeException, allowing analysis of the differences between checked and unchecked exceptions and their impact on compilation and error propagation.

<br>

✨ **Features**

The project applies structured exception handling, domain-specific error modeling, validation of application state before execution, controlled interaction with collections, and a clear comparison between checked and unchecked exceptions.

<br>

🛠 **Technologies**

Backend: Java 25
