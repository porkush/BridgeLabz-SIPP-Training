import java.util.Scanner;
public class Q33 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to check Abundant");
        int n= sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++){
	if(n%i==0){
	sum+=i;	
	}
	}
	System.out.println(sum>n?"yes abundant number":"no"); 
}
}
