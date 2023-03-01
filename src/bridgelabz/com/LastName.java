package bridgelabz.com;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
    static String fName;
    static String lName;


    static String fname() {
        Scanner sc = new Scanner(System.in);
        /*
         * give user input
         */
        System.out.print("Enter First Name: ");
        fName = sc.next();
        /*
         * check enterd name are math with pattern
         */
        return fName;
    }

    /*
     * last name enter
     */
    static String lname() {
        Scanner sc = new Scanner(System.in);
        /*
         * give user input
         */
        System.out.print("Enter First Name: ");
        fName = sc.next();
        /*
         * check enterd name are math with pattern
         */
        return fName;
    }

    /*
     * Display Output
     */
    static void display(String fName) {

        boolean pattern = Pattern.matches("[A-Z]{1}[a-z]{2}", fName);
        if (pattern == true) {
            System.out.println("'" + fName + "'" + " is a valid Name.");
        } else {
            System.out.println("'" + fName + "'" + " is a not valid Name.");
        }

    }

    public static void main(String[] args) {

        String uFname = fname();
        String uLname = lname();
        System.out.println("First Name :: ");
        display(uFname);
        System.out.println("Last Name :: ");
        display(uLname);
    }
}
