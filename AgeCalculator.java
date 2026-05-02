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

        // 1. Check month validity
        if (bmonth < 1 || bmonth > 12) {
            System.out.println("Invalid month!");
        }

        // 2. Check day validity
        else if (bday < 1 || 
            (bmonth == 2 && bday > 29) ||
            ((bmonth == 4 || bmonth == 6 || bmonth == 9 || bmonth == 11) && bday > 30) ||
            ((bmonth == 1 || bmonth == 3 || bmonth == 5 || bmonth == 7 || 
              bmonth == 8 || bmonth == 10 || bmonth == 12) && bday > 31)) {

            System.out.println("Invalid day for given month!");
        }

        // 3. Leap year check
        else if (bmonth == 2 && bday == 29) {
            if (!(byear % 4 == 0 && (byear % 100 != 0 || byear % 400 == 0))) {
                System.out.println("Invalid date! Not a leap year.");
            } else {
                calculateAge(byear, bmonth, bday, cyear, cmonth, cday);
            }
        }

        // 4. Normal case
        else {
            calculateAge(byear, bmonth, bday, cyear, cmonth, cday);
        }

        sc.close();
    }

    // Function to calculate age + voting eligibility
    public static void calculateAge(int byear, int bmonth, int bday,
                                    int cyear, int cmonth, int cday) {

        // Future date check
        if (byear > cyear || 
            (byear == cyear && bmonth > cmonth) || 
            (byear == cyear && bmonth == cmonth && bday > cday)) {

            System.out.println("Invalid Date of Birth! Age cannot be negative.");
            return;
        }

        int age = cyear - byear;

        // Adjust age
        if (cmonth < bmonth || (cmonth == bmonth && cday < bday)) {
            age--;
        }

        System.out.println("Your age is: " + age);

        // Voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}