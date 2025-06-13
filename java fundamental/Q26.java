import java.util.*;
class Q26
{
    public static void main (String []args){
	Scanner sc= new Scanner(System.in);
	 int n = sc.nextInt();
	 int m= sc.nextInt();
	 int cc= n/m;
	int cl= n%m;
	 System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d", cc, cl);
}
}