import java.util.Scanner;
public class Q30 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("enter number to find it is harshad or not");
        int n= sc.nextInt();
	int s=n;
	int sum=0;
	while(n>0){
	sum+=(n%10);
	n=n/10;
}
	if(s%sum==0){
	System.out.println("Harshad number");
}	else{
	System.out.println("Not a Harshad number");
}	
}		
}