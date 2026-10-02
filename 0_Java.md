# Java — Complete Reference

> A single reference for Java: language basics, JDK/JRE/JVM, compilation, bytecode, platform independence, memory, OOP, collections, exceptions, concurrency, packages, JARs, modules, tooling, build systems, databases, deployment, and important modern concepts.
>
> **Last reviewed:** 2026-10-02
> **Current release context:** JDK 27 is the latest Java SE release; JDK 25 is the latest LTS release. JDK 26 is a previous non-LTS release.

---

# 1. What is Java?

**Java** is a high-level, class-based, statically typed programming language and software platform.

Java source code is normally compiled into **JVM bytecode**. A platform-specific **Java Virtual Machine (JVM)** loads and executes that bytecode.

```text
Java source code
      |
      | javac
      v
JVM bytecode (.class)
      |
      | Java launcher / JVM
      v
JVM execution
      |
      v
Native machine execution
```

Java is commonly used for:

- Backend and enterprise applications
- REST APIs and web services
- Cloud applications
- Distributed systems
- Desktop applications
- Data-processing systems
- Developer tools
- Large-scale business software

---

# 2. Main Characteristics of Java

### High-level

Java hides many low-level hardware details behind the JVM and standard libraries.

### Statically typed

Variable and expression types are checked by the compiler.

```java
int age = 20;
String name = "Ayush";
```

### Object-oriented

Core OOP ideas:

```text
Encapsulation
Inheritance
Polymorphism
Abstraction
```

### Garbage collected

Unused reachable-from-nowhere heap objects can eventually be reclaimed automatically.

### Portable

The same JVM bytecode can run on different operating systems when compatible JVMs and dependencies are available.

### Concurrent

Java provides threads, synchronization, executors, concurrent collections, futures, and virtual threads.

### Large standard library

Java SE provides APIs for collections, I/O, networking, time, concurrency, security, reflection, regular expressions, and more.

---

# 3. Java SE, JDK, JRE, JVM

These are related but different terms.

## Java SE

**Java SE = Java Platform, Standard Edition**.

It defines the core Java language/platform specifications and standard APIs.

Examples:

```text
java.lang
java.util
java.io
java.nio
java.time
java.net
java.sql
java.util.concurrent
```

## JVM

**JVM = Java Virtual Machine**.

It executes Java bytecode and handles important runtime responsibilities such as:

- Class loading
- Bytecode verification
- Linking
- Execution
- JIT compilation
- Garbage collection
- Thread execution
- Runtime memory management

The JVM implementation itself is platform-specific.

## JRE

**JRE = Java Runtime Environment**.

The old conceptual model was:

```text
JRE = JVM + Java runtime libraries
```

However, modern Java no longer ships the old standalone JRE image in the JDK. JDK 11 and later do not contain a separate JRE image in the old sense.

## JDK

**JDK = Java Development Kit**.

The JDK is what a developer normally installs.

It contains the runtime plus development, debugging, packaging, documentation, and diagnostic tools.

```text
JDK
├── Java runtime
├── Compiler
├── Debugging tools
├── Packaging tools
├── Documentation tools
├── Diagnostic tools
└── Other development utilities
```

---

# 4. JVM vs JDK vs JRE — Quick Table

| Term | Meaning | Main purpose |
|---|---|---|
| JVM | Java Virtual Machine | Executes bytecode |
| JRE | Java runtime environment (historical/conceptual term) | Run Java applications |
| JDK | Java Development Kit | Develop, compile, test, package, and run Java |
| Java SE | Java Standard Edition | Defines the core Java platform/APIs |

---

# 5. Why Java is Platform Independent

Java is often summarized as:

> **Write Once, Run Anywhere (WORA)**

The important idea is that Java source code is not normally compiled directly into one OS's machine code.

Instead:

```text
Hello.java
   |
   | javac
   v
Hello.class
   |
   +-------------------+
   |                   |
Windows JVM         Linux JVM
   |                   |
   v                   v
Native code         Native code
```

A compatible JVM acts as the platform-specific layer.

Therefore the same `.class` file can often run on:

```text
Windows
Linux
macOS
```

without recompiling the Java bytecode for each operating system.

### Important limitation

Java does **not** make the entire application automatically platform-independent.

Portability can be reduced by:

- JNI/native libraries
- OS-specific commands
- Hard-coded paths
- Platform-specific APIs
- CPU-specific dependencies
- File-system assumptions
- External services/configuration

So a more precise statement is:

> Java bytecode is portable across compatible JVMs, but the complete application may still have platform-specific dependencies.

---

# 6. Java Compilation and Execution

## Traditional workflow

```text
Source code
   |
   | javac
   v
Bytecode / .class
   |
   | java
   v
JVM
   |
   v
Execution
```

Example:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

Compile:

```bash
javac Hello.java
```

Creates:

```text
Hello.class
```

Run:

```bash
java Hello
```

Do not normally use:

```bash
java Hello.class
```

The launcher expects the class name.

---

# 7. What `javac` Does

`javac` is the Java compiler.

It reads Java source files and compiles them into JVM class files.

```text
.java
  |
  | javac
  v
.class
```

The compiler performs work such as:

```text
Lexing
Parsing
Type checking
Name resolution
Bytecode generation
```

---

# 8. What `java` Does

`java` is the Java application launcher.

Example:

```bash
java Main
```

A simplified launch sequence is:

```text
Start JVM
   ↓
Locate main class
   ↓
Load classes
   ↓
Link / initialize classes
   ↓
Invoke main()
   ↓
Execute bytecode
```

---

# 9. Source-File Launching

Modern Java can directly launch a source file:

```bash
java Hello.java
```

This is convenient for small programs and experiments.

The traditional workflow remains:

```bash
javac Hello.java
java Hello
```

---

# 10. Bytecode

**Bytecode** is the instruction representation understood by the JVM.

It is:

```text
not Java source code
not CPU machine code
```

It is an intermediate representation designed for the JVM.

```text
Java source
    ↓
javac
    ↓
JVM bytecode
    ↓
JVM
    ↓
Native machine execution
```

---

# 11. `.java`, `.class`, and `.jar`

| File | Meaning |
|---|---|
| `.java` | Java source code |
| `.class` | Compiled JVM class file |
| `.jar` | Archive containing classes/resources/metadata |
| `.jmod` | Java module/package format used by JDK tooling |

A JAR can contain many `.class` files.

---

# 12. JVM Execution Engine

A simplified model:

```text
JVM bytecode
    |
    +---- Interpreter
    |
    +---- JIT Compiler
              |
              v
       Native machine code
```

## Interpreter

Executes bytecode instructions directly.

## JIT

**JIT = Just-In-Time compiler**.

Frequently executed code can be compiled into optimized native code during runtime.

This is one reason modern Java can achieve high performance.

---

# 13. JVM Architecture

Simplified:

