import java.util.*;
class Q23
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 double num1= sc.nextDouble();
	 double num2= sc.nextDouble();
	double num3=num1;
		num1=num2;
		num2=num3;
	 System.out.printf("> The swapped numbers are %f and %f", num1, num2);
}
}