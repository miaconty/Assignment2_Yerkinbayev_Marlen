# Vehicle Management System

## Project Overview
This project is a simple Vehicle Management System written in Java.
It demonstrates basic Object-Oriented Programming concepts such as
inheritance, abstraction, composition, and method overriding.

## Class Hierarchy
Vehicle is an abstract superclass that contains common fields and methods.
Car, Motorcycle, and Truck extend the Vehicle class and override the
startEngine() and stopEngine() methods.

Protected access modifier is used so subclasses can access vehicle data.
The super keyword is used to call the parent class constructor.

## Driver Association
Each Vehicle has a Driver object (composition).
One Driver can be assigned to multiple Vehicle objects (aggregation).

## How to Compile and Run
Open the project in IntelliJ IDEA.
Run the Main.java file using the green Run button.

## Reflection
Inheritance helped simplify the design by placing common functionality
in the Vehicle class. Method overriding allowed each vehicle type to
have its own engine behavior. The main challenge was understanding
abstract classes and how protected fields work.
