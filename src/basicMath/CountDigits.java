package basicMath;

// Q - Count the number of digits in a number that divides the number perfectly

import java.util.*;

public class CountDigits {


      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number to check : ");
            int number = sc.nextInt();
            System.out.println("The answer is : "+countDigits(number));
            sc.close();
      }

      public static int countDigits(int n){
            int temp=n;
            int count=0;
            while(temp!=0){
                if(n%((temp%10))==0){
                  count++;
                  temp/=10;
                }  
            }
            return count;
      }
}
