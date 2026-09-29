package OOPs.A3_OverloadedConstructors;

public class User {
    
    String username;
    String email;
    int age;
    
    // Constructor with 1 parameters
    User (String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }
    
    // Constructor with 2 parameters
    User (String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    
    // Constructor with all parameters
    User (String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
    
    // Constructor with 0 parameters
    User () {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }
    
}
