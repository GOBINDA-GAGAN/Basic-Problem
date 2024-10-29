import java.util.Scanner;

public class _05_Fibonacci_Series {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a Number:");
          int num = sc.nextInt();
          int a = 0, b = 1, c;

          while (a <= num) {
               System.out.print(a + " ");
               
               c = a + b;
               a = b;
               b = c;
          }

          sc.close();
     }
}
