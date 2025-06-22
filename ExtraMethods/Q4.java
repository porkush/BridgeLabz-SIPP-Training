package ExtraMethods;

import java.util.Scanner;

class Q4{

    public static void fibonacciGen(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int first=0;
        int second=1;
        int count=0;

        while (count<n) {
            System.out.println(first);
            int temp=first+ second;
            first= second;
            second=temp; 
            count++;
        }
    }
    public static void main(String[] args) {
        fibonacciGen();
    }
}