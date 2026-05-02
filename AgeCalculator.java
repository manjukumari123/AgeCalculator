import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int byear, bmonth, bday;
        int cyear, cmonth, cday;
        
        //Enter all the details 
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

        int age = cyear - byear;

        // adjust if birthday not yet occurred this year
        if (cmonth < bmonth || (cmonth == bmonth && cday < bday)) {
            age--;
        }

        System.out.println("Your age is: " + age);

        sc.close();
    }
}
