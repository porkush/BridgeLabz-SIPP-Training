import java.util.*;
import java.math.BigInteger;
class Q5
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	BigInteger fact= BigInteger.ONE;
	if(n>0){
	while(n>0){
	fact= fact.multiply(BigInteger.valueOf(n));
	n--;
}
}
	System.out.println("factorial is? " + fact);
}
}