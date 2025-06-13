import java.util.*;
class Q8
{
   public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int cp=129;
	int sp=191;
	if(sp>cp){
	int profit= sp-cp;
	double percentage= ((double) profit/cp) *100;
	System.out.printf("The Cost Price is INR %d and the Selling Price is INR %d \n" +
"The Profit is INR %d and the Profit Percentage is %.2f",cp,sp,profit,percentage);
	}
	else{
	int loss= cp-sp;
	double percentage= ((double) loss/cp) *100;
	System.out.printf("The Cost Price is INR %d and the Selling Price is INR %d \n" +
 	"The Loss is INR %d and the Profit Percentage is %.2f",cp,sp,loss,percentage);
}
} 
}