```text
                     JVM
                      |
        ---------------------------------
        |               |               |
   Class Loader    Runtime Areas   Execution Engine
                                        |
                                  Interpreter / JIT
                                        |
                                       JNI
```

The JVM specification defines runtime behavior, while an implementation such as HotSpot has its own internal architecture and optimizations.

---

# 14. Class Loading

Java classes must be loaded before they can be used.

A simplified lifecycle:

```text
Loading
   ↓
Linking
   ├── Verification
   ├── Preparation
   └── Resolution
   ↓
Initialization
```

Common loader terminology:

```text
Bootstrap Class Loader
        ↓
Platform Class Loader
        ↓
Application/System Class Loader
```

---

# 15. JVM Runtime Data Areas

The JVM specification defines several runtime data areas.

```text
JVM
├── Heap
├── JVM Stacks
├── Program Counter / PC state
├── Method Area
├── Runtime Constant Pools
└── Native Method Stacks
```

---

# 16. Heap

The **heap** is the runtime area from which objects and arrays are allocated.

Example:

```java
User user = new User();
```

A useful mental model is:

```text
user reference
      |
      v
User object
      |
      v
     Heap
```

The exact physical memory layout is JVM-implementation-specific.

---

# 17. Stack

Each Java thread has its own JVM stack.

Each method invocation creates a frame.

```text
Thread
  ↓
JVM Stack
  ↓
Stack Frames
  ↓
Local execution state
```

A common beginner mental model is that local variables live on the stack and objects live on the heap, but the exact physical placement is an implementation detail.

---

# 18. Method Area

The JVM specification describes a logical **method area** for class-level structures.

It is associated with information such as:

- Class metadata
- Method information
- Field information
- Runtime constant pool

A concrete JVM may implement this differently. For example, HotSpot uses **Metaspace** for class metadata.

---

# 19. Runtime Constant Pool

Each class/interface has a runtime constant pool containing symbolic and literal information needed by the JVM.

It is involved in:

- Class linking
- Method references
- Field references
- Class references
- Constants/literals

---

# 20. Program Counter / PC Register

Each JVM thread has execution state associated with the current bytecode instruction.

Conceptually, the PC identifies what bytecode execution point the thread is at.

---

# 21. Garbage Collection

Java normally manages heap object memory automatically.

Example:

```java
Book book = new Book();
book = null;
```

If no reachable reference to the object remains, it may become **eligible for garbage collection**.

Important:

```text
Eligible for GC
      ≠
Immediately deleted
```

The JVM decides when/how to reclaim memory.

---

# 22. GC Roots

Garbage collection uses reachability from roots.

Examples of roots can include:

- Active thread references
- Local references in active frames
- Static references
- JNI references

If an object cannot be reached from GC roots, it may become unreachable and reclaimable.

---

# 23. Garbage Collection Does NOT Guarantee No Memory Problems

Java applications can still suffer from:

- Memory leaks caused by retained references
- Huge collections
- Unbounded caches
- Large allocations
- Native-memory exhaustion
- Out-of-memory errors

Garbage collection automates memory reclamation; it does not fix poor memory design.

---

# 24. `OutOfMemoryError` vs `StackOverflowError`

### OutOfMemoryError

Can occur when the JVM cannot satisfy a memory allocation request.

### StackOverflowError

Can occur when a thread exhausts its stack, often due to uncontrolled recursion.

```java
static void recurse() {
    recurse();
}
```

---

# 25. Java Memory Model (JMM)

The **Java Memory Model** defines important rules for how threads interact with memory.

It deals with:

```text
Visibility
Ordering
Atomicity
Happens-before relationships
```

Important tools:

```text
synchronized
volatile
final
Lock
Atomic classes
Concurrent collections
```

---

# 26. `volatile`

`volatile` mainly provides visibility and certain ordering guarantees.

Example:

```java
private volatile boolean running = true;
```

It does **not** make every multi-step operation atomic.

For example:

```java
count++;
```

is not automatically atomic.

---

# 27. `synchronized`

`synchronized` can provide mutual exclusion and memory-visibility guarantees.

```java
synchronized void increment() {
    count++;
}
```

or:

```java
synchronized (lock) {
    count++;
}
```

---

# 28. Java Versioning and LTS

Java uses a time-based release model.

As of October 2026:

```text
JDK 27 → latest Java SE release
JDK 25 → latest LTS release
JDK 26 → previous non-LTS release
```

Common LTS generations:

```text
8
11
17
21
25
```

LTS means **Long-Term Support**.

Organizations often standardize production systems around LTS releases.

---

# 29. Version Compatibility

Suppose a newer JDK produces a class file and an older JVM tries to run it.

The older JVM may reject the class with:

```text
UnsupportedClassVersionError
```

General idea:

```text
Newer class-file version
        ↓
Older JVM
        ↓
May fail
```

You can often target an older Java release with:

```bash
javac --release 21 Main.java
```

Use a release supported by your installed compiler.

---

# 30. Preview Features

Java sometimes introduces features as **preview features** before finalizing them.

Conceptually:

```bash
javac --enable-preview --release XX Main.java
java --enable-preview Main
```

Use the exact release/options supported by your JDK.

---

# 31. Java Environment Variables

## JAVA_HOME

Usually points to the JDK installation directory.

Example:

```text
C:\Program Files\Java\jdk-26.0.2
```

## PATH

Contains directories searched by the shell for executables such as:

```text
java
javac
jar
```

## CLASSPATH

Can define where Java tools search for classes/libraries, although explicit `-cp`/`--class-path` settings are generally clearer for projects.

---

# 32. Useful Version Commands

```bash
java --version
javac --version
```

### Windows

```powershell
where.exe java
where.exe javac
Get-Command java
Get-Command javac
```

### Linux/macOS

```bash
which java
which javac
```

---

# 33. PATH vs JAVA_HOME

`JAVA_HOME` answers:

> Where is the JDK installed?

`PATH` answers:

> Which executable directories should the shell search?

Example:

```text
JAVA_HOME=C:\Program Files\Java\jdk-26.0.2
```

and PATH contains:

```text
%JAVA_HOME%\bin
```

---

# 34. Packages

A package organizes related classes.

```java
package com.example.app;

public class Main {
}
```

Typical folder structure:

```text
com/
└── example/
    └── app/
        └── Main.java
```

Fully qualified class name:

```text
com.example.app.Main
```

---

# 35. `import`

`import` lets you use a type without repeatedly writing its fully qualified name.

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
```

`import` does not copy or download the class. It only affects name resolution in source code.

---

# 36. Class Path

The class path tells Java where to search for classes and libraries.

Example:

```bash
java -cp out com.example.Main
```

Multiple entries use platform-specific separators:

```text
Windows  → ;
Linux/macOS → :
```

Example on Windows:

```bash
java -cp "out;lib\app.jar" com.example.Main
```

---

# 37. `javac -d`

`-d` sets the class-file output directory.

```bash
javac -d out src/com/example/Main.java
```

Result:

```text
out/
└── com/
    └── example/
        └── Main.class
