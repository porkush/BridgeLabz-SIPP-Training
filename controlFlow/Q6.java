import java.util.*;
class Q6
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int sum1=0;
	int sum2= n*(n+1)/2;
	while(n>0){
	sum1+=n;
	n--;	
		}
	if(sum1==sum2){
	System.out.println("true");
		}
	else{
	System.out.println("false");
	}
}
}