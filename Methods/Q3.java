package Methods;

import java.util.Scanner;

public class Q3 {
    public static int getSum(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n for sum");
        int n= sc.nextInt();
        System.out.println(getSum(n));
    }
}
