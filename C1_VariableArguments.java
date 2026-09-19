/*
========================= VARARGS =========================

Definition:
- Varargs allow a method to accept a varying number of arguments.
- Java packs all arguments into an array.
- then we can perform operation on the array.
- Uses the ellipsis (...).

Syntax:
returnType methodName(dataType... ArrayName) {
    // code
}

Example:
static int add(int... numbers) {
    int total = 0;
    for (int number : numbers)
        total += number;
    return total;
}

Usage:
add(1, 2, 3);
add(1, 2, 3, 4, 5);

Important:
- Varargs parameter must be the LAST parameter.
- Inside the method, varargs behaves like an array.
- Useful when the number of arguments is unknown.
- Reduces the need for method overloading.

============================================================
*/

public class C1_VariableArguments {
    public static void main(String[] args) {
        System.out.println("VARIABLE ARGUMENTS (varargs)\n");

        System.out.println("Total sum : " +add(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Average : " +average(3,4));
    }

    // this method can take varying numbers of arguments.
    // Pack all the arguments into an Array.
    // We can perform operation on this array.

    static int add(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    static double average(double... numbers) {
        double average = 0;

        if (numbers.length == 0) { return 0; }

        for (double number : numbers) {
            average += number;
        }

        return average / numbers.length;
    }
}