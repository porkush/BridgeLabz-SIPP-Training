import java.util.*;
class Q14
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 int feet= sc.nextInt();
	 double total_Yards= (double) feet/3;
	 double miles= total_Yards/1760;
	 System.out.printf("The distance in yards is %f while the distance in miles is %f", total_Yards, miles);
}
}