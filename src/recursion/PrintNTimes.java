package recursion;

import java.util.Scanner;

public class PrintNTimes {
    static int count=0;
    static int number=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        print();

    }
    static void print(){
        if(count==number){
            return;
        }
        else{
            count++;
            System.out.print("Rohan");

            print();
        }
    }

}