```

---

# 38. Java Modules

Java 9 introduced the Java Platform Module System (JPMS).

A module declares dependencies and exported packages explicitly.

Example:

```java
module com.example.app {
    requires java.sql;
    exports com.example.app.api;
}
```

Common module keywords:

```text
requires
exports
opens
uses
provides
```

---

# 39. Classpath vs Module Path

Traditional Java projects commonly use the **classpath**.

Modular projects can use the **module path**.

```text
Classpath → classes/JARs without explicit module boundaries
Module path → named Java modules
```

Example:

```bash
java --module-path mods \
     --module com.example.app/com.example.Main
```

---

# 40. JAR Files

**JAR = Java ARchive**.

A JAR is an archive that can contain:

- `.class` files
- Resources
- Metadata
- Manifest
- Configuration files

Create a JAR:

```bash
jar --create --file app.jar -C out .
```

Run an executable JAR:

```bash
java -jar app.jar
```

The manifest can identify the main class:

```text
Main-Class: com.example.Main
```

---

# 41. Important JDK Tools

| Tool | Purpose |
|---|---|
| `java` | Launch Java applications |
| `javac` | Compile Java source |
| `jar` | Create/manage JAR archives |
| `javap` | Inspect/disassemble class files |
| `javadoc` | Generate HTML API documentation |
| `jshell` | Interactive Java shell |
| `jdb` | Command-line debugger |
| `jcmd` | JVM diagnostic commands |
| `jconsole` | JVM monitoring/management UI |
| `jdeps` | Dependency analysis |
| `jlink` | Build custom runtime images |
| `jpackage` | Create application packages |
| `keytool` | Manage keys/certificates |
| `jarsigner` | Sign/verify JARs |

---

# 42. `javap`

Inspect a class:

```bash
javap Main
```

Show bytecode instructions:

```bash
javap -c Main
```

This is useful for learning how Java source turns into JVM instructions.

---

# 43. `jshell`

`jshell` is Java's interactive REPL.

```bash
jshell
```

Example:

```text
jshell> int x = 10;
jshell> x * 2
$2 ==> 20
```

Useful for API experiments and quick tests.

---

# 44. `javadoc`

`javadoc` generates documentation from Java source and documentation comments.

```java
/**
 * Calculates the square.
 * @param n input value
 * @return n squared
 */
static int square(int n) {
    return n * n;
}
```

Run:

```bash
javadoc MyClass.java
```

---

# 45. `jdeps`, `jlink`, `jpackage`

### `jdeps`

Analyzes dependencies of classes/JARs.

```bash
jdeps app.jar
```

### `jlink`

Builds a custom runtime image from modules.

```text
Application
   + required Java modules
   + dependencies
   ↓
Custom runtime image
```

### `jpackage`

Creates platform-specific application packages/installers.

---

# 46. Java Language Basics

Core syntax areas:

```text
Variables
Data types
Operators
Conditions
Loops
Methods
Arrays
Strings
Classes
Objects
```

Example:

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
}
```

---

# 47. Primitive Data Types

Java has eight primitive types:

| Type | Purpose |
|---|---|
| `byte` | Small integer |
| `short` | Small integer |
| `int` | General integer |
| `long` | Large integer |
| `float` | Single precision floating-point |
| `double` | Double precision floating-point |
| `char` | UTF-16 code unit |
| `boolean` | `true` / `false` |

Examples:

```java
int count = 10;
long population = 8_000_000_000L;
double price = 99.99;
char grade = 'A';
boolean active = true;
```

---

# 48. Reference Types

Examples:

```text
String
Arrays
Classes
Interfaces
Enums
Records
Collections
```

Example:

```java
String name = "Java";
```

`String` is a class, not a primitive type.

---

# 49. Wrapper Classes

| Primitive | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

---

# 50. Autoboxing and Unboxing

Autoboxing:

```java
Integer x = 10;
```

Conceptually:

```text
int → Integer
```

Unboxing:

```java
Integer x = 10;
int y = x;
```

Conceptually:

```text
Integer → int
```

---

# 51. Strings

Strings are objects and are **immutable**.

```java
String text = "Hello";
```

Methods commonly include:

```text
length()
charAt()
substring()
toUpperCase()
toLowerCase()
replace()
contains()
equals()
equalsIgnoreCase()
trim()
concat()
```

Most String operations return a new String rather than changing the existing one.

---

# 52. `==` vs `equals()`

For primitives:

```java
a == b
```

compares values.

For object references:

```java
a == b
```

checks reference identity.

For object content/logical equality, classes commonly use:

```java
a.equals(b)
```

Example:

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // typically false
System.out.println(a.equals(b));  // true
```

---

# 53. `null`

`null` means a reference currently refers to no object.

```java
String name = null;
```

Do not confuse `null` with:

```text
""
0
false
```

Using a null reference incorrectly can cause `NullPointerException`.

---

# 54. Methods

A method is a reusable block of code.

```java
static int add(int a, int b) {
    return a + b;
}
```

Method overloading:

```java
void print(int x) { }
void print(String x) { }
void print(int x, int y) { }
```

Return type alone cannot distinguish overloaded methods.

---

# 55. Control Flow

Java supports:

```text
if / else
switch
for
while
do-while
enhanced for
break
continue
return
```

Enhanced switch example:

```java
switch (day) {
    case 1, 2, 3 -> System.out.println("Weekday");
    default -> System.out.println("Other");
}
```

---

# 56. Arrays

Arrays have fixed length.

```java
int[] values = {10, 20, 30};
```

Access:

```java
values[0]
```

Length:

```java
values.length
```

Indexes start at `0`.

---

# 57. Multidimensional Arrays

Java multidimensional arrays are arrays of arrays.

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

---

# 58. OOP — Core Concepts

```text
Class
Object
Constructor
Encapsulation
Inheritance
Polymorphism
Abstraction
Composition
Aggregation
```

---

# 59. Class and Object

A class defines a type.

```java
class Student {
    String name;

    void study() {
        System.out.println("Studying");
    }
}
```

An object is an instance:

```java
Student s = new Student();
```

---

# 60. Constructor

A constructor initializes an object.

```java
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }
}
```

Constructor rules:

- Same name as class
- No return type
- Called during object creation
- Can be overloaded
- Can call `this(...)`
- Can call `super(...)`

---

# 61. Encapsulation

Encapsulation means controlling access to internal state.

```java
class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

---

# 62. Inheritance

Inheritance lets a subclass derive from a parent class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
```

Java class inheritance supports:

```text
Single
Multilevel
Hierarchical
```

Java does not allow a class to extend multiple classes. Multiple interfaces can be implemented by one class.

---

# 63. `super`

`super` refers to the immediate parent-class portion.

Uses:

```text
super(...)
super.field
super.method()
```

`super(...)` must be the first statement in a constructor when used explicitly.

---

# 64. Method Overriding

A subclass can provide a specialized implementation of an inherited instance method.

```java
class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

