import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int byear, bmonth, bday;
        int cyear, cmonth, cday;

        System.out.print("Enter birth year: ");
        byear = sc.nextInt();

        System.out.print("Enter birth month: ");
        bmonth = sc.nextInt();

        System.out.print("Enter birth day: ");
        bday = sc.nextInt();

        System.out.print("Enter current year: ");
        cyear = sc.nextInt();

        System.out.print("Enter current month: ");
        cmonth = sc.nextInt();

        System.out.print("Enter current day: ");
        cday = sc.nextInt();

        // Check invalid month/day
        if (bmonth < 1 || bmonth > 12 || bday < 1 || bday > 31) {
            System.out.println("Invalid Date! Please enter correct day and month.");
        }

        // Check future date
        else if (byear > cyear || 
                (byear == cyear && bmonth > cmonth) || 
                (byear == cyear && bmonth == cmonth && bday > cday)) {

            System.out.println("Invalid Date of Birth! Age cannot be negative.");
        }

        else {
            int age = cyear - byear;

            // Adjust if birthday not yet happened this year
            if (cmonth < bmonth || (cmonth == bmonth && cday < bday)) {
                age--;
            }

            System.out.println("Your age is: " + age);
        }

        sc.close();
    }
}
