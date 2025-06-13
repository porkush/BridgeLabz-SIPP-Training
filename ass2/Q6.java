import java.util.*;
class Q6
{
   public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	double km= sc.nextDouble();
	double miles=(km/1.6);
	System.out.printf("The total miles is %.1f mile for the given %.1f km",km,miles);
} 
}