import java.util.Scanner;

public class _03_Leap_Years {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a year:");
          int year = sc.nextInt();

          // If year is divisible by 4 and not by 100, it’s a leap year.
          // If year is divisible by 400, it’s also a leap year (even if it’s divisible by 100).

          if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
               System.out.println(year + " is a leap year");
          } else {
               System.out.println(year + " is not a leap year");
          }
          
          sc.close();
     }
}
