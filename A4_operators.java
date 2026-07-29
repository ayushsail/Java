public class A4_operators {
    public static void main(String[] args) {
        System.out.println("OPERATORS\n");
        
        int a = 10;
        int b = 2;
        int c;


        // 1. ARITHMETIC OPERATION
        System.out.println("\n1. ARITHMETIC OPERATION\n");
        c = a + b;
        System.out.println(a+ " + " +b+ " = " +c);
        c = a - b;
        System.out.println(a+ " - " +b+ " = " +c);
        c = a * b;
        System.out.println(a+ " * " +b+ " = " +c);
        c = a / b;
        System.out.println(a+ " / " +b+ " = " +c);
        c = a % b;
        System.out.println(a+ " % " +b+ " = " +c);
        
        
        // 2. AUGMENTED ASSIGNMENT OPERATION
        System.out.println("\n2. AUGMENTED ASSIGNMENT OPERATION\n");
        
        a += b;     // a = a + b
        System.out.println(a);
        a -= b;     // a = a - b
        System.out.println(a);
        a *= b;     // a = a * b
        System.out.println(a);
        a /= b;     // a = a / b
        System.out.println(a);
        a %= b;     // a = a % b
        System.out.println(a);
        
        
        // 3. INCREMENT/DECREMENT OPERATION
        System.out.println("\n3. INCREMENT/DECREMENT OPERATION\n");
        int x = 1;
        x++;        // x = x + 1
        System.out.println(x);
        x--;        // x = x - 1
        System.out.println(x);


        // 4. ORDER OF OPERATION [P-E-M-D-A-S]
        System.out.println("\n4. ORDER OF OPERATION [P-E-M-D-A-S]\n");
        /*
        P - Parenthesis
        E - Exponents
        M - Multiplication
        D - Division
        A - Addition
        S - Subtraction
        
        // Please Excuse My Dope Ass Swag (P-E-M-D-A-S)
        */

        double result = 7 - 4 * (7 - 5) / 2.0;
        System.out.println("7 - 4 * (7 - 5) / 2.0 = "+result);









    }

}
