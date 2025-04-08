package basicMath;

import java.util.Scanner;

public class Armstrong {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number to check for Armstrong : ");
            int n = sc.nextInt();
            sc.close();
            if(n==getArmstrong(n)){
                  System.out.println("Armstrong Number");
            }
            else{
                  System.out.println("Not Armstrong Number");
            }
      }
      public static int getArmstrong(int number){
            int digits = (int) Math.log10(number)+1;
            System.out.println("Number of digits are : "+digits);
            int sum = 0;

            while(number!=0){
                  sum+=Math.pow(number%10, digits);
                  number/=10;
            }
            return sum;
      }
}
