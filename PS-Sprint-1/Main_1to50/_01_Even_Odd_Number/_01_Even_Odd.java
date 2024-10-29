import java.util.Scanner;

public class _01_Even_Odd {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter a number to check Even or Odd: ");
          int Number = sc.nextInt();

          if (Number % 2==0 ) {
               System.out.println("The number is Even");
          } else {
               System.out.println("The number is Odd");
          }

     }

}
