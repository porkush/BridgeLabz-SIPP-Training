import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to reverse");
        int n= sc.nextInt();
        int m=n;
        int index=0;
          while (n>0) {
            n/=10;
            index++;
                }
        int []digit= new int[index];
        for(int i=0;i<index;i++){
            digit[i]=m%10;
            m/=10;   
        }
        for(int ele:digit){
            System.out.print(ele);
        }
    }
}

