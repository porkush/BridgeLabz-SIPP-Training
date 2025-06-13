import java.util.*;
class Q1
{
   public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your height");
	int a= sc.nextInt();
	double totalInches= (a/2.54);
	int feet =(int)(totalInches/12);
	double inches=(totalInches%12);
	System.out.printf("Your Height in cm is %d while in feet is %d and inches is %.2f", a,feet,inches);
}
}