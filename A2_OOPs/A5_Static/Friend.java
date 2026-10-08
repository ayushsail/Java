package A2_OOPs.A5_Static;

public class Friend {

    // Static int variable - belong to the class "Friend", rather any specific object
    //                     - Ownership of static variable is given to class,
    //                       and all objects have access to it.
    static int numOfFriend;

    String name;

    Friend (String name) {
        this.name = name;
        numOfFriend++;
    }

    static void showFriends() {
        System.out.println("Number of Friends : " +numOfFriend);
    }
} 
