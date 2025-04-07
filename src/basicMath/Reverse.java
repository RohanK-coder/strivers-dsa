package basicMath;

import java.util.Scanner;

public class Reverse {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number to reverse : ");
            int number = sc.nextInt();
            System.out.println("Reversed : "+reverse(number));
            sc.close();
      }

      public static int reverse(int n){
            int reversed = 0;
            while(n!=0){
                  reversed = reversed*10+(n%10);
                  n/=10;
            }
            return reversed;
      }
}
