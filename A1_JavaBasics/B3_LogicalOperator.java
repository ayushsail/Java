/*
==================== Logical Operator ====================
&&  ->   AND    -> True if both are True
||  ->   OR     -> True if One of the both is True
!   ->   NOT    -> Opposite, True if Flase and vice versa
==========================================================
*/
package A1_JavaBasics;

import java.util.Scanner;
public class B3_LogicalOperator {
    public static void main(String[] args) {
        System.out.println("LOGICAL OPERATOR\n");

        double temp = 20;
        boolean isSunny = true ;

        if (temp < 30 && temp > 0 && isSunny) {
            System.out.println("The whether is good");
            System.out.println("It is sunny outside"); 
        }

        else if (temp < 30 && temp > 0 && !isSunny) {
            System.out.println("The whether is good");
            System.out.println("It is cloudy outside");
        }
        
        else if (temp > 30 || temp < 0) {
            System.out.println("The whether is bad");
        }


        // Username Validation
        Scanner s=new Scanner(System.in);

        System.out.print("Enter your username : ");
        String username = s.nextLine();


        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 - 12 characters  !!");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscore !!");
        }
        else {
            System.out.println("Welcome!!! "+username);
        }
      
        
        s.close();
    }
}