# 65. Abstraction

Abstraction hides implementation details and exposes essential behavior.

Java uses:

```text
abstract classes
interfaces
```

Example:

```java
abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Shape");
    }
}
```

An abstract class cannot be instantiated directly.

A concrete subclass must implement inherited abstract methods unless it is also abstract.

---

# 66. Interface

An interface defines a contract.

```java
interface Flyable {
    void fly();
}
```

Implementation:

```java
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
```

A class can implement multiple interfaces.

---

# 67. Polymorphism

A superclass/interface reference can refer to different concrete object types.

```java
Animal a = new Dog();
Animal b = new Cat();
```

The overridden instance method can be selected dynamically at runtime.

---

# 68. `toString()`, `equals()`, `hashCode()`

All Java classes ultimately inherit from `Object`.

### `toString()`

Returns a String representation of an object.

### `equals()`

Defines logical equality when overridden appropriately.

### `hashCode()`

Provides a hash value. If:

```java
a.equals(b)
```

is true, then:

```java
a.hashCode() == b.hashCode()
```

must also be true.

This matters for hash-based collections.

---

# 69. Composition and Aggregation

Both are **has-a** relationships.

### Composition

Strong ownership/lifecycle relationship.

```java
class Computer {
    private Processor processor;
}
```

### Aggregation

A weaker relationship where the contained object can exist independently.

These are design concepts, not Java keywords.

---

# 70. Access Modifiers

```text
public
protected
package-private (default)
private
```

| Modifier | Same class | Same package | Subclass | Everywhere |
|---|---:|---:|---:|---:|
| `private` | Yes | No | No | No |
| default | Yes | Yes | Package rules | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

---

# 71. `static`

`static` makes a member belong to the class rather than to an individual object.

```java
class Counter {
    static int count;
}
```

Access:

```java
Counter.count
```

A static method can directly access static members, but cannot directly access an instance field without an object/reference.

---

# 72. `final`

`final` can be used with:

- Variables
- Methods
- Classes

```java
final int MAX = 100;
```

A final variable cannot be reassigned.

A final method cannot be overridden.

A final class cannot be subclassed.

---

# 73. Collections Framework

Important interfaces/classes:

```text
Collection
List
Set
Queue
Deque
Map
ArrayList
LinkedList
HashSet
LinkedHashSet
TreeSet
PriorityQueue
HashMap
LinkedHashMap
TreeMap
ArrayDeque
```

---

# 74. `ArrayList`

Resizable array-backed list.

```java
ArrayList<String> names = new ArrayList<>();
names.add("A");
names.add("B");
```

Access:

```java
names.get(0);
```

---

# 75. `LinkedList`

A linked data structure that also implements `Deque`.

```java
LinkedList<Integer> values = new LinkedList<>();
```

Do not assume it is automatically faster than `ArrayList`; choose based on the access/update pattern.

---

# 76. `HashSet`

Stores unique elements.

```java
HashSet<String> tags = new HashSet<>();
tags.add("Java");
tags.add("Java");
```

Duplicate values are not stored as separate set elements.

---

# 77. `HashMap`

Stores key-value pairs.

```java
HashMap<String, Integer> marks = new HashMap<>();
marks.put("Math", 90);
marks.put("Physics", 85);
```

Access:

```java
marks.get("Math");
```

---

# 78. `TreeMap`, `LinkedHashMap`, `TreeSet`

```text
HashMap      → hash-based mapping
LinkedHashMap→ predictable iteration order
TreeMap      → sorted keys

HashSet      → unique hash-based elements
TreeSet      → sorted unique elements
```

---

# 79. Queue, Deque, Stack, PriorityQueue

### Queue

Commonly FIFO:

```text
First In, First Out
```

### Deque

Double-ended queue.

```java
Deque<Integer> deque = new ArrayDeque<>();
```

A deque can also be used as a stack:

```text
push()
pop()
peek()
```

### PriorityQueue

Removes elements according to their ordering/priority rather than ordinary FIFO order.

---

# 80. Generics

Generics provide compile-time type parameterization.

```java
ArrayList<String> names = new ArrayList<>();
```

Custom generic class:

```java
class Box<T> {
    T value;
}
```

Use:

```java
Box<Integer> box = new Box<>();
```

Wildcards:

```text
?            → unknown type
? extends T  → subtype of T
? super T    → supertype of T
```

---

# 81. Exceptions

Exceptions represent abnormal conditions during execution.

Common examples:

```text
NullPointerException
ArithmeticException
NumberFormatException
ArrayIndexOutOfBoundsException
IllegalArgumentException
IOException
SQLException
```

---

# 82. Exception Hierarchy

Simplified:

```text
Throwable
├── Error
└── Exception
    └── RuntimeException
```

`Error` typically represents serious runtime/JVM conditions.

`RuntimeException` is unchecked.

Many other `Exception` subclasses are checked exceptions.

---

# 83. Checked vs Unchecked Exceptions

### Checked

The compiler requires checked exceptions to be handled or declared.

Examples:

```text
IOException
SQLException
```

### Unchecked

Subclasses of `RuntimeException`.

Examples:

```text
NullPointerException
IllegalArgumentException
ArithmeticException
```

---

# 84. `try`, `catch`, `finally`

```java
try {
    riskyOperation();
}
catch (Exception e) {
    System.out.println(e.getMessage());
}
finally {
    // cleanup/final actions
}
```

Catch specific exceptions when possible instead of catching everything blindly.

---

# 85. `throw` vs `throws`

### `throw`

Actually throws an exception:

```java
throw new IllegalArgumentException("Invalid value");
```

### `throws`

Declares a method may propagate exceptions:

```java
void readFile() throws IOException {
}
```

---

# 86. Try-with-Resources

For `AutoCloseable` resources:

```java
try (FileReader reader = new FileReader("data.txt")) {
    // use reader
}
```

The resource is automatically closed.

---

# 87. File I/O

Important APIs:

```text
java.io
java.nio
java.nio.file
```

Modern file handling commonly uses:

```java
Path path = Path.of("data.txt");
String text = Files.readString(path);
```

and:

```java
Files.writeString(path, "Hello");
```

---

# 88. Date and Time

Modern Java uses `java.time`.

Important types:

```text
LocalDate
LocalTime
LocalDateTime
Instant
ZonedDateTime
OffsetDateTime
Duration
Period
DateTimeFormatter
```

---

# 89. Regular Expressions

Java provides:

```text
Pattern
Matcher
```

Example:

```java
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher("123");
```

---

# 90. Functional Interfaces

An interface with one abstract method can be used as a functional interface.

Common examples:

```text
Runnable
Comparator
Predicate
Function
Consumer
Supplier
```

---

# 91. Lambda Expressions

Example:

```java
(x, y) -> x + y
```

Lambdas provide concise implementations for compatible functional interfaces.

