/*
==================== BREAK & CONTINUE ====================

BREAK:
- Immediately terminates the loop.
- Execution continues after the loop.

CONTINUE:
- Skips the current iteration.
- Execution continues with the next iteration.

Example:
break    -> STOP the loop
continue -> SKIP current iteration

==========================================================
*/
package A1_JavaBasics;

public class B6_BreakandContinue {
    public static void main(String[] args) {
        System.out.println("BREAK & CONTINUE\n");


        // break
        for (int i = 1; i < 11; i++) {
            
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n\n");
        
        // continue
        for (int i = 1; i < 11; i++) {

            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
