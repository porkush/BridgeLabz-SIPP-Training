package Methods;

import java.util.Scanner;

public class Q4 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int largest= (number1>=number2 && number1>=number3?number1:
        number2>=number1&& number2>=number3?number2:number3);
         int smallest= (number1<=number2 && number1<=number3?number1:
        number2<=number1&& number2<=number3?number2:number3);
        return new int[] {largest, smallest};
    }
    
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers");
        int n= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int arr[] =findSmallestAndLargest(n, n2, n3);
        int largest= arr[0];
        int smallest= arr[1];
        System.out.println("largest= " + largest + "\n smallest " + smallest) ;
    }
}
