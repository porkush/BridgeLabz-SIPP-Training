import java.util.*;
class Q4
{
   public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int fee= sc.nextInt();
	double discountPercent= sc.nextDouble();
	double discount= (discountPercent*fee)/100;
	double fees= fee-discount;
	System.out.printf(" The discount amount is INR %.1f and final discounted fee is INR %.1f",discount,fees);
} 
}