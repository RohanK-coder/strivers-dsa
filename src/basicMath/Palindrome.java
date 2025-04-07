package basicMath;
import java.util.*;
public class Palindrome {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number to check for palindrome : ");
            int number = sc.nextInt();
            int reversed = Reverse.reverse(number);
            if(reversed==number){
                  System.out.println("Palindrome");
            }
            else{
                  System.out.println("Not Palindriome");
            }
            sc.close();

      }

}
