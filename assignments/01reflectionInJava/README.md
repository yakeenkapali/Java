###### _23 Nov 2021 - 30 Nov 2021_

# Reflection in Java

### What is Reflection in Java ?

Reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

### Why Reflection API ?

Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

#### Merits and Demerits of Reflection API

##### Merits:

- Inspection of interfaces, classes, methods, and fields during runtime is possible using reflection, even without using their names during the compile time.
- Debuggers utilize the property of reflection to look at private members on classes.
- Really useful to study a program when we only have compiled bytecode of a program without it's source code and original author of the program made a mistake and didn't expose proper API.

##### Demerits:

- Causes Preformance/Execution Overhead as reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
- Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform causing exposure of internals.
- Reflective code is againts Object Oriented principles.


## Simple Reflect Example

#### Code:

```java
class Student{}

class Reflect{
    public static void main(String args[]){
        Class reflectClass = Student.class;
        String name = reflectClass.getName();
        System.out.println("Name: "+name);
 }
}

```

#### Output:

```
Name: Person
```
