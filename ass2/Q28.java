import java.util.*;
class Q28
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 double pounds= sc.nextDouble();
	 double kilograms= pounds/2.2;
	 System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f", pounds, kilograms);
}
}