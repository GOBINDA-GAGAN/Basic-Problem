import java.util.Scanner;

public class _06_palindrom_string {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print(" Enter a String:");
          String string = sc.next();
          int i = 0;
          int j = string.length() - 1;
          int flag = 0;
          
          while (i < j && flag == 0) {
               if (string.charAt(i) != string.charAt(j)) {
                    flag = 1;
                    break;
               }
               i = i + 1;
               j = j - 1;
          }
          if (flag == 0) {
               System.out.println("palindrome");

          } else {
               System.out.println("not palindrome");

          }
          sc.close();

     }

}
