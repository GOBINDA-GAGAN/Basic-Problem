import java.util.Scanner;

public class _04_Armstrong_Numbers {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int rem, arm = 0;
          int c;

          System.out.println("Enter your Number");
          int numb = sc.nextInt();
          c = numb;
          while (numb > 0) {

               rem = numb % 10;
               arm = (rem * rem * rem)+arm;
               numb = numb / 10;

          }
          if (c==arm) {
               System.out.println("Armstrong numbers");
          } else {
               System.out.println(" not Armstrong number");
          }

     }

}