---

# 92. Method References

Example:

```java
System.out::println
```

This can act as a concise form when the target functional interface matches.

---

# 93. Streams

Streams provide pipelines for processing data.

Common operations:

```text
filter
map
sorted
distinct
limit
collect
reduce
```

Example:

```java
List<Integer> result =
        numbers.stream()
               .filter(x -> x > 10)
               .toList();
```

A Stream is not a collection itself.

---

# 94. Optional

`Optional<T>` can model a value that may be absent.

```java
Optional<String> name = Optional.of("Java");
```

It can improve API clarity when absence is a meaningful result.

---

# 95. Enums

Enums represent a fixed set of named constants.

```java
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}
```

Enums can also have fields, constructors, methods, and interfaces.

---

# 96. Records

Records are concise data-oriented classes.

```java
record User(String name, int age) {
}
```

Record semantics include generated members such as:

```text
canonical constructor
accessor methods
equals()
hashCode()
toString()
```

---

# 97. Sealed Classes

Sealed types restrict which classes/interfaces can directly extend or implement them.

```java
sealed interface Shape
        permits Circle, Rectangle {
}
```

Useful when the set of permitted subtypes is intentionally controlled.

---

# 98. `instanceof` and Pattern Matching

Basic form:

```java
if (obj instanceof String) {
    System.out.println("String");
}
```

Modern Java also supports pattern-matching forms that can bind the matched variable directly.

---

# 99. Annotations

Annotations provide metadata.

Common examples:

```java
@Override
@Deprecated
@FunctionalInterface
```

Frameworks use custom annotations extensively.

Annotations can be processed at:

```text
compile time
build time
runtime
```

---

# 100. Reflection

Reflection lets programs inspect classes and members dynamically.

Common reflection types:

```text
Class
Method
Field
Constructor
```

Example:

```java
Class<?> type = String.class;
```

Reflection is powerful but can increase complexity and interacts with module/access rules.

---

# 101. Nested and Anonymous Classes

Java supports:

```text
Static nested classes
Inner classes
Local classes
Anonymous classes
```

Anonymous class example:

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running");
    }
};
```

Lambdas can often replace anonymous classes when the target is a functional interface.

---

# 102. Pass-by-Value

Java is **always pass-by-value**.

For primitive arguments:

```text
copy of the primitive value
```

For object arguments:

```text
copy of the reference value
```

So Java does **not** technically use pass-by-reference.

---

# 103. Immutability

An immutable object cannot be changed after construction.

Examples include:

```text
String
Integer
LocalDate
```

Immutability often helps with:

- Thread safety
- Reasoning about state
- Caching
- API design

---

# 104. Wrapper: `Integer` vs `int`

```java
int a = 10;
Integer b = 10;
```

`int` is primitive.

`Integer` is an object.

Collections use objects, which is why generics commonly use:

```java
ArrayList<Integer>
```

instead of:

```java
ArrayList<int>
```

---

# 105. Concurrency

Important Java concurrency tools include:

```text
Thread
Runnable
Callable
ExecutorService
Future
CompletableFuture
synchronized
volatile
Lock
Atomic*
ConcurrentHashMap
BlockingQueue
```

---

# 106. Thread

Basic example:

```java
Thread t = new Thread(() -> {
    System.out.println("Running");
});

t.start();
```

Important:

```text
start() → starts thread execution
run()   → ordinary method call if invoked directly
```

---

# 107. ExecutorService

For many tasks, executors are often preferable to manually creating threads.

```java
ExecutorService executor =
        Executors.newFixedThreadPool(4);

executor.submit(() -> {
    System.out.println("Work");
});

executor.shutdown();
```

---

# 108. CompletableFuture

`CompletableFuture` supports asynchronous computation and composition.

Common methods include:

```text
supplyAsync
thenApply
thenAccept
thenCompose
thenCombine
exceptionally
handle
```

---

# 109. Virtual Threads

Modern Java supports lightweight **virtual threads**.

They are useful for high-concurrency, often I/O-heavy workloads such as:

```text
HTTP requests
Database waits
Network I/O
```

Virtual threads do not automatically make CPU-heavy algorithms faster.

---

# 110. Race Conditions

A race condition occurs when correctness depends on uncontrolled timing between threads.

Example concept:

```text
Thread A reads count = 10
Thread B reads count = 10
Thread A writes 11
Thread B writes 11
```

Expected result may have been `12`, but one update was lost.

---

# 111. Deadlock

Deadlock occurs when threads wait indefinitely for resources held by each other.

```text
Thread A owns Lock 1
Thread B owns Lock 2

A waits for Lock 2
B waits for Lock 1
```

Prevent through careful lock ordering and limited lock scope.

---

# 112. Atomic Classes

Examples:

```text
AtomicInteger
AtomicLong
AtomicBoolean
AtomicReference
```

They provide atomic operations useful in concurrent applications.

---

# 113. Concurrent Collections

Examples:

```text
ConcurrentHashMap
CopyOnWriteArrayList
BlockingQueue
ConcurrentLinkedQueue
```

Use the collection that fits the actual concurrency pattern.

---

# 114. JDBC

**JDBC = Java Database Connectivity**.

Typical flow:

```text
Java application
      ↓
JDBC API
      ↓
JDBC driver
      ↓
Database
```

Common relational databases:

```text
MySQL
PostgreSQL
Oracle Database
SQL Server
SQLite
```

---

# 115. JDBC Basic Flow

```text
Get Connection
     ↓
Prepare SQL
     ↓
Execute
     ↓
Read ResultSet / affected rows
     ↓
Close resources
```

Modern code commonly uses try-with-resources.

---

# 116. PreparedStatement

Prefer parameterized SQL rather than string concatenation when handling user input.

```java
PreparedStatement ps =
    connection.prepareStatement(
        "SELECT * FROM users WHERE id = ?"
    );

ps.setInt(1, id);
```

This helps prevent SQL injection caused by unsafe string construction.

---

# 117. HTTP and Networking

Modern Java provides `java.net.http` APIs.

Important classes include:

```text
HttpClient
HttpRequest
HttpResponse
```

Java also provides lower-level networking APIs for sockets and other protocols.

---

# 118. JSON

JSON is not part of the Java language itself.

Java applications often use libraries such as:

```text
Jackson
Gson
JSON-B implementations
```

These are external ecosystem libraries.

---

# 119. Logging

Production applications normally use logging frameworks rather than relying only on `System.out.println()`.

Common options:

```text
java.util.logging
SLF4J
Logback
Log4j 2
```

Common concepts:

```text
TRACE
DEBUG
INFO
WARN
ERROR
```

---

# 120. Build Tools

The two most common Java build/dependency tools are:

```text
Maven
Gradle
```

They can automate:

- Compilation
- Tests
- Dependencies
- Packaging
- Plugins
- Documentation
- Publishing

---

# 121. Maven

Maven commonly uses:

```text
pom.xml
```

Common commands:

```bash
mvn clean
mvn compile
mvn test
mvn package
```

---

# 122. Gradle

Gradle commonly uses:

```text
build.gradle
build.gradle.kts
```

Common commands:

```bash
gradle build
gradle test
```

The Gradle wrapper is preferred for reproducible project builds:

```bash
./gradlew build
```

Windows:

```powershell
.\gradlew.bat build
```

---

# 123. Dependency Management

A dependency can itself have dependencies:

```text
Your App
   ↓
