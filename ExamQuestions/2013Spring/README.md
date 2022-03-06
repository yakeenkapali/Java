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

**(i) Access Protection Mechanism**

*Private*
<br />
The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

```ruby
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
```


