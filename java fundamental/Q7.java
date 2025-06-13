import java.util.*;
class Q6
{
   public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	double volume= ((4.0/3.0)*(3.16)*Math.pow(6378,3));
	double miles=(volume/Math.pow(1.6,3));
	System.out.printf("The volume of earth in cubic kilometers is %.1f and cubic miles is %.1f",volume,miles);
} 
}