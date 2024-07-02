# Solid Principles

## Single Responsibility Principle

The Single Responsibility Principle (SRP) states that a class should have only one reason to change, or in other words, it should have only one responsibility. This means that a class should have only one job to do, and it should do it well.
If a class has too many responsibilities, it can become hard to understand, maintain, and modify. Changes to one responsibility can inadvertently affect another responsibility, leading to unintended consequences and bugs. By following SRP, we can create code that is more modular, easier to understand, and less prone to errors.


## Open-Closed Principle
The Open-Closed Principle (OCP) states that software entities (classes, modules, functions, and so on) should be open for extension but closed for modification. This means that the behavior of a software entity can be extended without modifying its source code.
The OCP is essential because it promotes software extensibility and maintainability. By allowing software entities to be extended without modification, developers can add new functionality without the risk of breaking existing code. This results in code that is easier to maintain, extend, and reuse.


## Liskov-Substitution Principle
The Liskov Substitution Principle (LSP) states that any instance of a derived class should be substitutable for an instance of its base class without affecting the correctness of the program.
In other words, a derived class should behave like its base class in all contexts. In more simple terms, if class A is a subtype of class B, you should be able to replace B with A without breaking the behavior of your program.
The importance of the LSP lies in its ability to ensure that the behavior of a program remains consistent and predictable when substituting objects of different classes. Violating the LSP can lead to unexpected behavior, bugs, and maintainability issues.


## Interface-Segregation Principle
The Interface Segregation Principle (ISP) focuses on designing interfaces that are specific to their client's needs. It states that no client should be forced to depend on methods it does not use.
The principle suggests that instead of creating a large interface that covers all the possible methods, it's better to create smaller, more focused interfaces for specific use cases. This approach results in interfaces that are more cohesive and less coupled.


## Dependency-Inversion Principle
The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules, but both should depend on abstractions. Abstractions should not depend on details – details should depend on abstractions.
This principle aims to reduce coupling between modules, increase modularity, and make the code easier to maintain, test, and extend.
For example, consider a scenario where you have a class that needs to use an instance of another class. In the traditional approach, the first class would directly create an instance of the second class, leading to a tight coupling between them. This makes it difficult to change the implementation of the second class or to test the first class independently.
But if you apply the DIP, the first class would depend on an abstraction of the second class instead of the implementation. This would make it possible to easily change the implementation and test the first class independently.