Library A
   ↓
Library B
   ↓
Library C
```

This is called a dependency graph.

Build tools manage downloading/resolving these dependencies, but you should still review:

```text
Versions
Security vulnerabilities
Licenses
Transitive dependencies
Compatibility
```

---

# 124. Testing

Common Java testing technologies:

```text
JUnit
TestNG
Mockito
AssertJ
```

Testing levels can include:

```text
Unit
Integration
End-to-end
Performance
```

---

# 125. Debugging

A typical debugging workflow:

```text
Run
 ↓
Observe failure
 ↓
Set breakpoint
 ↓
Inspect variables
 ↓
Step through
 ↓
Find cause
 ↓
Fix
 ↓
Test again
```

IDEs often provide a much easier debugger UI than command-line debugging tools.

---

# 126. IDE vs JDK

## JDK

Provides:

```text
Compiler
Runtime
Tools
APIs
```

## IDE / Editor

Provides features such as:

```text
Code editing
Autocomplete
Refactoring
Debugger UI
Project navigation
Testing integration
```

An IDE is not a replacement for the JDK.

---

# 127. Common IDEs/Editors

```text
IntelliJ IDEA
Eclipse
NetBeans
VS Code
```

The Java extension ecosystem can add language support to editors such as VS Code.

---

# 128. Java Project Structure

Typical Maven-style project:

```text
project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

Gradle projects often use a similar source layout with `build.gradle`/`build.gradle.kts`.

---

# 129. Naming Conventions

### Classes

```java
BankAccount
FoodOrder
StudentRecord
```

PascalCase.

### Methods/variables

```java
calculateTotal()
studentName
```

camelCase.

### Constants

```java
MAX_SIZE
DEFAULT_TIMEOUT
```

UPPER_SNAKE_CASE.

### Packages

```text
com.example.app
```

Usually lowercase.

---

# 130. Public Class and File Name

If a source file contains:

```java
public class Student {
}
```

the normal file name is:

```text
Student.java
```

A source file can contain other package-private top-level classes, but only one public top-level class can match the file name.

---

# 131. Comments

Single-line:

```java
// comment
```

Multi-line:

```java
/*
   comment
*/
```

Documentation comments:

```java
/**
 * API documentation.
 */
```

---

# 132. Assertions

Java supports assertions:

```java
assert value >= 0;
```

They are disabled by default in normal execution unless enabled.

Enable:

```bash
java -ea Main
```

Assertions are mainly for programming assumptions and testing/development.

---

# 133. Common Console Output

```java
System.out.print("Hello");
System.out.println("Hello");
System.out.printf("Value: %.2f", value);
```

Error/diagnostic output can use:

```java
System.err.println("Error");
```

---

# 134. Scanner Input

```java
Scanner scanner = new Scanner(System.in);

int age = scanner.nextInt();
scanner.nextLine();
String name = scanner.nextLine();
```

A common issue is calling `nextLine()` immediately after `nextInt()`/`nextDouble()` without consuming the pending line separator.

---

# 135. Compile-Time, Runtime, and Logic Errors

## Compile-time error

The compiler rejects the program.

```java
int x = "Hello";
```

## Runtime error/exception

The program compiles but fails while executing.

```java
int x = 10 / 0;
```

## Logical error

The program runs but gives the wrong answer.

---

# 136. Common Exceptions

```text
NullPointerException
ArrayIndexOutOfBoundsException
StringIndexOutOfBoundsException
NumberFormatException
ArithmeticException
ClassCastException
IllegalArgumentException
```

Learn the likely cause rather than simply catching every exception.

---

# 137. Casting

Primitive conversion:

```java
double value = 10.5;
int x = (int) value;
```

Result:

```text
10
```

Object reference casting must also respect inheritance/type compatibility.

---

# 138. Upcasting and Downcasting

Upcasting:

```java
Animal a = new Dog();
```

Usually safe because a `Dog` is an `Animal`.

Downcasting:

```java
Dog d = (Dog) a;
```

Only safe if the runtime object really is a `Dog`.

Use `instanceof` when appropriate.

---

# 139. Java Pass-by-Value

Java is always pass-by-value.

Example idea:

```java
void change(User user) {
    user.name = "New";
}
```

The method receives a copy of the reference value, but both the caller and callee can refer to the same object.

---

# 140. Object Lifecycle

Simplified:

```text
Class loaded
    ↓
Object created
    ↓
Constructor executed
    ↓
Object used
    ↓
Object becomes unreachable
    ↓
Eligible for GC
    ↓
Memory may be reclaimed
```

---

# 141. Static Initialization

A static initializer:

```java
static {
    // class-level initialization
}
```

runs during class initialization according to Java initialization rules.

Use static initialization deliberately; clear constructors/factory methods are often easier to understand.

---

# 142. Factory Methods

A class may provide a method that creates instances:

```java
class User {
    static User createGuest() {
        return new User();
    }
}
```

Factory methods can centralize creation rules and improve readability.

---

# 143. Java and Native Code — JNI

**JNI = Java Native Interface**.

JNI lets Java interact with native code, commonly C/C++.

Possible uses:

- Existing native libraries
- OS integration
- Hardware access
- Native APIs

Downside:

```text
more complexity
more platform dependence
```

---

# 144. Portability Rules

For portable code, prefer Java APIs such as:

```java
Path.of(...)
Files.readString(...)
```

instead of hard-coding OS-specific paths or commands.

Also consider:

```text
File permissions
Character encoding
Line endings
Locale
Time zones
Native libraries
```

---

# 145. Character Encoding

When a file/protocol requires a specific encoding, specify it explicitly.

Example:

```java
Files.readString(path, StandardCharsets.UTF_8);
```

This avoids accidental dependence on environment-specific assumptions.

---

# 146. Locale and Time Zone

Locale can affect formatting and text behavior.

Global applications should distinguish between:

```text
LocalDateTime
Instant
OffsetDateTime
ZonedDateTime
```

An `Instant` represents a point on the global timeline, while a local date/time does not necessarily identify one instant by itself.

---

# 147. JVM Implementations

The JVM is a specification concept; multiple implementations exist.

Examples include:

```text
HotSpot
OpenJ9
GraalVM-based runtimes
```

Different JVMs can have different implementation details and optimizations while implementing the required Java platform behavior.

---

# 148. OpenJDK and JDK Distributions

Java is an ecosystem rather than one single vendor binary.

OpenJDK is the open-source Java development project.

