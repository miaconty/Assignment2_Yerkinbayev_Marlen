# Vehicle Management System

## Project Overview
This project is a simple Vehicle Management System written in Java.
It demonstrates Object-Oriented Programming concepts such as inheritance,
abstraction, composition, aggregation, and method overriding.

The project and assignment can be viewed through the GitHub repository.

---

## Class Hierarchy
Vehicle is an abstract superclass.
Car, Motorcycle, and Truck extend the Vehicle class and override engine methods.

Protected access modifiers are used for subclass access,
and the `super` keyword is used for constructor chaining.

---

## Driver Association
Each Vehicle is associated with a Driver object (composition).
One Driver can be assigned to multiple Vehicle objects (aggregation).

---

## Main Program
All vehicles are stored in a `Vehicle[]` array.
A loop is used to start engines, display vehicle and driver information,
and stop engines, demonstrating polymorphism.

---

## How to Compile and Run

### Using Terminal

javac *.java

java Main

Open the project and run Main.java.

---

## Screenshots

Screenshots of the program output and project structure
are located in the `docs/screenshots` folder.


---

## Reflection

Inheritance simplified the design of the system by placing common vehicle
properties and behaviors in the abstract Vehicle class. This reduced
code duplication and made the project easier to maintain and extend.

Method overriding allowed each vehicle type to define its own engine behavior
while still being processed through a common Vehicle array. The main
challenge during implementation was understanding abstract classes,
constructor chaining with super(), and the correct use of protected
access modifiers.

