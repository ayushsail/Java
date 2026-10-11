# Java Learning Repository ☕

A hands-on repository documenting my journey of learning **Java**. It contains topic-wise examples, concise notes, practice exercises, and small projects that help me understand Java concepts by writing and testing code.

The repository is organized in the order I am learning the topics, from basic syntax and object-oriented programming to file handling, collections, scheduling, generics, and concurrency.

## 📚 Topics Covered

- **Java Basics** — variables, input, operators, conditionals, loops, methods, arrays, strings, and formatting.
- **Object-Oriented Programming (OOP)** — objects, constructors, inheritance, method overriding, abstraction, interfaces, polymorphism, getters/setters, aggregation, composition, anonymous classes, and enums.
- **Wrapper Classes** — autoboxing, unboxing, parsing, and utility methods.
- **Collections** — `ArrayList` and `HashMap`.
- **Exception Handling** — `try`, `catch`, `finally`, try-with-resources, and common exceptions.
- **File Handling** — writing and reading text and binary files using classes such as `FileWriter`, `BufferedWriter`, `PrintWriter`, `FileOutputStream`, `FileReader`, `BufferedReader`, `FileInputStream`, and `RandomAccessFile`.
- **Date and Time** — `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, and `DateTimeFormatter`.
- **Scheduling** — `Timer`, `TimerTask`, and countdown-related practice.
- **Generics** — generic classes and type parameters.
- **Concurrency** — creating threads with `Thread` and `Runnable`, daemon threads, sleeping, and coordinating threads with `join()`.
- **Exercises** — small console programs for applying concepts.
- **Projects** — practical Java programs that combine multiple topics.

> This is a learning repository, so the examples and project implementations may evolve as I learn more.

## 🗂️ Repository Structure

```text
Java/
├── 0_Java.md                 # Java reference notes
├── 0_shortcuts.md            # Useful shortcuts
├── practice.java             # General practice file
├── .vscode/                  # VS Code settings
│
├── A1_JavaBasics/            # Core Java syntax and fundamentals
├── A2_OOPs/                  # Object-oriented programming examples
├── A3_WrapperClasses/        # Primitive wrapper classes
├── A4_Collections/           # ArrayList, HashMap, and collections practice
├── A5_ExceptionHandling/     # Exception handling examples
├── A6_FileHandling/          # Text and binary file I/O
├── A7_DateTime/              # Date and time API
├── A8_Scheduling/            # Timer tasks and countdown timer
├── A9_Generics/              # Generic classes and type parameters
│
├── B1_Concurrency/
│   ├── A1_Threading/         # Thread and Runnable
│   └── A2_MultiThreading/    # Multiple threads and join()
│
├── Z1_Exercises/             # Practice programs
└── Z2_Projects/              # Larger beginner projects
    ├── Z1_MusicPlayer.java
    ├── Z2_Hangman.java
    ├── Z3_AlarmClock.java
    ├── words.txt
    └── songs/                # Audio files used by the music player
```

## ⚙️ Requirements

- **JDK 17 or newer** is recommended for the examples in this repository.
- A code editor or IDE. I use **Visual Studio Code**.
- A terminal for compiling and running Java programs.

Check your Java installation:

```bash
java --version
javac --version
```

## ▶️ Running the Programs

### Simple Java class

For a standalone class without a package declaration, open a terminal in its directory and run:

```bash
javac Main.java
java Main
```

### Classes that use packages

Many examples are organized into packages and may contain multiple related `.java` files. Compile the related files together, placing compiled output in a separate directory. Then launch the class by its fully qualified package name.

Conceptual example:

```bash
javac -d out path/to/package/*.java
java -cp out package.name.Main
```

The exact paths and package name depend on the example. In VS Code, you can also open the relevant source file and use the Java extensions to run or debug it.

## 📝 Learning Approach

- Keep examples small and focused on one concept at a time.
- Add concise notes directly to the source files.
- Practise the concept with a separate exercise.
- Combine concepts into projects once the basics are clear.
- Improve earlier code as my understanding grows.

## 🧭 What I Plan to Learn Next

The next steps after this stage of Core Java are:

1. Strengthen Java fundamentals through project work.
2. Learn SQL and database connectivity with JDBC.
3. Learn Maven or Gradle for dependency management and builds.
4. Learn HTTP, REST APIs, and JSON.
5. Build Java web applications with Spring Boot.
6. Add testing, Git/GitHub workflows, and deployment.

## 🎯 Goal

Build a strong foundation in Java and use it to create practical applications, then progress toward backend and full-stack development.

---
*Built with passion by [Ayush Sail](https://github.com/ayushsail)*