JDK distributions are provided by multiple organizations, for example:

```text
Oracle
Eclipse Adoptium
Amazon Corretto
Microsoft
Azul
BellSoft
```

Licensing, support, update timelines, and included components can differ by distribution/version.

Always check the exact vendor/version for production use.

---

# 149. Java Licensing

Java does not have one universal license for every binary distribution.

Examples:

- OpenJDK releases are available under GPLv2 with the Classpath Exception.
- Oracle JDK releases have Oracle-specific licensing terms.
- Other vendors publish their own JDK distributions and terms.

For production, check the exact JDK distribution and version license.

---

# 150. Performance

Do not optimize based on guesses.

A good process is:

```text
Measure
  ↓
Find bottleneck
  ↓
Optimize
  ↓
Measure again
```

Possible bottlenecks:

```text
CPU
Memory allocation
Garbage collection
I/O
Database queries
Network latency
Locks
Algorithms
```

---

# 151. JVM Memory Options

Common options include:

```bash
-Xms256m
-Xmx1g
-Xss1m
```

Example:

```bash
java -Xms256m -Xmx1g Main
```

`-Xmx` controls the maximum Java heap size. JVM processes also use memory outside the heap.

---

# 152. Garbage Collectors

HotSpot provides multiple collectors, including:

```text
Serial
Parallel
G1
ZGC
```

Other JVM distributions may provide additional collectors or different implementations.

Collector choice depends on:

```text
latency goals
throughput goals
memory limits
allocation pattern
application workload
```

---

# 153. Profiling

Useful Java/JVM diagnostics include:

```text
Java Flight Recorder (JFR)
JDK Mission Control (JMC)
jcmd
jconsole
other profilers
```

You can investigate:

```text
CPU hotspots
Memory usage
GC behavior
Thread activity
Locks
I/O
Latency
```

---

# 154. Java Flight Recorder

**JFR = Java Flight Recorder**.

It records JVM/application events such as:

- CPU activity
- Threads
- Garbage collection
- Locks
- I/O
- Class loading
- Exceptions

JMC can be used to inspect recordings.

---

# 155. Clean Code Principles

Useful Java development principles:

```text
Meaningful names
Small focused methods
Low duplication
Encapsulation
Separation of concerns
Clear error handling
Tests
Consistent formatting
```

Avoid:

```text
Huge methods
Global mutable state
Deep nesting
Magic numbers
Unnecessary inheritance
Duplicate logic
```

---

# 156. SOLID

```text
S — Single Responsibility Principle
O — Open/Closed Principle
L — Liskov Substitution Principle
I — Interface Segregation Principle
D — Dependency Inversion Principle
```

These are design principles, not Java language features.

---

# 157. Common Design Patterns

Common patterns in Java codebases include:

```text
Factory
Builder
Strategy
Observer
Adapter
Decorator
Facade
Command
Repository
MVC
Dependency Injection
```

Patterns should solve real design problems rather than be added for decoration.

---

# 158. Java Backend Ecosystem

A common backend stack is:

```text
Java
  ↓
Spring Boot
  ↓
REST API
  ↓
JPA/Hibernate
  ↓
PostgreSQL/MySQL
```

Other Java technologies exist, including Jakarta EE and many specialized frameworks.

---

# 159. Spring

Spring is not part of core Java, but it is a major Java ecosystem.

Common areas:

```text
Spring Boot
Spring MVC
Spring Web
Spring Data
Spring Security
Spring Cloud
```

It heavily uses dependency injection.

---

# 160. Dependency Injection

Instead of creating every dependency internally:

```java
class Service {
    private final Repository repository;

    Service(Repository repository) {
        this.repository = repository;
    }
}
```

The dependency is supplied from outside.

This often improves:

```text
testability
flexibility
separation of concerns
```

---

# 161. ORM

**ORM = Object-Relational Mapping**.

ORM maps Java objects to relational database structures.

Common technologies:

```text
JPA
Hibernate
```

JPA is a specification; Hibernate is a common implementation.

---

# 162. Deployment Formats

Java applications can be deployed as:

```text
.class files
JAR files
WAR files
custom runtime images
containers
OS application packages
native images using supporting technologies
```

---

# 163. Containers

Typical deployment flow:

```text
Java source
   ↓
Build
   ↓
JAR
   ↓
Container image
   ↓
Docker/container runtime
   ↓
Cloud/server
```

---

# 164. WAR

**WAR = Web Application Archive**.

It has historically been used to deploy Java web applications to servlet containers/application servers.

Modern Spring Boot applications commonly use executable JARs instead, although WAR deployment remains possible.

---

# 165. CI/CD

Java projects commonly automate:

```text
Build
Test
Lint/checks
Security scans
Package
Publish
Deploy
```

Common tools/services include:

```text
GitHub Actions
GitLab CI
Jenkins
Azure Pipelines
CircleCI
```

---

# 166. Git + Java

Typical repository:

```text
project/
├── src/
├── pom.xml / build.gradle
├── .gitignore
└── README.md
```

Do not normally commit generated output such as:

```text
*.class
target/
build/
```

unless there is a deliberate reason.

---

# 167. A Good `.gitignore` Starting Point

```gitignore
*.class
target/
build/
.idea/
*.iml
```

Add or remove entries according to your project/IDE.

---

# 168. One Complete Java Example

Source:

```java
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

Structure:

```text
src/
└── com/
    └── example/
        └── Main.java
```

Compile:

```bash
javac -d out src/com/example/Main.java
```

Output:

```text
out/
└── com/
    └── example/
        └── Main.class
```

Run:

```bash
java -cp out com.example.Main
```

Execution:

```text
Main.java
   ↓
javac
   ↓
Main.class
   ↓
java launcher
   ↓
JVM
   ↓
Class Loader
   ↓
Verification / Linking / Initialization
   ↓
main()
   ↓
Interpreter / JIT
   ↓
Native execution
```

---

# 169. Same `.class` File on Multiple OSes

Assume you have:

```text
Main.class
```

The bytecode can commonly be copied to:

```text
Windows machine
Linux machine
macOS machine
```

Each platform provides a compatible JVM:

```text
                Main.class
                    |
        ---------------------------
        |            |            |
   Windows JVM   Linux JVM    macOS JVM
        |            |            |
        v            v            v
      Native       Native       Native
       code         code         code
```

The JVM abstracts the operating system and CPU differences.

---

# 170. What Can Break Cross-Platform Execution?

Examples:

```text
Native DLL/SO/DYLIB dependencies
OS-specific shell commands
Hard-coded Windows paths
Registry access
Linux-only utilities
Architecture-specific binaries
File permissions
External service configuration
JDK/runtime incompatibility
```

So:

```text
Portable bytecode
≠
Every application is automatically portable
```

---

# 171. Important Command Cheat Sheet

```bash
# Version
java --version
javac --version

# Compile
javac Main.java

# Compile into output directory
javac -d out Main.java

