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

        // Validation (important)
        if (byear > cyear || 
           (byear == cyear && bmonth > cmonth) || 
           (byear == cyear && bmonth == cmonth && bday > cday)) {

            System.out.println("Invalid Date of Birth! Age cannot be negative.");

        } else {

            int age = cyear - byear;

            if (cmonth < bmonth || (cmonth == bmonth && cday < bday)) {
                age--;
            }

            System.out.println("Your age is: " + age);
        }

        sc.close();
    }
}
