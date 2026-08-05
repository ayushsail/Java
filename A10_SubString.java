/*
====================== SUBSTRINGS ======================

Definition:- A substring is a part of a String.

Methods:
str.substring(beginIndex)
str.substring(beginIndex, endIndex)

Rules:
- beginIndex : Inclusive
- endIndex   : Exclusive

Important Notes:
- Index starts from 0.
- Original String remains unchanged.
- Invalid indexes throw "StringIndexOutOfBoundsException" Error.

========================================================
*/

import java.util.Scanner;
public class A10_SubString {
    public static void main(String[] args) {
        System.out.println("SUBSTRING\n");

        String mainstring = "broCode123@gmail.com";
        System.out.printf("Main String : %s\n\n",mainstring);

        System.out.println("username : " +mainstring.substring(0,10));
        System.out.println("symbol : " +mainstring.substring(10,11));
        System.out.println("domain : " +mainstring.substring(11)+"\n\n");
        
        

        // making this process universal for any input by using "IndexOf" method
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = s.nextLine();

        if (email.contains("@")) {
            System.out.println("username : " +email.substring(0,email.indexOf("@")));
            System.out.println("symbol : " +email.substring(email.indexOf("@"),email.indexOf("@")+1));
            System.out.println("domain : " +email.substring(email.indexOf("@")+1)+"\n\n");
        }
        else {
            System.out.println("E-mails must contains '@' symbol !!");
        }

        s.close();
    }   
}