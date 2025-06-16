import java.util.*;
class Q8
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double sum =0.0;
	while(true){
	System.out.println("enter number");
	double n= sc.nextDouble();
	if(n!=0){
	sum+=n;
	}
	else{
	System.out.println("total sum" + sum);
	break;
}
}
}
}