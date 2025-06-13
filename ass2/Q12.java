import java.util.*;
class Q11
{
   public static void main(String args[])
{
 	Scanner sc = new Scanner(System.in);
	double a= sc.nextDouble();
	double b= sc.nextDouble();
	double c= sc.nextDouble();
	double r1=  a+b*c;
	double r2=  c+a/b;
	double r3=  a%b+c;
	System.out.printf("The results of double Operations are %.2f, %.2f, and %.2f", r1,r2,r3);
} 
}