import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;


public class Problem2 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy MM dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date (yyyy mm dd):");
        LocalDate date1 =LocalDate.parse(sc.next() + " " + sc.next() + " " + sc.next(), format) ;
        System.out.println("Enter second date (yyyy mm dd):");

        LocalDate date2  = LocalDate.parse(sc.next() + " " + sc.next() + " " + sc.next(), format);
        if (date1.isBefore(date2)) {
            System.out.println("Enter valid input first date > second date");
            return;
        }
        System.out.println("Days between: " + DAYS.between(date1, date2) * -1 + " days");
    }
}
