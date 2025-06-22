package ExtraMethods;

import java.util.Scanner;

public class Q7 {
    
          public static int []input(){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter your number for lcm and gcd");
            int a = sc.nextInt();
            int b= sc.nextInt();
            return new int[] {a,b};
        }

        public static int GCD(int a, int b){
                int div=0;
                for(int i=1;i<=Math.min(a,b);i++){
                    if(a%i==0 && b%i==0){
                        div=i;
                        continue;
                    }
                }
                return div;
        }
        
        public static int lcm(int gcd, int a, int b){
                return (a*b)/gcd;
        }

        public static void print(){
            int []arr= input();
            int a= arr[0];
            int b= arr[1];
           int gcd= GCD(a, b);
           int lcm= lcm(gcd, a, b);
           System.out.printf("lcm is %d \n gcd is %d",lcm,gcd);
        }
        public static void main(String[] args) {
            print();
        }
}
