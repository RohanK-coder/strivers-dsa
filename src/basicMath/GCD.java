package basicMath;

public class GCD {
      public static void main(String[] args) {
            int n1 = 185;
            int n2 = 95;
            int gcd = 1;
            for(int i=1;i<Math.max(n1, n2);i++){
                  if(n1%i==0&&n2%i==0){
                        gcd = i;
                  }
            }
            System.out.println("GCD is : "+gcd);
      }
}
