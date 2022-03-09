````
2013 Spring JAVA Question Paper

1. a) Discuss the features of Java Programming. Why Java is popular than C/C++ ?
1. b) What do you mean by interface? How do you implement interface in java. Explain with example.

2. a) Explain with examples.
(I) Access Protection Mechanism**
(II) Inner Classes**
2. b) Explain Various stream classes available in Java. Write a program using any stream classes for writing text to a file.

3. a) What does security restriction means in applet? List out the attributes of applet tag and explain them.
3. b) Write a program to create a frame in swing. The frame should contain three text fields with labels arg1, arg2 and result respectively, a menu called file with sub menus add, subtract and close.

4. a) Explain the Layout Manager in detail. Write a program to change the font of text in textfield of the Frame. The frame contains 3 checkboxes named bold, italic and plain.
4. b)Write a simple GUI addition application that used two input dialogs to obtain integers from the user and a message dialog to display the sum. 

5. a) What is socket? Write a program to find local IP Address & Hostname of the system.
5. b) Explain URL and URL connection class with suitable program.

6. a) Write a program to connect to a database using JDBC. Assume that database name is test Db and it has table named employee with 2 records.
6. b) Explain different types of JDBC drives. 

7. Write short notes on: a) Casting abstract class b) Life Cycle of Applet c) Frame Layout.

````

### 1. a) Discuss the features of Java Programming. Why Java is popular than C/C++ ?

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

### 1. b) What do you mean by interface? How do you implement interface in java. Explain with example.

Interface is a mechanism to achieve an abstraction. There can only be abstract class in interface, not method body. It is used to achieve multiple inheritance.

> How do you implement interface in java. Explain with example.

Interface is declared by using the interface keyword. It provides total abstraction which means all the method in an interface are declared with empty body and all the fiels are public, static, final by default. A class that implements an Interface must implement all the methods declared in the interface.

### 2. a) Explain with examples.

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
### 2. b) Explain Various stream classes available in Java. Write a program using any stream classes for writing text to a file.

### 3. a) What does security restriction means in applet? List out the attributes of applet tag and explain them.

One of the main goals of the Java environment is to make browser users feel secure running any applet. To achieve this goal, we've started out conservatively, restricting capabilities perhaps more than necessary. As time passes, applets will probably get more and more abilities. 

Each applet viewer has a SecurityManager object that checks for applet security violations. When a SecurityManager detects a violation, it creates and throws a SecurityException object. Generally, the SecurityException constructor prints a warning message to the standard output. An applet can catch SecurityExceptions and react appropriately, such as by reassuring the user and by resorting to a "safer" (but less ideal) way of accomplishing the task. 

> List out the attributes of applet tag and explain them.

- **height**: Defines height of applet
- **width**: Defines width of applet
- **align**: Defines the text alignment around the applet
- **alt**: An alternate text to be displayed if the browser support applets but cannot run this applet
- **archive**: A URL to the applet when it is stored in a Java Archive or ZIP file
- **code**: A URL that points to the class of the applet
- **codebase**: Indicates the base URL of the applet if the code attribute is relative
- **hspace**: Defines the horizontal spacing around the applet
- **vspace**: Defines the vertical spacing around the applet
- **name**: Defines a name for an applet
- **object**: Defines the resource name that contains a serialized representation of the applet
- **title**: Display information in tool tip

	
### 3. b) Write a program to create a frame in swing. The frame should contain three text fields with labels arg1, arg2 and result respectively, a menu called file with sub menus add, subtract and close.

[Menu and Textfield](https://github.com/yakeenkapali/Java/blob/master/ExamQuestions/2013Spring/Codes/MenuTextfield.java)

### 4. a) Explain the Layout Manager in detail. Write a program to change the font of text in textfield of the Frame. The frame contains 3 checkboxes named bold, italic and plain.

The LayoutManagers are used to arrange components in a particular manner. The Java LayoutManagers facilitates us to control the positioning and size of the components in GUI forms. LayoutManager is an interface that is implemented by all the classes of layout managers. There are the following classes that represent the layout managers:

- java.awt.BorderLayout
- java.awt.FlowLayout
- java.awt.GridLayout
- java.awt.CardLayout
- java.awt.GridBagLayout
- javax.swing.BoxLayout
- javax.swing.GroupLayout
- javax.swing.ScrollPaneLayout
- javax.swing.SpringLayout etc.

>Write a program to change the font of text in textfield of the Frame. The frame contains 3 checkboxes named bold, italic and plain.
[Change Font](https://github.com/yakeenkapali/Java/blob/master/ExamQuestions/2013Spring/Codes/ChangeFont.java)

### 4. b)Write a simple GUI addition application that used two input dialogs to obtain integers from the user and a message dialog to display the sum.

[Add Integer](https://github.com/yakeenkapali/Java/blob/master/ExamQuestions/2013Spring/Codes/AddIntegers.java)

### 5. a) What is socket? Write a program to find local IP Address & Hostname of the system.

End point for communication between two application running on different JRE is called Socket.

Uses : 
- Connection Instantiate || connection-oriented
- Communictaion between two application

[Display IP Address and Hostname](https://github.com/yakeenkapali/Java/blob/master/ExamQuestions/2013Spring/Codes/DisplayHostname.java)

### 5. b) Explain URL and URL connection class with suitable program.

The Java URL class represents an URL. URL is an acronym for Uniform Resource Locator. It points to a resource on the World Wide Web.
<br />
The Java URLConnection class represents a communication link between the URL and the application. It can be used to read and write data to the specified resource referred by the URL.



### 6. a) Write a program to connect to a database using JDBC. Assume that database name is test Db and it has table named employee with 2 records.

### 6. b) Explain different types of JDBC drives. 

**API** is the Application Programming Interface, which is a software intermediary that allows two applications to talk to each other. Each time you use an app like Facebook, send an instant message, or check the weather on your phone, you're using an API.

**JDBC** stands for Java Database Connectivity, which is a standard Java API for database-independent connectivity between the Java programming language and a wide range of databases.

**JDBC API** is a Java API that can access any kind of tabular data, especially data stored in a Relational Database. JDBC works with Java on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.




### 7. Write short notes on: a) Casting abstract class b) Life Cycle of Applet c) Frame Layout.