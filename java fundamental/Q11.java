import java.util.*;
class Q11
{
   public static void main(String args[])
{
 	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	int r1= a+b*c;
	int r2=c+a/b;
	int r3= a%b+c;
	System.out.printf("The results of Int Operations are %d, %d, and %d", r1,r2,r3);
} 
}