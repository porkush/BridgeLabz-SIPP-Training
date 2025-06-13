import java.util.*;
class Q13
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	double a= sc.nextDouble();
	double b= sc.nextDouble();
	double Quotient= a/b;
	double Reminder= a%b;
	System.out.printf("The Quotient is %.2f and Reminder is %.2f of two number %.2f and %.2f", Quotient,Reminder,a,b);

}
}