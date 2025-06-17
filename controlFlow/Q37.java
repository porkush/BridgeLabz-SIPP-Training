import java.util.Scanner;

public class Q37{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n= sc.nextInt();
	int s=n;
	int sum=0;
	while(n>0){
	int digit= n%10;
	sum+=Math.pow(digit,3);
	n/=10;
}
	System.out.println(sum==s?"Armstrong number":"not Armstrong number");
       }
}
