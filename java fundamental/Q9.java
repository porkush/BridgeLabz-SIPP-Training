import java.util.*;
class Q9
{
   public static void main(String args[])
{
	int fee= 125000;
	double discountPercent= 10;
	double discount= (discountPercent*fee)/100;
	double fees= fee-discount;
	System.out.printf(" The discount amount is INR %.1f and final discounted fee is INR %.1f",discount,fees);
} 
}