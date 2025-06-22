package Methods;

import java.util.Scanner;

public class Q5 {
    public static int [] findQuotientReminder(int n, int q){
        int quotient= n/q;
        int remainder= n%q;
        return new int []  {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number and divisor");
        int n= sc.nextInt();
        int q= sc.nextInt();
        int arr[]= findQuotientReminder(n, q);
        int remainder= arr[1];
        int quotient= arr[0];
        System.out.print("Remainder" + arr[1] + " \n quotient" + arr[0] );
    }
    
}
