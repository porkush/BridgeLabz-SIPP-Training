
package Methods;
import java.util.Scanner;


public class Q6 {

          public static int input(){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter your number for factorial");
            int str = sc.nextInt();
            return str;
        }
    
        public static long factorial(int n){
            if(n==0||n==1){
                return 1;
            }
            else{
                return n*factorial(n-1);
            }
        }
        public static void displayOutput() {
            int num= input();
            long result= factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    
        public static void main (String []args){
            displayOutput();
        }
    }
    



