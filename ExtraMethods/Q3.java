package ExtraMethods;

import java.util.Scanner;

public class Q3 {
    public static String primeCheck(int n){
        if(n==1 || n==2){
            return "prime";
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return "not prime";
            }
        }
        return "prime";
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to check");
        int n= sc.nextInt();
        System.out.println(primeCheck(n));
    }
}
