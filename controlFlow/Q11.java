import java.util.Scanner;
public class Q11 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum1=0;
        int sum2= n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum1+=i;
        }
        if(sum1==sum2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    }

