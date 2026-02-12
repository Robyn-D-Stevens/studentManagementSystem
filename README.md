# Student Management System Assignment
Mini Assignment 1 16/02/2026

## Overview 
This project is a simple **Student Management System** implemented in Java. 
-- It demonstrates: 
- The **Builder Design Pattern** for flexible object creation.
- **Inheritance and Polymorphism** through different student types.
- Application of **SOLID principles** to ensure clean, modular, and extensible code.

 
## Classes 
- **Student (abstract class)** Defines common attributes (`studentId`, `name`, `email`, `department`) and abstract methods (`calculateTuition()`, `getStudentType()`).
- **UndergraduateStudent (subclass)** Extends `Student` and adds `creditHours` and `scholarshipAmount`. Includes its own **Builder** for object construction.
- **GraduateStudent (subclass)** Extends `Student` and adds `researchAssistant` and `stipend`. Includes its own **Builder** for object construction.
- **Main class** Demonstrates creating student objects using the Builder pattern and displaying their details.
