import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int temp=n;
    int digit=0;
    int digitCount[]= new int[10];
    while(temp>0){
        digit++;
        temp/=10;
    }
    int digits[]= new int [digit];
    for(int i=0;i<digit;i++) {
        digits[i]=n%10;
        n/=10;
    }
    for(int i=0;i<digit;i++){
        digitCount[digits[i]]++;

    }
        
      System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCount[i] + " times");
            }
        }

    }

    }
    

