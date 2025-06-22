package Methods;

import java.util.Scanner;

public class Q2 {
    public static int maxHand(int n){
        return (n*(n-1))/2;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of students");
        int n= sc.nextInt();
        System.out.println(maxHand(n));
    }
}
