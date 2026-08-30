/*
========================== METHODS ==========================

- A method is a reusable block of code executed when called.

Syntax:
returnType methodName(parameters) {
    // code
}

- static -> can be called directly from another static method.
- void -> method does not return a value.
- returnType -> datatype of the returned value, method which does return a value.
- parameters -> input values passed to the method.

------------------------------------------------------------
METHOD OVERLOADING
------------------------------------------------------------

- Multiple methods can have the same name but different
  parameters.

Example:
static int add(int a, int b)       { return a + b; }
static double add(double a, double b) { return a + b; }
static int add(int a, int b, int c) { return a + b + c; }

Rules:
- Parameters must differ in number, type, or order.
- Return type alone cannot overload a method.
- Java decides which method to call based on arguments.

============================================================
*/

public class B7_Methods {
    public static void main(String[] args) {
        System.out.println("METHODS\n");

        happyBirthday("SpongeBob", 19);
        happyBirthday("Patrik", 3);
        happyBirthday("Squidward ", 45);


        System.out.printf("Square of 5 is %.2f\n",square(5));
        System.out.printf("Square of 3.142 is %.2f\n\n",square(3.142));
        
        System.out.printf("Cube of 5 is %.2f\n",cube(5));
        System.out.printf("Cube of 3.142 is %.2f\n\n",cube(3.142));

        String fullName = getFullName("Ayush","Sail" );
        System.out.printf("My full name is %s \n\n",fullName);

        int age = 19;
        System.out.printf("Age check : %b\n\n", ageCheck(age));
        
    }

    
    // since this method is called in another static method(static void main),
    // thus static keyword is used before this method.
    static void happyBirthday (String name, int age) {      
        System.out.printf("Happy Birthday to you !!!\n");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("You are %d year old\n", age);
        System.out.printf("Happy Birthday to you !!!\n\n");
    }

    // a method which return some data, 
    // should include the returntype of the method
    static double square (double n) { return n*n; }
    static double cube (double n) { return n*n*n; }
    static String getFullName (String first, String last) { return first + " " + last; }
    static boolean ageCheck (int age) { return age >=18; }



}