# Run
java Main

# Run with classpath
java -cp out Main

# Run a packaged JAR
java -jar app.jar

# Run source directly
java Main.java

# Start interactive shell
jshell

# Inspect class
javap Main

# Show bytecode
javap -c Main

# Generate documentation
javadoc Main.java

# Create JAR
jar --create --file app.jar -C out .

# Analyze dependencies
jdeps app.jar

# JVM diagnostics
jcmd <PID>

# JVM monitor
jconsole
```

---

# 172. Important Mental Model #1 — Source to CPU

```text
.java
  ↓
Compiler (javac)
  ↓
.class bytecode
  ↓
Class Loader
  ↓
JVM
  ↓
Interpreter / JIT
  ↓
Native machine instructions
  ↓
CPU
```

---

# 173. Important Mental Model #2 — Java Platform

```text
Your application
       ↓
Java language + Java SE APIs
       ↓
JVM
       ↓
Operating System
       ↓
Hardware
```

---

# 174. Important Mental Model #3 — JDK

```text
JDK
├── javac       → compile
├── java        → run
├── jar         → package
├── javap       → inspect bytecode
├── javadoc     → documentation
├── jshell      → REPL
├── jdb         → debugger
├── jcmd        → diagnostics
├── jconsole    → monitoring
├── jdeps       → dependencies
├── jlink       → custom runtime
└── jpackage    → application packaging
```

---

# 175. Important Mental Model #4 — JVM Memory

```text
JVM
├── Heap
│    └── Objects / arrays
├── JVM Stacks
│    └── Per-thread frames
├── Method Area
│    └── Class-level metadata (logical JVM area)
├── Runtime Constant Pool
├── PC state
└── Native-related memory
```

---

# 176. Common Misconceptions

### "Java is only interpreted."

Incomplete. Modern JVMs commonly use both interpretation and JIT compilation.

### "Java is 100% platform independent."

Too absolute. Bytecode portability is strong, but native dependencies and platform-specific assumptions can break application portability.

### "JDK is only a compiler."

No. It includes many tools and runtime components.

### "Java passes objects by reference."

No. Java is pass-by-value; object references are passed by value.

### "Garbage collection immediately deletes unused objects."

No. An unreachable object becomes eligible for collection; timing is JVM/collector dependent.

### "`==` compares String contents."

No. Use `.equals()` for String content comparison.

### "Every Java variable physically lives on the stack."

No. Exact memory layout is JVM implementation-specific.

### "Every application should use inheritance heavily."

No. Composition is often a useful alternative.

---

# 177. Java Learning Roadmap

A practical order:

```text
1. Syntax
2. Variables / data types
3. Operators
4. Input / output
5. Conditions
6. Loops
7. Methods
8. Arrays
9. Strings
10. OOP
11. Exception handling
12. File handling
13. Collections
14. Generics
15. Date/time
16. Lambdas
17. Streams
18. Functional interfaces
19. Threads
20. Concurrency
21. JDBC / SQL
22. HTTP / REST
23. Testing
24. Maven / Gradle
25. Git
26. Spring / backend frameworks
27. Deployment / cloud
```

---

# 178. Java for DSA

Important Java areas for DSA:

```text
Arrays
Strings
ArrayList
LinkedList
Deque
Queue
PriorityQueue
HashMap
HashSet
TreeMap
TreeSet
Generics
Comparable
Comparator
Recursion
Sorting
Searching
Trees
Graphs
Heaps
Dynamic Programming
```

Also learn:

```text
Time complexity
Space complexity
Big-O
Best / average / worst case
```

---

# 179. Java for Backend Development

A strong backend path can include:

```text
Core Java
OOP
Collections
Generics
Exceptions
Streams
Concurrency
HTTP
REST
JSON
JDBC
SQL
JPA/Hibernate
Spring Boot
Spring Security
Testing
Maven/Gradle
Git
Docker
Cloud
```

---

# 180. Java + Python

Java and Python can complement each other.

Typical split in many workflows:

```text
Python
├── Data Science
├── AI / ML
├── experimentation
└── notebooks

Java
├── Backend
├── Enterprise systems
├── APIs
├── JVM applications
└── large production services
```

The right division depends on the project.

---

# 181. Official References

Use primary documentation when a Java behavior/version detail matters.

- Java SE documentation: https://docs.oracle.com/en/java/javase/
- Java SE specifications: https://docs.oracle.com/javase/specs/
- Java Language Specification: https://docs.oracle.com/en/java/javase/27/docs/specs/jls/
- Java Virtual Machine Specification: https://docs.oracle.com/en/java/javase/27/docs/specs/jvms/
- Java SE API documentation: https://docs.oracle.com/en/java/javase/27/docs/api/
- JDK tool specifications: https://docs.oracle.com/en/java/javase/27/docs/specs/man/
- Official Java learning portal: https://dev.java/
- OpenJDK: https://openjdk.org/
- Oracle Java downloads: https://www.oracle.com/java/technologies/downloads/
- Java release notes: https://www.oracle.com/java/technologies/javase/jdk-relnotes-index.html

---

# 182. Final One-Page Revision

```text
JAVA
│
├── LANGUAGE
│   ├── Static typing
│   ├── OOP
│   ├── Generics
│   ├── Exceptions
│   ├── Lambdas
│   ├── Streams
│   └── Concurrency
│
├── JAVA PLATFORM
│   ├── Java SE
│   ├── JDK
│   ├── JVM
│   └── Runtime libraries
│
├── COMPILATION
│   ├── .java
│   ├── javac
│   └── .class
│
├── EXECUTION
│   ├── Class Loader
│   ├── Verification / Linking
│   ├── Interpreter
│   └── JIT
│
├── MEMORY
│   ├── Heap
│   ├── JVM Stack
│   ├── Method Area
│   ├── Constant Pool
│   └── Native memory
│
├── OOP
│   ├── Encapsulation
│   ├── Inheritance
│   ├── Polymorphism
│   └── Abstraction
│
├── COLLECTIONS
│   ├── List
│   ├── Set
│   ├── Queue / Deque
│   └── Map
│
├── MODERN JAVA
│   ├── Records
│   ├── Sealed types
│   ├── Pattern matching
│   ├── Lambdas
│   ├── Streams
│   └── Virtual threads
│
├── TOOLS
│   ├── javac
│   ├── java
│   ├── jar
│   ├── jshell
│   ├── javap
│   ├── javadoc
│   ├── jdeps
│   ├── jlink
│   └── jpackage
│
└── ECOSYSTEM
    ├── Maven / Gradle
    ├── JUnit
    ├── JDBC
    ├── Spring
    ├── Docker
    └── Cloud
```

> **Core idea to remember:**
>
> Java source is compiled into JVM bytecode. A platform-specific JVM loads, verifies, and executes that bytecode, using interpretation and/or JIT compilation. The JDK supplies the compiler, runtime, and developer tools around that platform.
