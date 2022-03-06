# 2013 Spring JAVA Question Paper

### 1(a). Discuss the features of Java Programming. Why Java is popular than C/C++ ?

a) **Object Oriented**
<br />
	 - In Java, everything is an Object. Java can be easily extended since it is based on the Object model.

b) **Platform Independent**
<br />
	 - Java is executed by JVM (Java Virtual Machine) which compiles the program into platform independent byte code. This byte code is distributed over the web and interpreted by JVM on whichever platform it is beignrun on.

c) **Simple and Secure**
<br />
	 - Java runs on the basic concept of OOP which makes it easy to learn. With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.

d) **Architectural Neutral**
<br />
	 - Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java runtime system.
	
e) **Robust**
<br />
	 - Java eliminates error-prone sitaution by emphasizing mainly on compile time error checking and wuntime error checking.

f) **Portable**
<br />
	 - Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. The compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset.

> Why Java is popular than C/C++?

When C/C++ is compiled, it is compiled into platform specific machine. But when java is compiled, it is compiled into platform-independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on. 

Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. Java programs can carry an extensive amount of run-time information that can be used to verify and resolve accesses to objects at run-time.

### 1(b). What do you mean by interface? How do you implement interface in java. Explain with example.

Interface is a mechanism to achieve an abstraction. There can only be abstract class in interface, not method body. It is used to achieve multiple inheritance.

> How do you implement interface in java. Explain with example.

Interface is declared by using the interface keyword. It provides total abstraction which means all the method in an interface are declared with empty body and all the fiels are public, static, final by default. A class that implements an Interface must implement all the methods declared in the interface.

### 2(a). Explain with examples.

**(I) Access Protection Mechanism**

*(a) Private*
<br />
The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

```ruby
	
	class A{
		private int num = 10;
		
		private void message(){
			System.out.println("Private Content ahead.");
		}
	}
	
	class B{
		public static void main (String[] args){
			A obj = new A();
			System.out.println(obj.num); // Compile time Error
			obj.message(); // Compile time Error
		}
	}

```
In this example, we have created two classes A and B. A class contains private data member and private method. We are accessing these private members from outside the class, so there is a compile-time error.

*(b) Default*
<br />
If we don't use any modifier, it is treated as default by default. The default modifier is accessible only within package. It cannot be accessed from outside the package. It provides more accessibility than private. But, it is more restrictive than protected, and public. 


```ruby

	// A.java
	package packA;
	
	class A{
		void message(){
			System.out.println("Default Content ahead.");
		}
	}
	
	// B.java
	package packB;
	import packA*;
	
	class B{
		public static void main (String[] args){
			A obj = new A();
			obj.message(); // Compile time Error
		}
	}

```
In this example, the scope of class A and its method message() is default so it cannot be accessed from outside the package.

*(c) Protected*

The protected access modifier is accessible within package and outside the package but through inheritance only. It provides more accessiblity than default modifier.


```ruby
	
	//A.java
	class A{
		protected int num = 10;
		
		protected void message(){
			System.out.println("Protected Content ahead.");
		}
	}
	
	//B.java
	class B extends A{
		public static void main (String[] args){
			B obj = new B();
			System.out.println(obj.num); 
			obj.message();
		}
	}

```

In this example, we have created two classes A and B. A class contains protected data member and private method. We are accessing these protected members from outside the class.

*(d) Public*

The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.


```ruby

	// A.java
	package packA;
	
	class A{
		public void message(){
			System.out.println("Public Content ahead.");
		}
	}
	
	// B.java
	package packB;
	import packA*;
	
	class B{
		public static void main (String[] args){
			A obj = new A();
			obj.message(); // Compile time Error
		}
	}

```
In this example, the scope of class A and its method message() is public so it can be accessed from outside the package.


**(II) Inner Classes**

Java inner class or nested class is a class that is declared inside the class or interface. Additionally, it can access all the members of the outer class, including private data members and methods.

>Advantages of Inner Classes

- Nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private.
- Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
- Code Optimization: It requires less code to write.

````ruby
	
	class OuterClass{  
     //code  
    class InnerClass{  
      //code  
     }  
    }  
	
````