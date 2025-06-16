import java.util.*;
class Q3
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sum=0;
	while(true){
	System.out.println("enter number");
	int n= sc.nextInt();
	if(n!=0 || n>0){
	sum+=n;
	}
	else{
	System.out.println("total sum" + sum);
	break;
}
}
}
}