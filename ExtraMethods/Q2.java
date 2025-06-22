package ExtraMethods;

import java.util.Scanner;

public class Q2 {
    public static int[] input(){
        System.out.println("enter three different numbers");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        return new int[] {a, b, c};
    }
    public static void findMaximum(){
        int nums[]= input();
        int a=nums[0];
        int b=nums[1];
        int c= nums[2] ;
        System.out.println(a>=b&&a>=c?a:b>=a&&b>=c?b:c);
    }
    public static void main(String[] args) {
        findMaximum();
    }
}
